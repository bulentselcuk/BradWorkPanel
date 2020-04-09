package com.vytrack.tests;

import com.vytrack.pages.FuelLogsPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FuelLoogsTest extends TestBase {

    @Test
    public void fuelLogTest() {
        LoginPage loginPage=new LoginPage ();
        FuelLogsPage fuelLogsPage = new FuelLogsPage ();


        loginPage.login ( ConfigurationReader.getProperty ( "trackusername" ), ConfigurationReader.getProperty ( "trackpassword" ) );
        BrowserUtils.wait ( 3 );
        fuelLogsPage.fuel ();
        String expected = "Vehicle Fuel Logs";
        BrowserUtils.wait ( 2 );
        String actual = driver.findElement( By.className("oro-subtitle")).getText();
        System.out.println (actual);
        Assert.assertEquals(actual, expected);


    }
}
