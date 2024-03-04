package com.megatech.selenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicKnowledage {


    @BeforeMethod
    public void setup(){
        System.out.println("Setup Method");

    }
    @Test
    public void test1(){
        System.out.println("Test1 Method");

    }
    @Test
    public void test2(){

        System.out.println("Test2 Method");
    }
    @Test
    public void test3(){

        System.out.println("Test3Method");
    }
    @AfterMethod
    public void TearDown(){
        System.out.println("TearDown Method");

    }
}
