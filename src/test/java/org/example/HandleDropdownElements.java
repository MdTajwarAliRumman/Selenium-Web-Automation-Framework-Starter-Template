package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class HandleDropdownElements extends BrowserSetup {

    @Test
    public void testDropdown() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement dropdown_btn = getElement(By.xpath("//select[@id='dropdown-class-example']"));
        dropdown_btn.click();

        Select select = new Select(dropdown_btn); // Using Selenium Webdriver select class for option selection of a dropdown
        select.selectByValue("option2");
        Thread.sleep(2000);
        select.selectByVisibleText("Option1");
        Thread.sleep(2000);
        select.selectByIndex(3);
        Thread.sleep(2000);

        List<WebElement> options = select.getOptions(); // Returns every selected option
        for (WebElement option : options) {
            System.out.println(option.getText());
        }

        System.out.println("The first selected option is: " + select.getFirstSelectedOption().getText());// returns the first selected option
    }
}
