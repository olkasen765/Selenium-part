package com.myfirstseleniumproject;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class day03_locators {

    static WebDriver driver;

    @BeforeAll
    public static void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test
    public void test01() throws InterruptedException {

        //Create a class : Locators
//Create a class: Locators
//When user goes to :
//     https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //And enter username
        driver.findElement(By.name("username")).sendKeys("Admin");

        //And enter password
        driver.findElement(By.name("password")).sendKeys("admin123");


        //And click on submit button
//        Thread.sleep(3000);
        driver.findElement(By.tagName("button")).click();


        //Then verify the login is successful
        String url = driver.getCurrentUrl();
        Assertions.assertEquals(url,"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
        Thread.sleep(3000);

        //Then logout the application
        // click profile
        WebElement profile = driver.findElement(By.className("oxd-userdropdown-tab"));
        profile.click();

        // click logout button
//        driver.findElement(By.linkText("Logout")).click();
        
        driver.findElement(By.partialLinkText("Log")).click();

        //Then verify the logout is successful
        Assertions.assertTrue(driver.getCurrentUrl().contains("login"));


    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }


}
