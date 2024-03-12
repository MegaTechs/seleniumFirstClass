package com.megatech.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Selenium_March10 {

@Test
    public void test() throws InterruptedException {
        // WebDriver driver = null;
        WebDriver driver = new ChromeDriver();


        //driver.get("https://www.amazon.com/");

        driver.get("https://demo.guru99.com/test/link.html");

        // driver.manage().deleteAllCookies();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.manage().window().maximize();
   // WebElement username= driver.findElement(By.xpath("//input[@id='ods-input-0']"));
    //WebElement link=driver.findElement(By.linkText("click "));
    WebElement link=driver.findElement(By.partialLinkText("click"));
    link.click();
    Thread.sleep(5000);
    }
    }
