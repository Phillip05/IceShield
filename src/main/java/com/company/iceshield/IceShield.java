package com.company.iceshield;

import com.company.iceshield.database.MysqlConnector;
import com.company.iceshield.files.ConfigFile;
import com.company.iceshield.paneles.JcconfigBD;
import com.company.iceshield.paneles.jMain;

public class IceShield {

    public static void main(String[] args) {
        ConfigFile cf = new ConfigFile();
        
        if(cf.getappusername().equals("") && cf.getapprol().equals("")){
            cf.setAppusername("NO");
            cf.setApprol("NO");
        }
        jLogin login = new jLogin();
        jMain main = new jMain();
        if(cf.getappusername().equals("NO")){
            login.setVisible(true);
        }else{
            main.setVisible(true);     
        }

        
    }
}
