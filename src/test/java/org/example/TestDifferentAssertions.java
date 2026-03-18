package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestDifferentAssertions extends BrowserSetup {
    @Test
    public void testAssertion() {
        Assert.assertEquals(1, 1);
        System.out.println("Step -1 ");
        Assert.assertFalse(true);
        System.out.println("Step -2");
        Assert.assertTrue(true);
        System.out.println("Step -3");
    }

    @Test
    public void softTestAssertion() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(1, 1);
        System.out.println("Step -1 ");
        softAssert.assertFalse(true);
        System.out.println("Step -2");
        softAssert.assertTrue(true);
        System.out.println("Step -3");

        softAssert.assertAll();

    }

}
