package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesReader {

    private static final Properties properties = new Properties();

    static {
        String PATH_TO_PROPERTY_FILE = "src/main/resources/env.properties";
        try (InputStream inputStream = new FileInputStream(PATH_TO_PROPERTY_FILE)) {
            properties.load(inputStream);
        } catch (IOException e) {
            throw new IllegalArgumentException("Unable to load properties from file.");
        }
    }

    public static String getProperty(String propertyName) {
        return System.getProperty(propertyName, properties.getProperty(propertyName));
    }
}
