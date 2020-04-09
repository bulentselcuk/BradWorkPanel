package com.vytrack.tests;
import com.vytrack.pages.FuelLogsPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.pages.TruckDriverVehicleCreateFuelPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TruckDriverVehicleFuelLogCreateTest extends TestBase{

    @Test
    public void TruckDriverCreateTest(){
        LoginPage loginPage=new LoginPage ();
        FuelLogsPage fuelLogsPage=new FuelLogsPage ();
        TruckDriverVehicleCreateFuelPage truckDriverVehicleFuelPage = new TruckDriverVehicleCreateFuelPage ();
        loginPage.login ( ConfigurationReader.getProperty ( "trackusername" ), ConfigurationReader.getProperty ( "trackpassword" ) );
        BrowserUtils.wait ( 2 );
        fuelLogsPage.fuel ();
        truckDriverVehicleFuelPage.Vehicle ();

        String expected = "Create Vehicle Fuel Logs";
        BrowserUtils.wait ( 2 );
        String actual = driver.findElement (By.className ( "user-name" )).getText();
        System.out.println ( actual );
        Assert.assertEquals ( actual, expected );

    }
}
