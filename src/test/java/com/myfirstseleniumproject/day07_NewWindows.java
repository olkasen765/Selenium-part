package com.myfirstseleniumproject;

import com.myfirstseleniumproject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WindowType;

public class day07_NewWindows extends TestBase {

    @Test

    public  void newWindowTest() throws InterruptedException {


        //Open the pages in 2 new windows and verify their  TITLES -> LinkedIn , Ebay

        driver.get("https://www.linkedin.com/");

        Assertions.assertTrue(driver.getTitle().contains("LinkedIn"));

        String LinkedIn = driver.getWindowHandle();

        System.out.println("LinkedIn = " + LinkedIn);

        //I need to go to Ebay website with new window

        driver.switchTo().newWindow(WindowType.WINDOW); //create a new window for driver.....

        Thread.sleep(3000);


        driver.get("https://www.ebay.com/");

        Assertions.assertTrue(driver.getTitle().contains("Electronics"));

        String eBay = driver.getWindowHandle();
        System.out.println(eBay);

        Thread.sleep(3000);

        // We will do to LinkedIn window
        driver.switchTo().window(LinkedIn);
        Assertions.assertTrue(driver.getTitle().contains("LinkedIn"));
        Thread.sleep(3000);


        // Then we will come back to aging ebay window
        driver.switchTo().window(eBay);
        Assertions.assertTrue(driver.getTitle().contains("eBay"));
        Thread.sleep(3000);

        // Open 2 new tabs and verify their TITLES


        // -> LinkedIn , Ebay
        driver.switchTo().window(LinkedIn);

        System.out.println("Driver.getCurrentUrl()" + driver.getCurrentUrl());
        Assertions.assertTrue(driver.getTitle().contains("LinkedIn"));
        Thread.sleep(3000);






    }



}
