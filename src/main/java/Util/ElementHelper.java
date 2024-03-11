package Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementHelper {
    WebDriver driver;
    WebDriverWait wait;

    Actions action;

    public ElementHelper(WebDriver driver){
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        this.action=new Actions(driver);
    }

    //elemaın gelıp gelmedıgını kontrol etmemı gerekıyor clıck send key olur vs onu kotrol etmelıyız soyle:
    public WebElement presenceElement(By key){ //elelanları by gore alıyoruz
        return
                wait.until(ExpectedConditions.presenceOfElementLocated(key)); //bu elemın return yap tum sartla olsusup tum elemn gorundugunde o zamana kadar wait yap dıyoruz
    }
    public WebElement findElement(By key){
        WebElement element =presenceElement(key);
        return element; //elemanı bekledık bulduk tıkaldık send key yapcaz sonrasında elemnın geldıgını kontrol edıccez

    }
    public void click (By key){
        findElement(key).click();
    }
    public void sendKey(By key,String text){
        findElement(key).sendKeys(text);
    }

}
