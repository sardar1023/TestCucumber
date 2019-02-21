package com.jekins.test.lib;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Properties;

public class PropReader {

    String result = "";
    InputStream inputStream = null;
    HashMap<String,String> confg = new HashMap<String, String>();

    public HashMap getValues() throws IOException {
        try {
            Properties prop = new Properties();
            String propFileName = "config.properties";
            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }
            // get the property value and print it out
            String url = prop.getProperty("url");
            String path = prop.getProperty("path");
            String chrome = prop.getProperty("chrome");

            confg.put("url",url);
            confg.put("path",path);
            confg.put("chrome",chrome);

        } catch(Exception e){
            System.out.println("Exception: " + e);
        } finally {
            inputStream.close();
        }
        return confg;
    }
}
