package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _01_LoginSteps {
    @Given("Navigate to Campus")
    public void navigateToCampus() {

        GWD.getDriver().get("https://test.mersys.io/");
        GWD.getDriver().manage().window().maximize();

    }

    @When("Enter username and password click login button")
    public void enterUsernameAndPasswordClickLoginButton() {

        DialogContent dc= new DialogContent();

//        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
//        wait.until(ExpectedConditions.visibilityOf(dc.username));

        dc.username.sendKeys("turkeyts");
        dc.password.sendKeys("TechnoStudy123");
        dc.loginButton.click();


    }

    @Then("User scould login succesfully")
    public void userShouldLoginSuccesfully() {
        System.out.println("Merhaba 2");
    }
}
