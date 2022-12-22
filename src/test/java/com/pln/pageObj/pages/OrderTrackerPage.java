package com.pln.pageObj.pages;

import com.pln.pageObj.model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.pln.pageObj.constants.Constants.*;
import static com.pln.pageObj.constants.PageName.ORDER_TRACKER_PAGE;

public class OrderTrackerPage extends AbstractPage{
    private final Logger logger = LogManager.getRootLogger();

    @FindBy(name="orderNo")
    WebElement inputOrderNumber;

    @FindBy(name="email")
    WebElement inputEmail;

    @FindBy(xpath="//*[@id=\"main-content\"]/div/div/form/button")
    WebElement continueButton;

    @FindBy(xpath="//*[@id=\"main-content\"]/div/div/div[3]/div/h5")
    WebElement orderStatus;

    public OrderTrackerPage(WebDriver webDriver) {
        super(webDriver);
    }

    public OrderTrackerPage orderInputCells(){
        inputOrderNumber.sendKeys(ORDER_NUMBER);
        inputEmail.sendKeys(EMAIL);
        logger.info("Order performed");
        return this;
    }

    public OrderTrackerPage submitButton(){
        wait.until(ExpectedConditions.elementToBeClickable(continueButton));
        continueButton.click();
        return this;
    }

    public String checkOrderStatus(){
        wait.until(ExpectedConditions.elementToBeClickable(orderStatus));
        return orderStatus.getText();
    }

    @Override
    public OrderTrackerPage openPage() {
        driver.navigate().to(ORDER_TRACKER_PAGE);
        return this;
    }
}
