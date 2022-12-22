package com.pln.pageObj.test;

import com.pln.pageObj.constants.Constants;
import com.pln.pageObj.model.User;
import com.pln.pageObj.pages.AccountPage;
import com.pln.pageObj.pages.LoginPage;
import com.pln.pageObj.service.UsrCreator;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class LoginTest extends CommonConditions{
    @Test
    public void testLogin(){
        LoginPage loginPage = new LoginPage(driver);
        AccountPage accountPage = new AccountPage(driver);

        User user = UsrCreator.withCredentialsFromProperty();

        loginPage
                .openPage()
                .login(user);


        String resultOfLogin = accountPage.getTextFromLine();
        assertThat(resultOfLogin, containsString(Constants.MY_ACCOUNT));
    }
}
