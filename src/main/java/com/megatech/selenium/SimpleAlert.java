package com.megatech.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SimpleAlert {
@Test
    public void  simplealert1() throws InterruptedException {

        WebDriver driver = new ChromeDriver();



        driver.get("https://demo.guru99.com/test/delete_customer.php");

        // driver.manage().deleteAllCookies();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        WebElement customerid=driver.findElement(By.xpath("//input[@name='cusid']"));
        customerid.sendKeys("1114674674");

        WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
        submit.click();
   // driver.switchTo().alert().accept();

    Alert alert2 =driver.switchTo().alert();
    Thread.sleep(5000);
    alert2.accept();
    Thread.sleep(5000);
    String alertMessage1= driver.switchTo().alert().getText();
    System.out.println("AlertMessage1"+alertMessage1);
    Alert alert3 =driver.switchTo().alert();
    Thread.sleep(5000);
    alert3.accept();
    Thread.sleep(5000);






    // Capturing alert message.
    String alertMessage2= driver.switchTo().alert().getText();

    // Displaying alert message
    System.out.println(alertMessage2);
   // Assert.assertEquals(alertMessage2,);


    // Accepting alert




}

}
