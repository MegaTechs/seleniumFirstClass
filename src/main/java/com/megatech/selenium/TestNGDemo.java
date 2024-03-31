package com.megatech.selenium;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class TestNGDemo {

    @Test(invocationCount = 10)
    public void testcase2(ITestContext testContext){
        System.out.println("Running testcase 2");

    }

    @Test(priority = 0, alwaysRun = true)
    public void test1(){
        System.out.println("Test1");

    }
    @Test
    public void test2(){

        System.out.println("Test2");
    }
    @Test
    public void test3(){
        System.out.println("Test3");

    }
    @Test
    public void test4(){

        System.out.println("Test4");
    }
    @Test
    public void test5(){

        System.out.println("Test5");
    }
    @Test
    public void test6(){

        System.out.println("Test6");
    }

    @Test (dependsOnMethods = { "OpenBrowser" })
    public void SignIn() {
        System.out.println("This will execute second (SignIn)");
    }

    @Test
    public void OpenBrowser() {
        System.out.println("This will execute first (Open Browser)");
    }
}
