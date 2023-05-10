package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//span[text()='Accept All']")
    WebElement accpetCookies;
    @CacheLookup
    @FindBy(id = "keywords")
    WebElement jobTitleField;
    @CacheLookup
    @FindBy(id = "location")
    WebElement locationField;
    @CacheLookup
    @FindBy(xpath = "//select[@class='hp-distance form__select']")
          //  @FindBy(xpath = "//select[@id='distance']")
    WebElement selectDistance;
    @CacheLookup
    @FindBy(xpath = "//div[@class='hp-search-more']//button[@type='button']")
    WebElement moreSearch;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Salary Min']")
    WebElement salaryMin;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Salary Max']")
    WebElement salaryMax;

    @CacheLookup
    @FindBy(xpath = "//select[@class='hp-sal-type form__select']")
    WebElement salaryType;
    @CacheLookup
    @FindBy(xpath = "//select[@class='hp-jobtype form__select']")
    WebElement jobType1;
    @CacheLookup
    @FindBy(xpath = "//input[@value='Find Jobs']")
    WebElement findJobButton;
    public void acceptCookies(){
        CustomListeners.test.log(Status.PASS, "Click On Accept");
        Reporter.log("Click On Accept" + accpetCookies.toString());
        clickOnElement(accpetCookies);
    }
    public void enterJobTitle(String jobTitle){
        CustomListeners.test.log(Status.PASS, "Enter Job Title");
        Reporter.log("Enter job Title" + jobTitleField.toString());

        sendTextToElement(jobTitleField, jobTitle);
    }
    public void enterLocation(String location){
        CustomListeners.test.log(Status.PASS, "Enter Location");
        Reporter.log("Enter Location" + locationField.toString());
        sendTextToElement(locationField,location);
    }
    public void selectDistance(String distance){
        CustomListeners.test.log(Status.PASS, "Select Distance");
        Reporter.log("Select Distance" + selectDistance.toString());
        selectByVisibleTextFromDropDown(selectDistance, distance);
    }
    public void clickOnMoreSearchOptionLink(){
        CustomListeners.test.log(Status.PASS, "Click On More Search Option Link");
        Reporter.log("Click On More Search Option Link" + moreSearch.toString());
        clickOnElement(moreSearch);
    }
    public void enterMinSalary(String minSalary){
        CustomListeners.test.log(Status.PASS, "Enter Min Salary");
        Reporter.log("Enter Min Salary" + salaryMin.toString());
        sendTextToElement(salaryMin,minSalary);
    }
    public void enterMaxSalary(String maxSalary){
        CustomListeners.test.log(Status.PASS, "Enter Max Salary");
        Reporter.log("Enter Max Salary" + salaryMax.toString());
        sendTextToElement(salaryMax,maxSalary);
    }
    public void selectSalaryType(String sType){
        CustomListeners.test.log(Status.PASS, "Select Salary Type");
        Reporter.log("Select Salary Type" + salaryType.toString());
        selectByVisibleTextFromDropDown(salaryType,sType);
    }
    public void selectJobType(String jobType){
        CustomListeners.test.log(Status.PASS, "Select Job Type");
        Reporter.log("Select Job Type" + jobType1.toString());
        selectByVisibleTextFromDropDown(jobType1,jobType);
    }
    public void clickOnFindJobsButton(){
        CustomListeners.test.log(Status.PASS, "Click On Find Job Button");
        Reporter.log("Click On Find Job Button" + findJobButton.toString());
        clickOnElement(findJobButton);
    }

}


