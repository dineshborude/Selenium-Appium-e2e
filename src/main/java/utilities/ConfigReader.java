package utilities;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.io.FileInputStream;

public class ConfigReader {

    private static Properties properties;

    static {
        try {
            FileInputStream fileInputStream = new FileInputStream("src/resources/config.properties");
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Could not load the properties file.");
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

}
