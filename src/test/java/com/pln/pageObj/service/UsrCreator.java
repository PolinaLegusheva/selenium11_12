package com.pln.pageObj.service;

import com.pln.pageObj.model.User;

public class UsrCreator {
    public static final String TESTDATA_USER_NAME = "testdata.user.name";
    public static final String TESTDATA_USER_PASSWORD = "testdata.user.password";

    public static User withCredentialsFromProperty(){
        return new User(DataReader.getTestData(TESTDATA_USER_NAME),
                DataReader.getTestData(TESTDATA_USER_PASSWORD));
    }

    public static User withEmptyUsername(){
        return new User("", DataReader.getTestData(TESTDATA_USER_PASSWORD));
    }

    public static User withEmptyPassword(){
        return new User(DataReader.getTestData(TESTDATA_USER_NAME), "");
    }
}
