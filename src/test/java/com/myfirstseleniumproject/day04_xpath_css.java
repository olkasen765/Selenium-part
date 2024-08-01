package com.myfirstseleniumproject;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class day04_xpath_css {

    WebDriver driver;
    @BeforeEach
    public void setUp(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }

    @Test
    public void test01() throws InterruptedException {

        //When user go to the webpage https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //user enter username
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");

        //user enter password
        WebElement password = driver.findElement(By.cssSelector("input[type='password']"));
        password.sendKeys("admin123");

        //click login button
        //   driver.findElement(By.xpath("//button[@type='submit']")).click();

        WebElement login = driver.findElement(By.tagName("button"));

        if (login.isDisplayed()) {
            login.click();
        }

        //isDisplayed for question mark
        WebElement qa = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
        Thread.sleep(5000);
        if (qa.isDisplayed()){

            qa.click();
        }


        //Assert login successfull
        Assertions.assertTrue(qa.isDisplayed());



    }

    @AfterEach
    public void tearDown(){

        driver.quit();
    }
}




