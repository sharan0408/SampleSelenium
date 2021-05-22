package Sauce.test;


import Sauce.resources.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProblemUser extends BaseClass {

    public void problemUser() {
        initialize();
        WebDriverWait wait = new WebDriverWait(driver, 20);

        Sauce.pageObject.LoginPage.username().sendKeys("problem_user");
        Sauce.pageObject.LoginPage.password().sendKeys("secret_sauce");
        Sauce.pageObject.LoginPage.submit().click();

        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Products']")));
        //take screenshot for problematic user
        //File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(src,new File("C:\\Users\\OCFC\\IdeaProjects\\SauceDemo1\\Screenshots\\failedd.png"));
        driver.close();
    }
}
