package com.pln.pageObj.test;

import com.pln.pageObj.driver.DriverSingleton;
import com.pln.pageObj.util.TestListener;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners({TestListener.class})
public class CommonConditions {
    protected WebDriver driver;

    @BeforeMethod()
    public void setUp() {
        driver = DriverSingleton.getDriver();
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
        driver.manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true)
    public void stopBrowser() {
        DriverSingleton.closeDriver();
    }
}
