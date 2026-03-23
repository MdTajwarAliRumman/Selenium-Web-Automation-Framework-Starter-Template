package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class DriverSetup {
    WebDriver driver;
    // If want to run browser from the command line
    private static String browserName = System.getProperty("browser", "Chrome");

    // This is to ensure that one test cases doesn't stop by the impact of another testcase
    private static final ThreadLocal<WebDriver> LOCAL_DRIVER = new ThreadLocal<>();


    //static makes it easier to call the method without creating any objects
    public static WebDriver getDriver() {
        return LOCAL_DRIVER.get();
    }

    public static void setDriver(WebDriver driver) {
        DriverSetup.LOCAL_DRIVER.set(driver);
    }

    public WebDriver getDriver(String browser_name) {
        if (browser_name.equalsIgnoreCase("chrome")) {
            return new ChromeDriver();
        } else if (browser_name.equalsIgnoreCase("firefox")) {
            return new FirefoxDriver();
        } else if (browser_name.equalsIgnoreCase("edge")) {
            return new EdgeDriver();
        } else {
            throw new RuntimeException("Browser is not available with the name: " + browser_name);
        }
    }

    @BeforeSuite
    public void openABrowser() {
        WebDriver driver = getDriver(browserName);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// implicitlyWait is based on the total browser lifecycle
        driver.manage().window().maximize();
        setDriver(driver);
    }

    @AfterSuite
    public void closeDriver() {
        driver.quit();
    }

    public WebElement getElement(By locator) {
        return driver.findElement(locator);
    }


}
