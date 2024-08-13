package com.myfirstseleniumproject;

import com.myfirstseleniumproject.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.util.Set;

public class day06_Alert_Window_HW extends TestBase {

    @Test
    public void alertWindowHW() throws InterruptedException {
        //When Navigate to https://testpages.herokuapp.com/styled/windows-test.html

        driver.get("https://testpages.herokuapp.com/styled/windows-test.html");
        //When Click on "Alerts In A New Window From JavaScript"
        driver.findElement(By.partialLinkText("Alerts In A New Window")).click();
        Thread.sleep(3000);
        //And Switch to new window
        String firstWindow = driver.getWindowHandle();
        System.out.println("firstWindow = " + firstWindow);

        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println("allWindowHandles = " + allWindowHandles);

        String secondWindow = "";

        for (String each : allWindowHandles) {

            if (each != firstWindow) {

                secondWindow = each;

            }

        }

        System.out.println("secondWindow = " + secondWindow);
        driver.switchTo().window(secondWindow);


        //And Click on "Show alert box" button
        driver.findElement(By.id("alertexamples")).click();
        Thread.sleep(3000);
        //And Accept alert
        driver.switchTo().alert().accept();
        Thread.sleep(3000);

        //And Click on "Show confirm box" button
        //And Cancel alert
        //Then Assert that alert is cancelled
        //When Click on "Show prompt box" button
        //And Send "Hello World!" to the alert
        //Then Assert that "Hello World!" is sent
    }

}
