package com.vytrack.pages;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TruckDriverVehicleCancelFuelPage {
    @FindBy(xpath="/html/body/div[2]/div[2]/header/div[2]/ul/li[1]/a/span")
    private WebElement fleet;
    @FindBy(xpath="/html/body/div[2]/div[2]/header/div[2]/ul/li[1]/div/div/ul/li[7]/a/span")
    private WebElement fuel;
    @FindBy(xpath="//*[@id=\"container\"]/div[2]/div/div/div[2]/a")
    private WebElement CreateVehicle2;
    @FindBy(xpath="/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/form/div[1]/div/div/div[2]/div[1]/div[1]/a")
    private WebElement Cancel;

    public TruckDriverVehicleCancelFuelPage() {
        PageFactory.initElements ( Driver.getDriver (), this );
    }

    public void Vehicle2() {
        CreateVehicle2.click ();
        BrowserUtils.wait ( 9 );
        Cancel.click ();
        BrowserUtils.wait ( 5 );

    }
}
