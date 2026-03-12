package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class BrowserManagement extends BrowserSetup {
    @Test
    public void testBrowser() throws InterruptedException {
        driver.get("https://www.google.com/");
        Thread.sleep(2000);

        driver.navigate().to("https://www.Instagram.com/");
        Thread.sleep(2000);
//        driver.navigate().back();
//        Thread.sleep(2000);
//        driver.navigate().refresh();
//        Thread.sleep(2000);

//        driver.manage().window().minimize();
//        Thread.sleep(2000);
//        driver.manage().window().maximize();
//        Thread.sleep(2000);
//        driver.manage().window().fullscreen();
//        Thread.sleep(2000);

        driver.switchTo().newWindow(WindowType.TAB); // THis is for moving one tab to another
        driver.navigate().to("https://www.Snapchat.com/");
        Thread.sleep(2000);

        driver.switchTo().newWindow(WindowType.WINDOW); // THis is for opening another window
        driver.navigate().to("https://www.Snapchat.com/");
        Thread.sleep(2000);

    }

    @Test
    public void testDifferentWindow() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        getElement(By.xpath("//a[@id='opentab']")).click();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(10000);

        System.out.println(driver.getWindowHandle());
        List<String> handles = new ArrayList<>(driver.getWindowHandles());
        for (String handle : handles) {
            System.out.println(handle);
        }
        driver.switchTo().window(handles.get(1));
        System.out.println(getElement(By.cssSelector("div[class='support float-left'] span")).getText());
        driver.switchTo().window(handles.get(0));
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

    }
}
