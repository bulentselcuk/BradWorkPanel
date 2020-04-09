package com.vytrack.tests;

import com.vytrack.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class FuelLogsTestSingle {

    public WebDriver driver;
    public Actions action;

    private By usernameBy=By.id ( "prependedInput" );
    private By passwordBy=By.id ( "prependedInput2" );
    public String trackusername="user42";
    public String trackpassword="UserUser123";
    private By actionsBy = By.xpath ( "/html/body/div[2]/div[2]/header/div[2]/ul/li[1]/a/span" );
    private By fuelBy = By.xpath ( "/html/body/div[2]/div[2]/header/div[2]/ul/li[1]/div/div/ul/li[7]/a/span" );
    @Test
    public void fuel() {
        String expected = "Vehicle Fuel Logs";
        BrowserUtils.wait ( 2 );
        String actual = driver.findElement(By.className("oro-subtitle")).getText();
        System.out.println (actual);
        Assert.assertEquals(actual, expected);

    }
    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver ().version ( "79" ).setup ();
        driver=new ChromeDriver ();
        driver.get ( "https://app.vytrack.com/user/login" );
        driver.manage ().window ().maximize ();
        driver.findElement ( usernameBy ).sendKeys ( trackusername );
        driver.findElement ( passwordBy ).sendKeys ( trackpassword, Keys.ENTER );
        BrowserUtils.wait ( 3 );
        driver.findElement ( actionsBy ).click ();
        driver.findElement(fuelBy).click();
    }
    @AfterMethod
    public void teardown() {
        BrowserUtils.wait ( 4);
        driver.quit ();

    }
}
