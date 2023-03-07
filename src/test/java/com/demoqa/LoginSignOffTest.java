package com.demoqa;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static com.demoqa.LoginPage.LOGIN_URL;

public class LoginSignOffTest extends MainTest {

    @Parameters({"username", "password"})
    @Test
    public void loginTest(String username, String password) throws InterruptedException {

        //deschidem pagina login
        driver = new ChromeDriver();
        driver.get(LOGIN_URL);
        driver.manage().window().maximize();

        Thread.sleep(2000);

        //introducem credentialele si apasam pe login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", loginPage.getLoginButton());
        loginPage.clickLogin();

        Thread.sleep(2000);

        //verificam ca apare butonul logout pe pagina de profil
        ProfilePage profilePage = new ProfilePage(driver);
        Assert.assertTrue(profilePage.getLogoutButton().isDisplayed());

        Thread.sleep(2000);

        //apasam pe log out
        profilePage.getLogoutButton().click();

        Thread.sleep(2000);
    }
}
