package com.megatech.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CapitalOneBankTesting {

    @Test
public void test(){
   // WebDriver driver = null;
        WebDriver  driver = new ChromeDriver();


        //driver.get("https://www.amazon.com/");
           driver.get(" https://www.capitalone.com/");

       // driver.manage().deleteAllCookies();

        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        // driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        WebElement  username= driver.findElement(By.xpath("//input[@id='ods-input-0']"));
        username.sendKeys("Nazmul123");

        WebElement  password= driver.findElement(By.xpath("//input[@id='ods-input-1']"));
        password.sendKeys("12345");

        WebElement  signin=driver.findElement(By.xpath("//button[@id='noAcctSubmit']"));
        signin.click();

driver.getCurrentUrl();
            System.out.println("My url= "+driver.getCurrentUrl());

   // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
   // driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
    //driver.get("https://www.geico.com/");
    //driver.get(" https://www.capitalone.com/");




   // driver.manage().window().maximize();


}

        @Test
        public void test2(){
                // WebDriver driver = null;
                WebDriver  driver = new ChromeDriver();
                //driver.get("https://www.amazon.com/");
                driver.get(" https://creditcards.chase.com/");

                driver.manage().deleteAllCookies();

                driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
                // driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
                driver.manage().window().maximize();

               // WebElement  username= driver.findElement(By.xpath("//input[@id='ods-input-0']"));
               // username.sendKeys("Nazmul123");

               // WebElement  password= driver.findElement(By.xpath("//input[@id='ods-input-1']"));
               // password.sendKeys("12345");

                //WebElement  signin=driver.findElement(By.xpath("//button[@id='noAcctSubmit']"));
                //signin.click();

                driver.getCurrentUrl();
                System.out.println("My url= "+driver.getCurrentUrl());

                // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
                // driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
                //driver.get("https://www.geico.com/");
                //driver.get(" https://www.capitalone.com/");




                // driver.manage().window().maximize();


        }

}
