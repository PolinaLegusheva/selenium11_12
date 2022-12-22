package com.pln.pageObj.service;

import java.util.Locale;
import java.util.ResourceBundle;

public class DataReader {
    private static ResourceBundle resourceBundle = ResourceBundle.getBundle("dev", new Locale("EN"));

    public static String getTestData(String key){
        return resourceBundle.getString(key);
    }
}
