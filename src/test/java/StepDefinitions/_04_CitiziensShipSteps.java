package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages.Parent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _04_CitiziensShipSteps extends Parent {

    LeftNav lv = new LeftNav();
    DialogContent dc = new DialogContent();

    @Then("Navigate to citiziens page")
    public void navigateToCitiziensPage() {
        lv.clickFunction(lv.setup);
        lv.clickFunction(lv.parameters);
        lv.clickFunction(lv.citiziensSchip);
    }

    @Then("Already exist message should be displayed")
    public void alreadyExistMessageShouldBeDisplayed() {

        dc.verifyContainsTextFunction(dc.alreadyExist, "already");
    }

    @When("User delete the {string} ")
    public void userDeleteTheTODO(String arg0) {
    }

    @When("User a CitizienShip name as {string} short name as {string}")
    public void userACitizienShipNameAsShortNameAs(String name, String shortName) {
        dc.clickFunction(dc.addButton);
        dc.sendKeysFunction(dc.nameInput, name);
        dc.sendKeysFunction(dc.shortName, shortName);
        dc.clickFunction(dc.saveButton);
    }

    @When("User delete the {string}")
    public void userDeleteThe(String name) {

        dc.sendKeysFunction(dc.searchInput, name);
        dc.clickFunction(dc.searchButton);

        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));

        dc.clickFunction(dc.deleteButton);
        dc.clickFunction(dc.SeconddeleteButton);

    }

    @And("Close the window")
    public void closeTheWindow() {
        dc.clickFunction(dc.closeWindow);
    }
}
