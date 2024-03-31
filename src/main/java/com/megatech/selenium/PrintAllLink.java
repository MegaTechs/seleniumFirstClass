package com.megatech.selenium;

import io.opentelemetry.semconv.SemanticAttributes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class PrintAllLink {
@Test
    public static void test() {


        WebDriver driver = new ChromeDriver();



        driver.get("https://demo.guru99.com/test/delete_customer.php");

        // driver.manage().deleteAllCookies();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println(links.size());




        for(WebElement alllinks:links){
            System.out.println( alllinks.getText() + " - " +  alllinks.getAttribute("href"));
        }



// for (int i = 1; i<=links.size(); i=i+1)
//
// {
//
// System.out.println(links.get(i).getText());
//
// }

 }

}
