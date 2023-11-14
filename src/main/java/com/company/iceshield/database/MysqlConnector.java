package com.company.iceshield.database;

import com.company.iceshield.files.ConfigFile;
import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlConnector {
    
   Connection SQLConexion;
    ConfigFile cf = new ConfigFile();
    int sqtf = 0;
    
    public MysqlConnector(){
    
        String host = cf.getmsqlHost();
        String puerto = cf.getmsqlPort();
        String nameDB = cf.getmsqlNameDB();
        
        String Usuario = cf.getmsqlUser();
        String Pass = cf.getmsqlPass();
        
        String drive = "com.mysql.cj.jdbc.Driver";
        
        String databaseURL = "jdbc:mysql://"+host+":"+puerto+"/"+nameDB+"?useSSL=false";
        
        try{
            Class.forName(drive);
            SQLConexion = DriverManager.getConnection(databaseURL, Usuario,Pass);
            System.out.println("Conexion ON");
        }catch(Exception e){
            System.out.println("Conexion OFF");
            sqtf = 1;
        }
    }
    
    public Connection getConexionDB(){
        return SQLConexion;
    }
    
    public int getsqtf(){
        return sqtf;
    }
    
}