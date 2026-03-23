package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverSetup {
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

    public WebDriver getDriver(String browser_name) {
        if (browser_name.equals("chrome")) {
            return new ChromeDriver();
        } else if (browser_name.equals("firefox")) {
            return new FirefoxDriver();
        } else if (browser_name.equals("edge")) {
            return new EdgeDriver();
        } else {
            throw new RuntimeException("Browser is not available with the name: " + browser_name);
        }
    }
}
