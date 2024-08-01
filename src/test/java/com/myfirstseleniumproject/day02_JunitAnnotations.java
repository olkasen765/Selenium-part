package com.myfirstseleniumproject;

import org.junit.jupiter.api.*;

public class day02_JunitAnnotations {
    //@Test annoations is used to create TEST CASES...
    //This is one of the most common annotation....

    //@BeforeAll and @AfterAll runs only once before or after each CLASS...
    //@BeforeEach and AfterEach runs only once before or after each method.....

    @BeforeAll
    public static void setUpClass(){

        System.out.println("Before All.....");
    }

    @AfterAll
    public static void tearDownClass(){

        System.out.println("After All....");
    }

    @BeforeEach
    public void setUpMethods(){
        System.out.println("Before each.....");
    }

    @AfterEach
    public void tearDownMethods(){

        System.out.println("After each");
    }


    @Test
    public void test01(){

        System.out.println("Test01");
    }


    @Test
    public void test02(){

        System.out.println("Test02");
    }

    @Test @Disabled
    public void test03(){

        System.out.println("Test03");
    }


    @Test
    public void test04(){

        System.out.println("Test04");
    }

    @Test
    public void test05(){

        System.out.println("Test05");
    }

}
