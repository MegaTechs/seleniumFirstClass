package com.megatech.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class nopcommerce {

    @Test
    public void clickOnRegisterLink(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        WebElement RegisterLink= driver.findElement(By.xpath(" //a[text()='Register']"));
        RegisterLink.click();


    }

    @Test
    public void MouseOver() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        //driver.get("https://demoqa.com/menu/");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        //Retrieve WebElement 'Music' to perform mouse hover
        WebElement menuOption = driver.findElement(By.xpath("//a[text()='Computers '][1]"));
        //Mouse hover menuOption 'Music'
        actions.moveToElement(menuOption).perform();

        Thread.sleep(5000);
        WebElement selectMenuOption = driver.findElement(By.xpath("//a[text()='Desktops '][1]"));
        Thread.sleep(5000);
        selectMenuOption.click();
        driver.close();

    }

    @Test
    public void Search() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        //driver.get("https://demoqa.com/menu/");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        WebElement selectMenuOption = driver.findElement(By.id("small-searchterms"));
        selectMenuOption.sendKeys("Books");
        WebElement searchButton= driver.findElement(By.xpath(".//button[@class='button-1 search-box-button']"));
Thread.sleep(4000);
        searchButton.click();
        driver.close();

    }

    @Test
    public void selectRadioButtonMale(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        WebElement RegisterLink= driver.findElement(By.xpath(" //a[text()='Register']"));
        RegisterLink.click();
        WebElement selectRadioButtonMale= driver.findElement(By.xpath("//input[@id='gender-male']"));
        selectRadioButtonMale.click();
        driver.close();
        //input[@id='FirstName']
    }

    @Test
    public void inputFirstName(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        WebElement RegisterLink= driver.findElement(By.xpath(" //a[text()='Register']"));
        RegisterLink.click();
        WebElement inputFirstName= driver.findElement(By.xpath("//input[@id='FirstName']"));
        inputFirstName.sendKeys("Mohammad");
        driver.close();

    }

    @Test
    public void inputLastName(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        WebElement RegisterLink= driver.findElement(By.xpath(" //a[text()='Register']"));
        RegisterLink.click();
        WebElement inputLastName= driver.findElement(By.xpath("//input[@id='FirstName']"));
        inputLastName.sendKeys("Haque");
        driver.close();

    }
    @Test
    public void SelectDropDown(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        WebElement RegisterLink= driver.findElement(By.xpath(" //a[text()='Register']"));
        RegisterLink.click();
        Select SelectDropDown = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")));
        SelectDropDown.selectByVisibleText("9");
        Select DateOfBirthMonth = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")));
        DateOfBirthMonth.selectByVisibleText("9");
        Select DateOfBirthYear = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")));
        DateOfBirthYear.selectByVisibleText("9");
        driver.close();


    }

    @Test
    public void inputEmail(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        WebElement RegisterLink= driver.findElement(By.xpath(" //a[text()='Register']"));
        RegisterLink.click();
        WebElement inputLastName= driver.findElement(By.xpath("//input[@id='FirstName']"));
        inputLastName.sendKeys("Haque");
        driver.close();


    }
    @Test
    public void SelectNewsletterCheckBox(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        WebElement RegisterLink= driver.findElement(By.xpath(" //a[text()='Register']"));
        RegisterLink.click();
        WebElement SelectNewsletterCheckBox= driver.findElement(By.xpath("//input[@id='Newsletter']"));
        SelectNewsletterCheckBox.click();
        driver.close();


    }

}
