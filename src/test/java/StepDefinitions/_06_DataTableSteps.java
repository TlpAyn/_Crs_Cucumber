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
            ln.clickFunction(element);

        }

        }

    @And("Click on the element in Dialog")
    public void clickOnTheElementInDialog(DataTable items) {

        List<String> dcElements= items.asList(String.class);

        for ( String a: dcElements) {
            WebElement element = dc.getDialogElement(a);
            dc.clickFunction(element);

        }
    }



    @And("User delete item from Dialog Content")
    public void userDeleteItemFromDialogContent(DataTable dt) {
        List<String> strButtons=dt.asList(String.class);

        for (String strDeleteText: strButtons) {
            dc.deleteItem(strDeleteText);
        }
    }


    @And("User sending the keys in Dialog Content")
    public void userSendingTheKeysInDialogContent(DataTable dt) {
        List< List<String> > items= dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement element= dc.getDialogElement(items.get(i).get(0));
            dc.sendKeysFunction(element, items.get(i).get(1));
        }
    }
}


