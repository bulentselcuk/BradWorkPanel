package com.vytrack.tests;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage loginPage=new LoginPage ();

    @Test
    public void login() {


        String username=ConfigurationReader.getProperty ( "trackusername" );
        String password=ConfigurationReader.getProperty ( "trackpassword" );
        loginPage.login ( username, password );
        BrowserUtils.wait ( 3 );
        String expected = "Quick Launchpad";
        String actual = driver.findElement( By.className("oro-subtitle")).getText();
        System.out.println (actual);
        Assert.assertEquals(actual, expected);


    }

}
