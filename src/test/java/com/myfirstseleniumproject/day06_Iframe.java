package com.myfirstseleniumproject;

import com.myfirstseleniumproject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class day06_Iframe extends TestBase {

    @Test
    public void iframe(){

        //Go
        //      https://testpages.herokuapp.com/styled/frames/frames-test.html
        driver.get("https://testpages.herokuapp.com/styled/frames/frames-test.html");


        //we need to switch iframe first
        //   driver.switchTo().frame(1);
        driver.switchTo().frame("left");
        //Then Assert that "Left List Item 29" is the last element in the "Left"
        List<WebElement> listOfElementsForLeft = driver.findElements(By.xpath("//li"));

        String lastElementOfLeft = listOfElementsForLeft.get(listOfElementsForLeft.size()-1).getText();

//        for(WebElement each : listOfElementsForLeft){
//
//            System.out.println(each.getText());
//        }
//
        Assertions.assertTrue(lastElementOfLeft.equals("Left List Item 29"));

        System.out.println("lastElementOfLeft = " + lastElementOfLeft);
        //And Assert that "Middle List Item 39" is the last element in the "Middle"


    }

}
