package com.vytrack.pages;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FuelLogsPage {


    @FindBy(xpath="/html/body/div[2]/div[2]/header/div[2]/ul/li[1]/a/span")
    private WebElement fleet;
    @FindBy(xpath="/html/body/div[2]/div[2]/header/div[2]/ul/li[1]/div/div/ul/li[7]/a/span")
    private WebElement fuel;

    public FuelLogsPage() {
        PageFactory.initElements ( Driver.getDriver (), this );
    }
    public void fuel(){
        fleet.click ();
        fuel.click ();
        BrowserUtils.waitForPageToLoad ( 10 );
        BrowserUtils.wait ( 3 );
    }
}
