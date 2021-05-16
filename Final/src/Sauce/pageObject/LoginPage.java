package Sauce.pageObject;

import Sauce.resources.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginPage extends BaseClass {


    //public LoginPage(WebDriver driver) {
   //     this.driver = driver;
    //}

    public static WebElement username() {
        return driver.findElement(By.cssSelector("input[placeholder='Username']"));
    }

    public static WebElement password() {
        return driver.findElement(By.cssSelector("input[placeholder='Password']"));
    }

    public static WebElement submit() {
        return driver.findElement(By.cssSelector("input[type='submit']"));
    }

    public static WebElement pageText() {
        return driver.findElement(By.xpath("//span[text()='Products']"));
    }

    public static List<WebElement> itemsSize() {
        return driver.findElements(By.className("inventory_item"));
    }

    public static WebElement menuBtn() {
        return driver.findElement(By.id("react-burger-menu-btn"));
    }

    public static WebElement logout() {
        return driver.findElement(By.id("logout_sidebar_link"));
    }

    public static WebElement homePageText() {
        return driver.findElement(By.cssSelector("div[id='login_credentials'] h4"));
    }

    public static WebElement usernameReqText() {
        return driver.findElement(By.xpath("//div[@class='error-message-container error']/h3"));
    }

    public static WebElement usernameDntMatchText() {
        return driver.findElement(By.xpath("//div[@class='error-message-container error']/h3"));
    }

    public static WebElement lockedUserText() {
        return driver.findElement(By.xpath("//div[@class='error-message-container error']/h3"));
    }
}
