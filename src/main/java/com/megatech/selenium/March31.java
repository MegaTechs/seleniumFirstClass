package com.megatech.selenium;

import org.testng.annotations.Test;

public class March31 {

   // @Test(invocationCount = 10)


    @Test(priority = 2)
    public void test1(){
        System.out.println("Test1");

    }
    @Test(priority = 3)
    public void test2(){
        System.out.println("Test2");

    }
    @Test(priority = 1)
    public void test3(){
        System.out.println("Test3");

    }
    @Test(priority = 3)
    public void best4(){
        System.out.println("Test2");

    }
    @Test(priority = 1)
    public void tast5(){
        System.out.println("Test3");

    }

    @Test(priority = 0)
    public void test6(){
        System.out.println("Test2");

    }
    @Test
    public void best7(){
        System.out.println("Test2");

    }

}
