package StepDefinitions;

import Pages.DialogContent;
import Utilities.DBUtility;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class _11_JDBCStepDefinitions {
    @Then("Send querty the Database {string} and control match")
    public void sendQuertyTheDatabaseAndControlMatch(String sorgu) {

        DialogContent dc = new DialogContent();
        List<WebElement> UIlist = dc.nameList;






        ArrayList<ArrayList<String>> dblist = DBUtility.getListData(sorgu);

        for (int i = 0; i < dblist.size(); i++) {
            System.out.print(dblist.get(i).get(1).trim());
            System.out.println("\t"+ UIlist.get(i).getText().trim());

            Assert.assertEquals(dblist.get(i).get(1).trim(),UIlist.get(i).getText().trim());

        }


    }
}
