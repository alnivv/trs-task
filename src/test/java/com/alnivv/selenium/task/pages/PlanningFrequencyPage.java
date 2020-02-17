package com.alnivv.selenium.task.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlanningFrequencyPage {
    private WebDriver driver;

    public PlanningFrequencyPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(linkText = "Периодичность планирования")
    WebElement planFreqBtn;

    @FindBy (linkText = "Добавить элемент")
    WebElement planFreqAddBtn;

    @FindBy (css = ".arrow-down")
    WebElement arrowDown;

    @FindBy (css = ".dd-item:nth-child(19) > .dd-item-button" )
    WebElement listItem;

    @FindBy (name = "DaysCount")
    WebElement daysCountBtn;

    @FindBy (name = "SaveButton")
    WebElement saveBtn;

    @FindBy (name = "Filter")
    WebElement planFreqFilterBtn;

    @FindBy(css = ".btn-search")
    WebElement planFreqSearchBtn;

    @FindBy(css = ".dot")
    WebElement dotItem;

    @FindBy(name = "DeleteButton")
    WebElement planFreqDeleteBtn;

    @FindBy(name = "ConfirmButtonYes")
    WebElement planFreqDeleteConfirmBtn;




    public void selectPlanningFrequency() {
        planFreqBtn.click();
    }


    public void addPlanningFreqency() {
        planFreqAddBtn.click();
    }

    public void switchToDaysCountFilling() {
        arrowDown.click();
        listItem.click();
        daysCountBtn.click();
    }

    public void fillDaysCount(String daysCount) {
        daysCountBtn.sendKeys(daysCount);
    }

    public void save () {
        saveBtn.click();
    }

    public void switchToPlanningFrequencyFiltering() {
        planFreqFilterBtn.click();
    }

    public void fillPlanningFrequencyFilter(String daysCount) {
        planFreqFilterBtn.sendKeys(daysCount);
    }

    public void searchPlanningFrequency() {
        planFreqSearchBtn.click();
        dotItem.click();
    }

    public void deletePlanningFrequency() {
        planFreqDeleteBtn.click();

    }

    public void deletePlanningFrequencyConfirm() {
        planFreqDeleteConfirmBtn.click();
    }


}
