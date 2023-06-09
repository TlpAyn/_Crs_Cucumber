package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LeftNav extends Parent {
    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup;

    @FindBy(xpath = "(//span[text()='Parameters'])[1]")
    public WebElement parameters;

    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    public WebElement countries;

    @FindBy(xpath = "//span[text()='Citizenships']")
    public WebElement citiziensSchip;
    @FindBy(xpath = "(//span[text()='Fees'])[1]")
    public WebElement fees;
    @FindBy(xpath = "(//span[text()='Nationalities'])[1]")
    public WebElement nationalities;
    @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
    public WebElement entranceExamsOne;
    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    public WebElement setupTwo;
    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    public WebElement entranceExamsTwo;
    @FindBy(xpath = "//span[text()='States']")
    private WebElement states;


    public WebElement getWebelement(String strButton){

        switch (strButton){

            case "setup" : return setup;
            case "parameters" : return parameters;
            case "countries" : return countries;
            case "citiziensSchip" : return citiziensSchip;
            case "fees" : return fees;
            case "nationalities" : return nationalities;
            case "entranceExamsOne" : return entranceExamsOne;
            case "setupTwo" : return setupTwo;
            case "entranceExamsTwo" : return entranceExamsTwo;
            case "states" : return states;
        }
        return null;
    }
}
