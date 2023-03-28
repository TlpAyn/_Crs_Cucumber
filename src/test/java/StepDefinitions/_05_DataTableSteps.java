package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class _05_DataTableSteps {
    @When("Write username {string}")
    public void writeUsername(String username) {

        System.out.println("Username = "+ username);
    }

    @And("Write username and pasword {string} and {string}")
    public void writeUsernameAndPaswordAnd(String userName, String password) {
        System.out.println("username and Password = "+ userName +" "+ password);
    }

    @And("Write username as DataTable")
    public void writeUsernameAsDataTable(DataTable elemanlar) {
        List<String> ListElemanlar = elemanlar.asList(String.class);

        for (String u:ListElemanlar) {
            System.out.println("u = "+ u);      }
    }

    @And("Write username and passsword as Database")
    public void writeUsernameAndPassswordAsDatabase(DataTable elemanlar) {
        List< List<String> > listElemanlar= elemanlar.asLists(String.class);

        for (int i = 0; i < listElemanlar.size(); i++) {
            System.out.println("listElemanlar = " + listElemanlar.get(i).get(0)+" "+
                    listElemanlar.get(i).get(1) );
        }

    }


}
