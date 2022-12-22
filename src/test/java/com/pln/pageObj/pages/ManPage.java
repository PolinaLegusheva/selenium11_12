package com.pln.pageObj.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.pln.pageObj.constants.PageName.MAN_PAGE_URL;

public class ManPage extends AbstractPage{

    @FindBy(xpath = "//*[@id=\"main-content\"]/div/div[3]/div/div/div[1]/div/div[2]/div/button")
    WebElement filterSortButton;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div/div[3]/div/div/div/div[3]/div/div/div[2]/div[3]")
    WebElement categoryButton;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div/div[3]/div/div/div/div[3]/div/div/div[2]/div[3]/div[2]/div/ul/li[1]/a")
    WebElement clothingButton;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div/div[3]/div/div/div/div[3]/div/div/div[2]/div[1]/div/a[3]/div/div/span[1]")
    WebElement deleteFilterButton;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div/div[3]/div/div/div/div[3]/div/div/div[3]/div/button")
    WebElement applyButton;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div/div[1]/div/div/div[2]/div/div/h1")
    WebElement filteredPageText;

    public ManPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    public ManPage openPage() {
        driver.navigate().to(MAN_PAGE_URL);
        return this;
    }

    public ManPage clickFilterSort(){
        wait.until(ExpectedConditions.elementToBeClickable(filterSortButton));
        filterSortButton.click();
        return this;
    }

    public ManPage clickCategory(){
        wait.until(ExpectedConditions.elementToBeClickable(categoryButton));
        categoryButton.click();
        return this;
    }

    public ManPage clickClothingCategory(){
        wait.until(ExpectedConditions.elementToBeClickable(clothingButton));
        clothingButton.click();
        return this;
    }

    public ManPage clickDeleteFilter(){
        wait.until(ExpectedConditions.elementToBeClickable(deleteFilterButton));
        deleteFilterButton.click();
        return this;
    }

    public ManPage clickApply(){
        wait.until(ExpectedConditions.elementToBeClickable(applyButton));
        applyButton.click();
        return this;
    }

    public String checkFilteredPage(){
        wait.until(ExpectedConditions.elementToBeClickable(filteredPageText));
        return filteredPageText.getText();
    }
}
