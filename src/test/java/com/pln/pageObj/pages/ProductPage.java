package com.pln.pageObj.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.pln.pageObj.constants.PageName.PRODUCT_TO_BAG_PAGE;

public class ProductPage extends AbstractPage{

    private final Logger logger = LogManager.getRootLogger();
    @FindBy(xpath = "//*[@id=\"main-content\"]/div[2]/div[2]/section/div[1]/div[3]/button[2]")
    WebElement sizeButton;

    @FindBy(xpath = "//*[@id=\"add-to-bag\"]/button")
    WebElement addToBagButton;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div[1]/div[1]/div/div/div[1]/div[2]/div[3]/div/div[2]/div[4]/a")
    WebElement bagButton;
    @FindBy(className = "empty_cart_notification___3YKxr")
    WebElement bagStatus;

    public ProductPage(WebDriver webDriver) {
        super(webDriver);
    }

    public ProductPage chooseSize(){
        wait.until(ExpectedConditions.elementToBeClickable(sizeButton));
        sizeButton.click();
        return this;
    }
    public ProductPage putProductInBag() throws InterruptedException {
        Thread.sleep(5000);
        addToBagButton.click();
        return this;
    }

    public ProductPage checkBag(){
        bagButton.click();
        return this;
    }

    public String checkBagStatus() throws InterruptedException {
        Thread.sleep(5000);
        return bagStatus.getText();
    }

    @Override
    public ProductPage openPage() {
        driver.navigate().to(PRODUCT_TO_BAG_PAGE);
        return this;
    }
}
