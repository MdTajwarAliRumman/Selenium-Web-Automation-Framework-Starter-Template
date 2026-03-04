package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorsBasic extends BrowserSetup {

    @Test
    public void testElements() throws InterruptedException {
        driver.get("https://www.google.com/");
        // findElement returns a WebElement
        WebElement search_Btn;
//        search_Btn = driver.findElement(By.id("APjFqb")); // check by ID
//        search_Btn = driver.findElement(By.name("q")); // check by name
//        search_Btn = driver.findElement(By.className("gLFyf")); // check by class
        search_Btn = driver.findElement(By.tagName("textarea")); // check by tagName

        // We can write on webElements using sendKeys
        search_Btn.sendKeys("Hello world!");

//        WebElement about_Btn = driver.findElement(By.linkText("About")); // Check by linkText
//        about_Btn.click();
//        WebElement howSearch_works = driver.findElement(By.partialLinkText("How Search")); // Check by PartialLinkText
//        howSearch_works.click();

//        WebElement county_selection = driver.findElement(By.cssSelector("div[class='uU7dJb']")); // Check by linkText
//        System.out.println(county_selection.getText());
        WebElement select_Language = driver.findElement(By.xpath("//div[@id='SIvCob']"));
        System.out.println(select_Language.getText());


        Thread.sleep(2000);
    }
}
