package com.myfirstseleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day02_VerifyUrlTest {
    public static void main(String[] args) {

//        Create a new class: VerifyURLTest
//
//        Navigate to TechProEducation / Amazon homepage
//
//        Verify if google homepage url is https://techproeducation.com/.
//        Or https://www.amazon.com/
//        Close the window

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.techproeducation.com/");

        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.equals("https://www.techproeducation.com/")) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }

    }
}
