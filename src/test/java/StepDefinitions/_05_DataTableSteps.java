package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.DataTable;

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


    }

    @And("Write username and passsword as Database")
    public void writeUsernameAndPassswordAsDatabase() {
    }
}
