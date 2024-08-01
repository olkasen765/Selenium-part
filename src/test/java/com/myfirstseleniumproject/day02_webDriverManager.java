package com.myfirstseleniumproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class day02_webDriverManager {
    public static void main(String[] args) {

//        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();

        // You need to create the chrome driver
//        WebDriver driver = new ChromeDriver();
        WebDriver driver = new FirefoxDriver();

        // Our driver is ready to use for automation ...
        driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.9.2");

    }

}
