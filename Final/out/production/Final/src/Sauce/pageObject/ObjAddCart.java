package Sauce.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ObjAddCart {

    private static WebDriver driver;

    public ObjAddCart(WebDriver driver) {
        this.driver = driver;
    }

    public static WebElement cartLink() {
        return driver.findElement(By.className("shopping_cart_link"));
    }

    public static List<WebElement> cartItems() {
        return driver.findElements(By.className("cart_item"));
    }

    public static List<WebElement> itemsPrice() {
        return driver.findElements(By.className("inventory_item_price"));
    }

    public static WebElement firstN() {
        return driver.findElement(By.id("first-name"));
    }

    public static WebElement lastN() {
        return driver.findElement(By.id("last-name"));
    }

    public static WebElement postal() {
        return driver.findElement(By.id("postal-code"));
    }

    public static WebElement cont() {
        return driver.findElement(By.id("continue"));
    }

    public static List<WebElement> addCart() {
        return driver.findElements(By.xpath("//button[text()='Add to cart']"));
    }

    public static WebElement checkout() {
        return driver.findElement(By.id("checkout"));
    }

    public static WebElement totalPrice() {
        return driver.findElement(By.className("summary_subtotal_label"));
    }

}
