package com.megatech.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BasicKnowledage {
    WebDriver driver = null;

    @BeforeMethod
    public void setup(){


         driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }
    @Test
    public void test1(){
        System.out.println("Test1 Method");


        WebElement RegisterLink = driver.findElement(By.xpath(" //a[text()='Register']"));
        RegisterLink.click();
        WebElement inputFirstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
        inputFirstName.sendKeys("Mohammad");


    }
    @Test
    public void test2(){

        System.out.println("Test2 Method");

        WebElement RegisterLink = driver.findElement(By.xpath(" //a[text()='Register']"));
        RegisterLink.click();
        WebElement inputLastName = driver.findElement(By.xpath("//input[@id='FirstName']"));
        inputLastName.sendKeys("Haque");

    }


    @AfterMethod
    public void TearDown(){


        driver.close();

    }
}
