package com.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.demoqa.CheckboxPage.CHECKBOX_URL;

public class CheckboxTest extends MainTest {
    @Test
    public void checkCheckbox() throws InterruptedException {

        //deschidem si maximizam pagina
        driver = new ChromeDriver();
        driver.get(CHECKBOX_URL);
        driver.manage().window().maximize();

        Thread.sleep(2000);

        //bifam checkbox-ul Home
        CheckboxPage checkboxPage = new CheckboxPage(driver);
        checkboxPage.checkTheHomeCheckbox();

        Thread.sleep(2000);

        //verificam daca a fost bifat
        WebElement selectedMessage = driver.findElement(By.id("result"));
        String expectedMessage = "You have selected";
        Assert.assertTrue(selectedMessage.getText().contains(expectedMessage));

        Thread.sleep(2000);
    }
}
