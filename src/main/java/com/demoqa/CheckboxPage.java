package com.demoqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckboxPage extends MainPage {

    public final static String CHECKBOX_URL = MAIN_URL+"/checkbox";
    public CheckboxPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//*[@id=\"tree-node\"]/ol/li/span/label/span[1]") private WebElement checkboxHome;
    public void checkTheHomeCheckbox(){
        if(!checkboxHome.isSelected()) {
            checkboxHome.click();
        }
    }

}
