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
import org.testng.Assert;

import java.time.Duration;

public class _01_LoginSteps {

    DialogContent dc = new DialogContent();

    @Given("Navigate to Campus")
    public void navigateToCampus() {

        GWD.getDriver().get("https://test.mersys.io/");
        GWD.getDriver().manage().window().maximize();
    }

    @When("Enter username and password click login button")
    public void enterUsernameAndPasswordClickLoginButton() {
        dc.sendKeysFunction(dc.username, "turkeyts");
        dc.sendKeysFunction(dc.password, "TechnoStudy123");
        dc.clickFuntion(dc.loginButton);
    }

    @Then("User scould login succesfully")
    public void userShouldLoginSuccessfully() {
        dc.verifyContainsTextFunction(dc.TxtTechnoStudy, "Techno Study");
    }

}

