package Sauce.test;

import Sauce.resources.BaseClass;
import org.openqa.selenium.WebDriver;

public class WrongCredentials extends BaseClass {


    public void wrongCred() {
        initialize();
        //keeping credentials blank
        Sauce.pageObject.LoginPage.submit().click();
        String error = Sauce.pageObject.LoginPage.usernameReqText().getText();
        if (error.equals("Epic sadface: Username is required")) {
            System.out.println("Blank credentials did not get accepted");
        }

        //Entering wrong credentials
        Sauce.pageObject.LoginPage.username().sendKeys("xyz");
        Sauce.pageObject.LoginPage.password().sendKeys("hello");
        Sauce.pageObject.LoginPage.submit().click();

        String error2 = Sauce.pageObject.LoginPage.usernameDntMatchText().getText();
        if (error2.equals("Epic sadface: Username and password do not match any user in this service")) {
            System.out.println("Invalid credentials did not get accepted");
        }

        Sauce.pageObject.LoginPage.username().clear();
        Sauce.pageObject.LoginPage.password().clear();

        //validating lockedout user
        Sauce.pageObject.LoginPage.username().sendKeys("locked_out_user");
        Sauce.pageObject.LoginPage.password().sendKeys("secret_sauce");

        String error3 = Sauce.pageObject.LoginPage.lockedUserText().getText();
        if (error3.equals("Epic sadface: Sorry, this user has been locked out.")) {
            System.out.println("User is locked out");
        }


    }

}
