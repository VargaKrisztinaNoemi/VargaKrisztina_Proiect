package com.demoqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends MainPage {
    @FindBy(id = "submit")
    private WebElement logoutButton;

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLogoutButton() {
        return logoutButton;
    }
}
