package com.pln.pageObj.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.pln.pageObj.constants.PageName.CATALOG_PAGE_URL;

public class CatalogPage extends AbstractPage{

    private final Logger logger = LogManager.getRootLogger();
    @FindBy(className = "heading___3g-L_")
    WebElement catalogTitle;

    @FindBy(className = "glass-product-card__wishlist")
    WebElement heartImg;

    @FindBy(className = "gl-modal__close")
    WebElement closePopUpButton;

    @FindBy(className = "addtobag___3ba1u")
    WebElement cartButton;

    @FindBy(className = "empty_cart_notification___3YKxr")
    WebElement cartStatus;

    public CatalogPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getTextFromTitle() throws InterruptedException {
        Thread.sleep(5000);
        return catalogTitle.getText();
    }

    public CatalogPage putProductInCart() throws InterruptedException {
        Thread.sleep(5000);
        heartImg.click();
        return this;
    }

    public CatalogPage closePopUp(){
        wait.until(ExpectedConditions.elementToBeClickable(closePopUpButton));
        closePopUpButton.click();
        return this;
    }

    public CatalogPage checkCart(){
        cartButton.click();
        return this;
    }

    public String checkCartStatus(){

        return cartStatus.getText();
    }

    @Override
    public CatalogPage openPage() {
        driver.navigate().to(CATALOG_PAGE_URL);
        return this;
    }
}
