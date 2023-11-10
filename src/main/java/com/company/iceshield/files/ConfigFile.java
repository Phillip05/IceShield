package com.company.iceshield.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFile {
      private Properties properties;
    

    private String configFile = "config.properties";
    
    public ConfigFile() {
        properties = new Properties();
        try {
            FileInputStream fis = new FileInputStream("config.properties");
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    //getter

    public String getmsqlHost() {
        return properties.getProperty("msql.host");
    }

    public String getmsqlPort() {
        return properties.getProperty("msql.port");
    }
    
    public String getmsqlNameDB() {
        return properties.getProperty("msql.nameDB");
    }

    public String getmsqlUser() {
        return properties.getProperty("msql.user");
    }

    public String getmsqlPass() {
        return properties.getProperty("msql.pass");
    }

    
    
    public void setAppHost(String host) {
        properties.setProperty("msql.host", host);
        savePropertiesToFile();
    }
    public void setAppPort(String port) {
        properties.setProperty("msql.port", port);
        savePropertiesToFile();
    }

    public void setAppnameDB(String nameDB) {
        properties.setProperty("msql.nameDB", nameDB);
        savePropertiesToFile();
    }

    public void setAppUser(String user) {
        properties.setProperty("msql.user", user);
        savePropertiesToFile();
    }

    public void setAppPass(String pass) {
        properties.setProperty("msql.pass", pass);
        savePropertiesToFile();
    }

 
    
    
    
    private void savePropertiesToFile() {
        try {
            FileOutputStream fos = new FileOutputStream(configFile);
            properties.store(fos, null);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}