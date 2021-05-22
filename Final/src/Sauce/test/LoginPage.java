package Sauce.test;

import Sauce.resources.BaseClass;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BaseClass {



    public void login() {
        initialize();
        //Validating the title of the page
        System.out.println("Title name= " + driver.getTitle());

        if (driver.getTitle().contains("Swag Labs")) {
            System.out.println("The page has opened successfully");
        }
        //validating the placeholders of the username and password fields
        String username = Sauce.pageObject.LoginPage.username().getAttribute("placeholder");

        if (username.equals("Username")) {
            System.out.println("Correct Placeholder for Username field");
        }

        String password = Sauce.pageObject.LoginPage.password().getAttribute("placeholder");
        if (password.equals("Password")) {
            System.out.println("Correct Placeholder for Password field");
        }
        //validating credentials
        Sauce.pageObject.LoginPage.username().sendKeys("standard_user");
        Sauce.pageObject.LoginPage.password().sendKeys("secret_sauce");
        Sauce.pageObject.LoginPage.submit().submit();

        String title = Sauce.pageObject.LoginPage.pageText().getText();
        if (title.contains("PRODUCTS")) {
            System.out.println("User logged in successfully");
        }
        //Number of products
        int products = Sauce.pageObject.LoginPage.itemsSize().size();
        if (products == 6) {
            System.out.println("All " + products + " are getting displayed");
        }

        //logout
        Sauce.pageObject.LoginPage.menuBtn().click();
        Sauce.pageObject.LoginPage.logout().click();
        String acceptedusername = Sauce.pageObject.LoginPage.homePageText().getText();

        if (acceptedusername.contains("Accepted usernames are:")) {
            System.out.println("User Logged out successfully");
        }
        driver.quit();
    }
}
