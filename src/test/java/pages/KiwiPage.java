package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KiwiPage {

    public KiwiPage() {
        PageFactory.initElements((WebDriver)Driver.getAndroidDriver(),this);
    }

    @FindBy(xpath = "(//*[@class='android.widget.Button'])[4]")
    public WebElement continueAsAGuestButton;

    @FindBy(xpath = "//*[@text='From:']")
    public WebElement fromButton;

    @FindBy(xpath = "//*[@text='To:']")
    public WebElement toButton;

    @FindBy(xpath = "//*[@text='Return']")
    public WebElement returnButton;

    @FindBy(xpath = "//*[@text='One way']")
    public WebElement oneWayButton;

    @FindBy(xpath = "//*[@content-desc='Clear All']")
    public WebElement clearAll;

    @FindBy(xpath = "//*[@class='android.widget.EditText']")
    public WebElement fromToTextBox;

    @FindBy(xpath = "(//*[@class='android.widget.Button'])[2]")
    public WebElement addDepartureAirportButton;

    @FindBy(xpath = "//*[@text='Choose']")
    public WebElement chooseButton;

    @FindBy(xpath = "(//*[@class='android.widget.Button'])[3]")
    public WebElement addArrivalAirportButton;

    @FindBy(xpath = "//*[@text='Departure:']")
    public WebElement departure;

    @FindBy(xpath = "//*[@text='Set date']")
    public WebElement setDateButton;

    @FindBy(xpath = "(//*[@text='Search'])[1]")
    public WebElement searchButton;

    @FindBy(xpath = "//*[@text='Best']")
    public WebElement bestButton;

    @FindBy(xpath = "//*[@text='Cheapest']")
    public WebElement cheapestButton;

    @FindBy(xpath = "//*[@text='Stops']")
    public WebElement stopsButton;

    @FindBy(xpath = "//*[@text='Nonstop']")
    public WebElement nonstopButton;

    @FindBy(xpath = "(//*[@class='android.widget.TextView'])[13]")
    public WebElement price;


















































}
