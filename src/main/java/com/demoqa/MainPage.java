package com.demoqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    protected WebDriver driver;

    public final static String MAIN_URL = "https://demoqa.com";

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
}
