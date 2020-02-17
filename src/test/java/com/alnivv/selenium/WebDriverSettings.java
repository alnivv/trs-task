package com.alnivv.selenium;

import com.alnivv.selenium.task.pages.StartPage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

public class WebDriverSettings {
    protected WebDriver driver;
    protected JavascriptExecutor js;
    protected Map<String, Object> vars;
    protected StartPage startPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<>();
        startPage = new StartPage(driver);

        System.out.println("STEP 1: Start page opening");
        startPage.open();

        System.out.println("STEP 2: NSI selecting from navigation menu");
        startPage.getStarted();

    }


    @After
    public void tearDown() {
        if (driver != null)
            driver.quit();
    }
}
