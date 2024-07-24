package baseclass;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	private static Properties properties;
	
	static {
        properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream("src\\test\\resources\\config.properties");
            properties.load(fileInputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String Key) {
        return properties.getProperty(Key);
    }
}
