package com.pln.pageObj.pages;

import com.pln.pageObj.model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends AbstractPage{

    private final Logger logger = LogManager.getRootLogger();
    private final String HOME_PAGE_URL = "https://www.adidas.com/us";

    @FindBy(className = "searchinput___19uW0")
    WebElement searchInput;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    public HomePage openPage() {
        driver.navigate().to(HOME_PAGE_URL);
        return this;
    }

    public HomePage enterNameOfSearch(String line){
        try {
            wait.until(ExpectedConditions.elementToBeClickable(searchInput));
        } catch (TimeoutException e) {
            logger.error(e.getMessage() + "when try enter keys");
            searchInput.click();
        }
        wait.until(ExpectedConditions.elementToBeClickable(searchInput));
        searchInput.sendKeys(line, Keys.ENTER);
        return this;
    }
}
