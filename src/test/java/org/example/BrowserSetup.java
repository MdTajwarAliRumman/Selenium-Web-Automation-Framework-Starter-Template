package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BrowserSetup {
    WebDriver driver;

    @BeforeSuite
    public WebDriver openABrowser() {
        driver = new ChromeDriver();
        return driver;
    }

//    public void loadURL() {
//        driver.get("https://www.google.com/");
//    }

    @AfterSuite
    public void closeDriver() {
        driver.close();
    }
}
