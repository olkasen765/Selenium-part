package com.myfirstseleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day01_BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        /*
When user goes to walmart
Then goes to amazon
Navigate back to Walmart
Navigate forward to amazon
Refresh the page
c

         */



        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        //When user goes to walmart

        driver.get("https://www.walmart.com/");

        //Navigate forward to amazon
        driver.navigate().to("https://www.amazon.com/");

        //      Thread.sleep(5000);

//Refresh the page
        driver.navigate().refresh();
        //       Thread.sleep(5000);

        //go back to previous page (walmart)
        driver.navigate().back();

//        Thread.sleep(5000);
        //go forward to amazon
        driver.navigate().forward();


        //Close the browser

        //driver.close();
        driver.quit();






    }



}