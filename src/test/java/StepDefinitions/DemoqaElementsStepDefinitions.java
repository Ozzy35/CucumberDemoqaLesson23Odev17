package StepDefinitions;

import Pages.DemoqaElementsPages;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class DemoqaElementsStepDefinitions {
    WebDriver driver= DriverFactory.getDriver();
    DemoqaElementsPages demoqaElementsPages=new DemoqaElementsPages(driver);

    @Given("Go to the DemoqaElements Website & Click {string} section")
    public void goToTheDemoqaElementsWebsiteClickSection(String arg0) {
        DemoqaElementsPages.HomePage();

    }

    @When("Click Buttons Section")
    public void clickButtonsSection() {
        DemoqaElementsPages.clickButtonsSection();
    }

    @When("Click {string} Section")
    public void clickSection(String arg0) {
        DemoqaElementsPages.clickSection();
    }

    @Then("See the message")
    public void seeTheMessage() {
        DemoqaElementsPages.seeTheMessage();
    }
}
//sayfalarla ılıskılendırdık demoqaelemnts pages altında metodları olusturduk