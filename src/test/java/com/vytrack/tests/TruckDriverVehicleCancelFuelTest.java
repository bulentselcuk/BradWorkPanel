package com.vytrack.tests;

import com.vytrack.pages.FuelLogsPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.pages.TruckDriverVehicleCancelFuelPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.TestBase;
import org.testng.annotations.Test;

public class TruckDriverVehicleCancelFuelTest extends TestBase {

    @Test
    public void TruckDriverCancelTest(){

        LoginPage loginpage  = new LoginPage ();
        FuelLogsPage fuelLogsPage = new FuelLogsPage ();
        TruckDriverVehicleCancelFuelPage truckDriverVehicleCancelFuelPage = new TruckDriverVehicleCancelFuelPage ();


        loginpage.login ( ConfigurationReader.getProperty ( "trackusername" ),ConfigurationReader.getProperty ("trackpassword") );
        BrowserUtils.wait ( 3 );
        fuelLogsPage.fuel ();
        truckDriverVehicleCancelFuelPage.Vehicle2 ();


    }
}
