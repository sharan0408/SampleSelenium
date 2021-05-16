package Sauce;

import Sauce.pageObject.ObjAddCart;
import Sauce.resources.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddCart extends BaseClass {


    public void addCart() {
         initialize();
        Sauce.pageObject.LoginPage.username().sendKeys("standard_user");
        Sauce.pageObject.LoginPage.password().sendKeys("secret_sauce");
        Sauce.pageObject.LoginPage.submit().click();

        //adding items to cart
        List<WebElement> lists = ObjAddCart.addCart();
        for (WebElement list : lists) {
            list.click();
        }
        ObjAddCart.cartLink().click();
        int itemsadded = ObjAddCart.cartItems().size();
        if (lists.size() == itemsadded) {
            System.out.println("All items added successfully");
        }
        float sum = 0;
        List<WebElement> prices = ObjAddCart.itemsPrice();
        for (WebElement price : prices) {
            float tot = Float.parseFloat(price.getText().replace("$", ""));
            sum = sum + tot;
        }
        System.out.println(sum);
        //System.out.println(count);
        ObjAddCart.checkout().click();

        ObjAddCart.firstN().sendKeys("Sharan");
        ObjAddCart.lastN().sendKeys("Kaur");
        ObjAddCart.postal().sendKeys("160030");
        ObjAddCart.cont().click();
        String priceWithoutTax = ObjAddCart.totalPrice().getText().split(": ")[1].trim();

        float pri = Float.parseFloat(priceWithoutTax.replace("$", "").trim());
        System.out.println(pri);

        if (sum == pri) {
            System.out.println("Items total price validated");
        }
        driver.close();
    }


}
