package com.alnivv.selenium.task.pages;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartPage {
    private WebDriver driver;

    public StartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(id = "nav-trigger-label")
    WebElement navigationMenu;


    @FindBy(linkText = "НСИ")
    WebElement nsiItem;

    @FindBy(css = ".treenode-root > li:nth-child(1) > label")
    WebElement firstNsiItem;


    public void open() {

        driver.get("http://192.168.111.248/");
        driver.manage().window().setSize(new Dimension(1936, 1056));
    }


    public void getStarted() {
            navigationMenu.click();
            nsiItem.click();
            firstNsiItem.click();
    }
}

