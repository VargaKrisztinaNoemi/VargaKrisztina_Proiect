package com.demoqa;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class MainTest {

    protected static WebDriver driver;

    @BeforeMethod
    protected void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.silentOutput", "true");
    }

    @AfterMethod
    protected void tearDown() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
