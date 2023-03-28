package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _06_DataTableSteps {

    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @Then("Click on the element in LeftNav")
    public void clickOnTheElementInLeftNav(DataTable items) {

       List<String> strButtons= items.asList(String.class);

        for (String strButton: strButtons) {

            WebElement element = ln.getWebelement(strButton);
            ln.clickFuntion(element);

        }

        }

    @And("Click on the element in Dialog")
    public void clickOnTheElementInDialog(DataTable items) {

        List<String> dcElements= items.asList(String.class);

        for ( String a: dcElements) {
            WebElement element = dc.getDialogElement(a);
            dc.clickFuntion(element);

        }
    }
}

