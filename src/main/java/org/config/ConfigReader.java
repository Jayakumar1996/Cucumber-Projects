package org.config;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
	 private Properties properties;

	    public ConfigReader() {
	        properties = new Properties();
	        try (InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties")) {
	            if (input == null) {
	                System.out.println("Sorry, unable to find config.properties");
	                return;
	            }
	            properties.load(input);
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	    }

	    public String getUrl() {
	        return properties.getProperty("url");
	    }

	    public String getUsername() {
	        return properties.getProperty("username");
	    }

	    public String getPassword() {
	        return properties.getProperty("password");
	    }
	    public String getScreenshotPath() {
	        return properties.getProperty("screenshot.path");
	    }
}
