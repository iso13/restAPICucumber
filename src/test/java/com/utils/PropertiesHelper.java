package com.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

public class PropertiesHelper {

    /**
     * Reads a properties file located in resources folder base
     * @param fileName: Path and filename to read
     * @return Properties object with read data
     * @throws IOException: For failures due to properties file reading
     *//*
    public static Properties readProperties(String fileName) throws IOException {
        Properties prop = new Properties();

        if (!fileName.toLowerCase().endsWith(".properties"))
            fileName += ".properties";

        InputStream input = PropertiesHelper.class.getResourceAsStream(fileName);
        if (input == null){
            throw new InvalidPropertiesFormatException(String.format("Error reading properties file '%s'", fileName));
        }
        else {
            prop.load(input);
            input.close();
        }
        return prop;
    }*/
}
