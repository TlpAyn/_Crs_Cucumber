package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _04_CitiziensShipSteps {

    LeftNav lv = new LeftNav();
    DialogContent dc = new DialogContent();
    @Then("Navigate to citiziens page")
    public void navigateToCitiziensPage() {
        lv.clickFuntion(lv.setup);
        lv.clickFuntion(lv.parameters);
        lv.clickFuntion(lv.citiziensSchip);
    }

    @Then("Already exist message should be displayed")
    public void alreadyExistMessageShouldBeDisplayed() {

        dc.verifyContainsTextFunction(dc.alreadyExist,"already");
    }

    @When("User delete the {string} ")
    public void userDeleteTheTODO(String arg0) {
    }

    @When("User a CitizienShip name as {string} short name as {string}")
    public void userACitizienShipNameAsShortNameAs(String name, String shortName) {
        dc.clickFuntion(dc.plusButton);
        dc.sendKeysFunction(dc.nameInput,name);
        dc.sendKeysFunction(dc.shortName, shortName);
        dc.clickFuntion(dc.saveButton);
    }
}
