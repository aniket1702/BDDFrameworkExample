package com.aniket.cucumberTesting.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import com.aniket.cucumberTesting.enums.ConfigProperties;
import com.aniket.cucumberTesting.frameworkconstant.FrameworkConstant;


public final class ConfigReader {
	
	private ConfigReader() {}
	
	private static Properties properties = new Properties();
	private static final Map<String, String> CONFIGMAP = new HashMap<>();

	static {

		try (FileInputStream fis = new FileInputStream(FrameworkConstant.getConfigFilePath())) {

			properties.load(fis);

			for (Map.Entry<Object, Object> entry : properties.entrySet()) {
				CONFIGMAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()).trim());
			}

		} catch (FileNotFoundException ex) {

			ex.printStackTrace();
			System.exit(0);
		} catch (IOException e) {

			e.printStackTrace();
			System.exit(0);
		}
	}

	public static String get(ConfigProperties key) throws Exception {

		if (Objects.isNull(key) || Objects.isNull(CONFIGMAP.get(key.name().toLowerCase()))) {
			throw new Exception("Property name " + key + " is not found. Please check config file.");
		}
		return CONFIGMAP.get(key.name().toLowerCase());
	}


}
