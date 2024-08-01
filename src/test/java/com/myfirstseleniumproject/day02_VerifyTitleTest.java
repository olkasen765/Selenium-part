package com.myfirstseleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day02_VerifyTitleTest {
    public static void main(String[] args) {

//        Create a new class: VerifyTitleTest
//
//        Navigate to  techproeducation homepage / amazon homepage
//
//        3. Verify if page title is
//        "Techpro Education | Online It Courses & Bootcamps" /
//                OR
//        "Amazon.com. Spend less. Smile more."
//
//        4. Close the window

        //No need to setup here because we have selenium dependiecy which has webdrivermanager dependiency....

        //Create driver object
        WebDriver driver = new ChromeDriver();

        //Navigate to  / amazon homepage
        driver.navigate().to("https://www.amazon.com/");

        //3. Verify if page title is
        String actualTitle = driver.getTitle();

        if (actualTitle.contains("Amazon")){

            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }

        //4. Close the window
        driver.close();


    }
}
