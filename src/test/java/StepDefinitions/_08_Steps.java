package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _08_Steps {

    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @And("Click first item")
    public void clickFirstItem() {

        Actions actions = new Actions(GWD.getDriver());

        actions.sendKeys(Keys.DOWN).perform();

        actions.sendKeys(Keys.ENTER).build().perform();
    }
}


