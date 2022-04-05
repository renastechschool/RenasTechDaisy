package students.Kadir.Utils_lab07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationsReader {
    private static Properties properties;

    static {
        try {
            FileInputStream fileInputStream=new FileInputStream("C:\\Users\\loaner\\Desktop\\RenasTechDaisy\\03_SELENIUM\\src\\test\\java\\students\\Kadir\\Configurations.properties");
            properties=new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
        } catch (IOException e) {
            System.out.println("Failed to load Properties");
            e.printStackTrace();
        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
