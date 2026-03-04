package org.example;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstTest extends BrowserSetup {

    @BeforeClass
    public void loadURL() {
        driver.get("https://www.google.com/");
    }

    @Test
    public void testPageTitle() {

        String page_title = driver.getTitle();
        Assert.assertEquals(page_title, "Google");
        System.out.println(page_title);
    }

    @Test
    public void testPageUrl() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com/");

    }
}
