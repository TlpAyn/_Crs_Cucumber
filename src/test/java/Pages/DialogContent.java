package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "input[formcontrolname='username']")
    public WebElement username;
    @FindBy(css = "input[formcontrolname='password']")
    public WebElement password;
    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(css = "span[class='mat-tooltip-trigger logo-text']")
    public WebElement TxtTechnoStudy;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    public WebElement nameInput;
    @FindBy(xpath = "// ms-text-field[@formcontrolname='code']/input")
    public WebElement codeInput;
    @FindBy(xpath = "//ms-add-button[contains(@tooltip, 'ADD')]//button")
    public WebElement plusButton;
    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(xpath = "//ms-save-button/button")
    public WebElement saveButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    public WebElement shortName;

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    public WebElement alreadyExist;

    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    public WebElement closeWindow;

    @FindBy(xpath = "//input[@data-placeholder='Name']")
    public WebElement CitizienName;

    @FindBy(xpath = "//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-accent']")
    public WebElement searchButton;

    @FindBy(xpath = "//ms-delete-button")
    public WebElement deleteButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement SeconddeleteButton;

    @FindBy(xpath = "//*[@data-icon='plus']")
    public WebElement CitiziensPlus;



    public WebElement getDialogElement(String strElement) {

        switch (strElement) {

            case "plusButton":
                return plusButton;
            case "CitiziensPlus":
                return  CitiziensPlus;
                case "saveButton":
                return  saveButton;
        }
        return null;
    }


}

