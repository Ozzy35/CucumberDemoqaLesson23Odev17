package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DemoqaElementsPages {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;
    static By clickButtonSection= new By.ByCssSelector("div[class='element-list collapse show'] li[id='item-4'] span[class='text']");
     static By clickSection= new By.ByCssSelector("#SprT4");


    public DemoqaElementsPages(WebDriver driver){
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        this.elementHelper=new ElementHelper(driver);
    }

    public static void HomePage() { //confıg urlde sıteyı cekıyor

    }

    public static void clickButtonsSection() {
        elementHelper.click(clickButtonSection);

        //element helper metodları olusturup clıck ıcın sendkey ıcın olusturucaz metodlar olusturucaz
    }

    public static void clickSection() {
        elementHelper.click(clickSection);

    }

    public static void seeTheMessage() {
        elementHelper.sendKey(clickSection,"You have done a dynamic click");

    }
}
