package com.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.demoqa.UploadPage.UPLOAD_URL;
import static org.testng.Assert.assertTrue;


public class UploadTest extends MainTest {

    @Test
    public void uploadTest() throws InterruptedException {

        //deschidem si maximizam pagina in Crome
        driver = new ChromeDriver();
        driver.get(UPLOAD_URL);
        driver.manage().window().maximize();

        Thread.sleep(2000);

        //verificam daca butonul de upload e prezent si incarcam fisierul
        UploadPage uploadPage = new UploadPage(driver);
        assertTrue(uploadPage.getUploadButton().isDisplayed());
        uploadPage.getUploadButton().sendKeys("C:\\Users\\szilv\\Documents\\AzimutProjects\\VargaKrisztina_Proiect\\src\\test\\resources\\TestFile.jpg");

        Thread.sleep(2000);

        //verificam ca mesajul de confirmare e prezent
        WebElement message = driver.findElement(By.id("uploadedFilePath"));
        String expectedMessage = "C:\\fakepath\\TestFile.jpg";
        Assert.assertTrue(message.getText().contains(expectedMessage));

        Thread.sleep(2000);
    }
}


