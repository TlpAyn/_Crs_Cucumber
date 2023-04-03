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
    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")
    public WebElement codeInput;
    @FindBy(xpath = "//ms-add-button[contains(@tooltip, 'ADD')]//button")
    public WebElement addButton;
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
    public WebElement searchInput;

    @FindBy(xpath = "//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-accent']")
    public WebElement searchButton;

    @FindBy(xpath = "//ms-delete-button")
    public WebElement deleteButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement SeconddeleteButton;

    @FindBy(xpath = "//*[@data-icon='plus']")
    public WebElement CitiziensPlus;

    @FindBy(xpath = "(//input[@data-placeholder='Priority'])[2]")
    public WebElement priorityCode;

    @FindBy(xpath = "//mat-slide-toggle[@formcontrolname='active']")
    public WebElement toggleBar;

    @FindBy(xpath = "//input[@data-placeholder='Integration Code']")
    public WebElement integrationCode;

    @FindBy(xpath = "//mat-select//span[text()='Academic Period']")
    public WebElement academicPeriod;

    @FindBy(xpath = "(//mat-option/span)[1]")
    public WebElement academicPeriod1;

    @FindBy(xpath = "(//span[text()='Grade Level'])[1]")
    public WebElement gradeLevel;

    @FindBy(xpath = "(//mat-option//span)[2]")
    public WebElement gradeLevel2;
    @FindBy(xpath = "(//mat-option//span)[1]")
    public WebElement gradeLevel1;
    @FindBy(xpath = "(//mat-option//span)[3]")
    public WebElement gradeLevel3;
    @FindBy(xpath = "(//mat-option//span)[4]")
    public WebElement gradeLevel4;
    @FindBy(xpath = "(//mat-option//span)[5]")
    public WebElement gradeLevel5;


    public WebElement getDialogElement(String strElement) {

        switch (strElement) {

            case "addButton":
                return addButton;
            case "CitiziensPlus":
                return CitiziensPlus;
            case "saveButton":
                return saveButton;
            case "codeInput":
                return codeInput;
            case "nameInput":
                return nameInput;
            case "shortName":
                return shortName;
            case "integrationCode":
                return integrationCode;
            case "toggleBar":
                return toggleBar;
            case "priorityCode":
                return priorityCode;
            case "academicPeriod":
                return academicPeriod;
            case "academicPeriod1":
                return academicPeriod1;
            case "gradeLevel":
                return gradeLevel;
            case "gradeLevel2":
                return gradeLevel2;
            case "gradeLevel1":
                return gradeLevel1;
            case "gradeLevel3":
                return gradeLevel3;
            case "gradeLevel4":
                return gradeLevel4;
            case "gradeLevel5":
                return gradeLevel5;


        }
        return null;
    }

    public void deleteItem(String searchText) {
        sendKeysFunction(searchInput, searchText);
        clickFunction(searchButton);   //fuse-progress-bar/*   gözüküyor
        //beklet
        //1. StaleElemetn hatası verdi : erken buldum tez kaybettim
        //wait.until(ExpectedConditions.elementToBeClickable(searchButton));

        //fuse-progress-bar/*    bu 0 olana kadar beklet
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));

        clickFunction(deleteButton);
        clickFunction(SeconddeleteButton);
    }


}

