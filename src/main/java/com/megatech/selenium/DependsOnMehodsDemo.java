package com.megatech.selenium;
import org.testng.annotations.Test;
public class DependsOnMehodsDemo {
    @Test()
    public void teacher(){

        System.out.println("Test");

    }



    @Test(dependsOnMethods = {"teacher"})
public void student(){
        System.out.println("Test1");


}





        @Test(dependsOnMethods = {"OpenBrowser"})
        public void SignIn() {
            System.out.println("User has signed in successfully");
        }
    @Test(dependsOnMethods = {"OpenBrowser"})
    public void SignIn2() {
        System.out.println("User has signed in successfully");
    }

        @Test
        public void OpenBrowser() {
            System.out.println("The browser is opened");
        }

        @Test(dependsOnMethods = {"SignIn"})
        public void LogOut() {
            System.out.println("The user logged out successfully");
        }



    }
