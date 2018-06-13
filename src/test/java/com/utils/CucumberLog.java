package com.utils;

import java.util.logging.Logger;

public class CucumberLog {
	private final static Logger logger = Logger.getLogger(CucumberLog.class.getName());


	public static void info(String message) {
		logger.info(message);
	}

	public static void warning(String message) {
		logger.warning(message);
	}

	public static void severe(String message) {
		logger.severe(message);
	}

	public static void config(String message) {
		logger.config(message);
	}
}
