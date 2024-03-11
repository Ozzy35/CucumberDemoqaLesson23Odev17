package Util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    //amacmımız ılerleyen asamada bı daha drıver drıver hepsını tnaımlamak ıstemıyoruz ılerıde xml olsuturdugumuzda hangı browser ıstıyorsak buaray yazıp calıstıyırcaaz,pc de bu tarayıcalr ındırılmıs olmalı
    static WebDriver driver;
    static Properties properties;

    public static WebDriver initialize_Driver(String browsers) {

        properties = ConfigReader.getProperties();
        if (browsers.equals("Chrome")){
            WebDriverManager.chromedriver().setup();
            driver =new ChromeDriver();
        }else if (browsers.equals("Firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver =new FirefoxDriver();

        }else {
            WebDriverManager.edgedriver().setup();
            driver =new EdgeDriver();
        }

        String url =properties.getProperty("url");
        int pageWait=Integer.parseInt(properties.getProperty("pageLoadTimeOut"));
        int impWait =Integer.parseInt(properties.getProperty("implicityWait"));
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(pageWait, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(pageWait, TimeUnit.SECONDS);
        return getDriver();
    }
    public static WebDriver getDriver(){
        return driver;
    }

}
