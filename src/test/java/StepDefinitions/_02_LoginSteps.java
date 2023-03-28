package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_LoginSteps {

    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @And("Navigate to country page")
    public void navigateToCountryPage() {
        ln.clickFunction(ln.setup);
        ln.clickFunction(ln.parameters);
        ln.clickFunction(ln.countries);
    }

    @When("create a country")
    public void createACountry() {

        dc.clickFunction(dc.addButton);
        dc.sendKeysFunction(dc.nameInput, "Deneme4Ulke10213");
        dc.sendKeysFunction(dc.codeInput,"23451441");
        dc.clickFunction(dc.saveButton);
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {

dc.verifyContainsTextFunction(dc.successMessage, "success");

    }

    @When("create a country name as {string} code as {string}")
    public void createACountryNameAsCodeAs(String name, String kod) {
        dc.clickFunction(dc.addButton);
        dc.sendKeysFunction(dc.nameInput, name);
        dc.sendKeysFunction(dc.codeInput, kod);
        dc.clickFunction(dc.saveButton);
    }
}
