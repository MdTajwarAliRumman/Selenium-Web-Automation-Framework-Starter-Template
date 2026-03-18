package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BrowserSetup {
    WebDriver driver;

    @BeforeSuite
    public WebDriver openABrowser() {
        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// implicitlyWait is based on the total browser lifecycle
        return driver;
    }

//    public void loadURL() {
//        driver.get("https://www.google.com/");
//    }

    @AfterSuite
    public void closeDriver() {
        driver.quit();
    }

    public WebElement getElement(By locator) {
        return driver.findElement(locator);
    }
}
