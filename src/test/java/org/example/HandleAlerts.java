package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleAlerts extends BrowserSetup {

    By jsAlertButon = By.xpath("//button[normalize-space()='Click for JS Alert']");
    By jsConfirm = By.xpath("//button[normalize-space()='Click for JS Confirm']");
    By jsPrompt = By.xpath("//button[normalize-space()='Click for JS Prompt']");
    By result_txt = By.xpath("//p[@id='result']");

    @Test
    public void testAlerts() {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        getElement(jsAlertButon).click();
        Alert alert = driver.switchTo().alert(); //*******this is how we need to switch to the alert prompt
        System.out.println(alert.getText());
        alert.accept();
        Assert.assertEquals(getElement(result_txt).getText(), "You successfully clicked an alert");
    }
}


