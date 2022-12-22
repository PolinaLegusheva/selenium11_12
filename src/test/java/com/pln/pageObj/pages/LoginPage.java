package com.pln.pageObj.pages;

import com.pln.pageObj.model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.pln.pageObj.constants.PageName.LOGIN_PAGE_URL;

public class LoginPage extends AbstractPage{
    private final Logger logger = LogManager.getRootLogger();

    @FindBy(id = "glass-gdpr-default-consent-accept-button")
    WebElement cookies;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[1]/div[1]/div/div/div[1]/div[2]/div[3]/div/div[2]/div[2]/button")
    WebElement loginButton;

    @FindBy(id="login-email")
    WebElement emailInput;

    @FindBy(id="login-password")
    WebElement passwordInput;

    @FindBy(xpath="//*[@id=\"app\"]/div/div[1]/div[1]/div/div/div[2]/div[1]/form/div[6]/button")
    WebElement signUpButton;

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    public LoginPage openPage() {
        driver.navigate().to(LOGIN_PAGE_URL);
        return this;
    }

    public LoginPage closeCookies(){
        cookies.click();
        return this;
    }

    public LoginPage goToLogin(){
        loginButton.click();
        return this;
    }

    public LoginPage login(User user){
        emailInput.sendKeys(user.getName());
        passwordInput.sendKeys(user.getPassword(), Keys.ENTER);
        logger.info("Login performed");
        return this;
    }

    public LoginPage signUp(){
        signUpButton.click();
        return this;
    }
}
