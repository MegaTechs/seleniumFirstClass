package com.megatech.selenium;


import org.testng.annotations.Test;

public class TestNGGroupsDemo {
    @org.testng.annotations.Test(invocationCount = 10)
    public void testcase2(){
        System.out.println("Running testcase 2");

    }

    @Test (priority = 3,groups = { "regression", "Sanity","Smoke" })
    public void atest1(){
        System.out.println("Test1");

    }
    @Test (groups = { "integration", "Smoke" })

    public void test2(){

        System.out.println("Test2");
    }
    @Test (groups = { "integration", "e2e" })
    public void test3(){
        System.out.println("Test3");

    }
    @Test (priority = 2,groups = { "regression" })
    public void btest4(){

        System.out.println("Test4");
    }
    @Test (priority = 1,groups = { "regression" })
    public void ctest5(){

        System.out.println("Test5");
    }
    @Test (groups = { "Sanity" })
    public void test6(){

        System.out.println("Test6");
    }
    @Test (groups = { "Sanity" })
    public void test7(){

        System.out.println("Test7");
    }
    @Test (groups = { "Smoke" })
    public void test8(){

        System.out.println("Test8");
    }
    @Test (groups = { "Smoke" })
    public void test9(){

        System.out.println("Test9");
    }
}
