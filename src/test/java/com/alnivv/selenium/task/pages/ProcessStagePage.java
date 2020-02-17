package com.alnivv.selenium.task.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProcessStagePage {

    private WebDriver driver;

    public ProcessStagePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(linkText = "Стадии процессов")
    WebElement procStageBtn;

    @FindBy (linkText = "Добавить элемент")
    WebElement procStageAddBtn;

    @FindBy (name = "ProcessTypeName")
    WebElement procStageNameBtn;

    @FindBy (name = "ProcessType")
    WebElement procTypeDropDown;

    By procTypeItem = By.xpath("//option[. = 'Контроль предписаний по проверке']");

    @FindBy (name = "ResponsibilityType")
    WebElement respTypeDropDown;

    By respTypeItem = By.xpath("//option[. = 'Юридический Владелец']");

    @FindBy (name = "SaveButton")
    WebElement saveBtn;

    @FindBy (name = "Filter")
    WebElement procStageFilterBtn;

    @FindBy(css = ".btn-search")
    WebElement procStageSearchBtn;

    @FindBy(css = ".dot")
    WebElement dotItem;

    @FindBy(name = "DeleteButton")
    WebElement procStageDeleteBtn;

    @FindBy(name = "ConfirmButtonYes")
    WebElement procStageDeleteConfirmBtn;


    public void selectProcessStage() {
        procStageBtn.click();
    }


    public void addProcessStage() {
        procStageAddBtn.click();
    }


    public void switchToProcessStageNameFilling() {
        procStageNameBtn.click();
    }
    public void fillProcessStageName(String processStageName) {
        procStageNameBtn.sendKeys(processStageName);
    }

    public void addProcessTypeOption () {
        procTypeDropDown.click();
        procTypeDropDown.findElement(procTypeItem).click();
        procTypeDropDown.click();
    }

    public void addResponsibilityTypeOption () {
        respTypeDropDown.click();
        respTypeDropDown.findElement(respTypeItem).click();
        respTypeDropDown.click();
    }

    public void doubleSave () {
        saveBtn.click();
        saveBtn.click();
    }

    public void switchToProcessStageFiltering() {
        procStageFilterBtn.click();
    }

    public void fillProcessStageFilter(String procStageName) {
        procStageFilterBtn.sendKeys(procStageName);
    }

    public void searchProcessStage() {
        procStageSearchBtn.click();
        dotItem.click();
    }

    public void deleteProcessStage() {
        procStageDeleteBtn.click();

    }

    public void deleteProcessStageConfirm() {
        procStageDeleteConfirmBtn.click();
    }


}
