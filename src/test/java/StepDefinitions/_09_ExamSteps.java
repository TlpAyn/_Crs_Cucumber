package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _09_ExamSteps {

    DialogContent dc = new DialogContent();
    @And("Click on the element in Dialog Content")
    public void clickOnTheElementInDialogContent(DataTable dt) {


        List<String> dcElements= dt.asList(String.class);

        for ( String a: dcElements) {
            WebElement element = dc.getDialogElement(a);
            dc.clickFunction(element);

        }

        List<List<String>> items= dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement element2= dc.getDialogElement(items.get(i).get(0));
            dc.clickFunction(element2);
        }
    }
}


