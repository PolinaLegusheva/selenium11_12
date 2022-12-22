package com.pln.pageObj.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.pln.pageObj.constants.PageName.ACCOUNT_PAGE_URL;

public class AccountPage extends AbstractPage{

    public AccountPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    public AccountPage openPage() {
        driver.navigate().to(ACCOUNT_PAGE_URL);
        return this;
    }

    public String getTextFromLine(){
        return driver.getCurrentUrl();
    }
}
