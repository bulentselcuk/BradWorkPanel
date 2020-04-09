package com.vytrack.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

public abstract class TestBase {
    public WebDriver driver;
    public Actions action;

 @BeforeMethod
    public void setup() {
        driver = Driver.getDriver ();
        action = new Actions ( driver );
        driver.manage ().timeouts ().implicitlyWait ( Long.valueOf ( ConfigurationReader.getProperty ( "implicitwait" ) ),TimeUnit.SECONDS );
        driver.manage ().window ().maximize ();
        driver.get ( ConfigurationReader.getProperty ( "URL" ) );
    }
    @AfterMethod
    public void teardown() {
        BrowserUtils.wait ( 1 );
        driver.quit ();

    }
}
