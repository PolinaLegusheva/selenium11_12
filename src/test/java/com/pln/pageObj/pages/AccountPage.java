package com.pln.pageObj.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends AbstractPage{

    private final String ACCOUNT_PAGE_URL = "https://www.adidas.com/us/my-account";

    @FindBy(className = "gl-heading-font-set-standard-14___2TU_m")
    WebElement accountLine;

    public AccountPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    public AccountPage openPage() {
        driver.navigate().to(ACCOUNT_PAGE_URL);
        return this;
    }

    public String getTextFromLine(){
        return accountLine.getText();
    }
}
