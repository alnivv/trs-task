package com.alnivv.selenium.task.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProcessTypePage {
    private WebDriver driver;

    public ProcessTypePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }


    @FindBy (linkText = "Виды процессов")
    WebElement procTypeBtn;

    @FindBy (linkText = "Добавить элемент")
    WebElement procTypeAddBtn;

    @FindBy (name = "ProcessTypeName")
    WebElement procTypeNameBtn;

    @FindBy (name = "SaveButton")
    WebElement saveBtn;

    @FindBy (name = "Filter")
    WebElement procTypeFilterBtn;

    @FindBy(css = ".btn-search")
    WebElement procTypeSearchBtn;

    @FindBy(css = ".table-container")
    WebElement tableItem;

    @FindBy(css = ".dot")
    WebElement dotItem;
    
    @FindBy(name = "DeleteButton")
    WebElement procTypeDeleteBtn;

    @FindBy(name = "ConfirmButtonYes")
    WebElement procTypeDeleteConfirmBtn;


    public void selectProcessType() {
        procTypeBtn.click();
    }


    public void addProcessType() {
        procTypeAddBtn.click();
    }


    public void switchToProcessTypeNameFilling() {
        procTypeNameBtn.click();
    }
    public void fillProcessTypeName(String processTypeName) {
        procTypeNameBtn.sendKeys(processTypeName);
    }

    public void doubleSave () {
        saveBtn.click();
        saveBtn.click();
    }

    public void switchToProcessTypeFiltering() {
        procTypeFilterBtn.click();
    }

    public void fillProcessTypeFilter(String processTypeName) {
        procTypeFilterBtn.sendKeys(processTypeName);
    }

    public void searchProcessType () {
        procTypeSearchBtn.click();
        tableItem.click();
        dotItem.click();
    }
    
    public void deleteProcessType() {
        procTypeDeleteBtn.click();
        
    }

    public void deleteProcessTypeConfirm() {
        procTypeDeleteConfirmBtn.click();
    }


}
