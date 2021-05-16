package Sauce.resources;

import org.json.JSONString;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileReader;
import java.util.concurrent.TimeUnit;

public class BaseClass {

   public static WebDriver driver;


    public WebDriver initialize()
    {
        JSONParser parser = new JSONParser();
        try {//give directory path
            Object obj = parser.parse(new FileReader("C:\\Users\\OCFC\\Downloads\\E2EProject\\Final\\src\\Sauce\\resources\\hrll.json"));
            JSONObject jsonObject = (JSONObject)obj;
            String url = (String)jsonObject.get("urlname");
            String chromeDriver = (String)jsonObject.get("chromedriver");
            String driverPath = (String)jsonObject.get("driverpath");
            //JSONArray subjects = (JSONArray)jsonObject.get("Subjects");

            System.setProperty(chromeDriver, driverPath);
            driver = new ChromeDriver();

            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            //opening the URL
            driver.get(url);
            //Maximizing the window
            driver.manage().window().maximize();

        } catch(Exception e) {
            e.printStackTrace();
        }
        return  driver;
    }


}

