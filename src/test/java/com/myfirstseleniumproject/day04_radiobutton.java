package com.myfirstseleniumproject;

import com.myfirstseleniumproject.utilities.TestBase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class day04_radiobutton extends TestBase {


//    WebDriver driver;
//    @BeforeEach
//    public void setUp(){
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//
//    }


    @Test
    public void radioButton(){

        //navigate to website
        driver.get("https://testcenter.techproeducation.com/index.php?page=radio-buttons");


        //choose yellow color for favorite color

        WebElement yellowButton = driver.findElement(By.id("yellow"));

        if (!yellowButton.isSelected()){
            yellowButton.click();
        }

        //Assert that if yellow button is selected
        Assertions.assertTrue(yellowButton.isSelected());


    }

//    @AfterEach
//    public void tearDown(){
//
//        driver.quit();
//    }

}