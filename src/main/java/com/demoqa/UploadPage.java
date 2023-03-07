package com.demoqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UploadPage extends MainPage {

    public final static String UPLOAD_URL = MAIN_URL + "/upload-download";
    @FindBy(id = "uploadFile")
    private WebElement uploadButton;


    public UploadPage(WebDriver driver) {
        super(driver);
    }

    public void clickUpload() {
        uploadButton.click();
    }

    public WebElement getUploadButton() {
        return uploadButton;
    }
}
