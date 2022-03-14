package code.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReadingUtil {

    private static Properties properties=new Properties();
    //encapsulation, hiding data

    static {
        //will get execute before everything
        //2- get the path and store in String
        String pathForPropertiesFile="configuration.properties";

        //3-  open the file use Fileinputstream method
        //we need to tell compiler to open this file

        try{
            FileInputStream fileInputStream=new FileInputStream(pathForPropertiesFile);
            //4-  load the file to properties object by using load method from properties
            properties.load(fileInputStream);

        }  catch (IOException e) {
            e.printStackTrace();
            System.out.println("Properties File Not founded");
        }



    }

    public static String getProperties(String keyword){
        return properties.getProperty(keyword);
    }




}
