package com.megatech.selenium;

public class Test {
    @org.testng.annotations.Test
    public void seleniumtest() throws InterruptedException {
        nopcommerce n=new nopcommerce();
       n.inputEmail();



    }

@org.testng.annotations.Test
    public void getmethodfromcapitalOne(){

        CapitalOneBankTesting c=new CapitalOneBankTesting();
        c.test();
        c.test2();


    }
}
