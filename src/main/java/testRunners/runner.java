package testRunners;

import Util.DriverFactory;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;

@CucumberOptions(
        features = {"src/test/java/Feature"},
        glue = {"stepDefinitions","Util"},//stepdefınıtıon ,utıl package tanımı yer alıcak
        tags = "",
        plugin = {
                "summary","pretty","html:Reports/CucumberReport/Reports.html" //ozet oluca,renklenrıme adına .
        }

        //features dosyalarını nerye koyucaz

)

public class runner extends AbstractTestNGCucumberTests { //extend edıp class ozellıklerını alıcyoruz
    static WebDriver driver= DriverFactory.getDriver();


}
//cucumber ayralarınıyaptıgımız yer daha sonra testng xml mızı burdan ayarlıycaz