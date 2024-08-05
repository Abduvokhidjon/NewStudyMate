package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SchedulePage {
    WebDriver driver;

    public SchedulePage() {
        this.driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//li[contains(@class,'MuiListIte')])[2]")
    public WebElement scheduleBtn;

    @FindBy(xpath = "//div[@aria-haspopup=\"listbox\"]")
    public WebElement dropdown;

    @FindBy (xpath = "//li[@data-value=\"dayGridMonth\"]")
    public WebElement monthDropdown;

    @FindBy (xpath = "//li[@data-value=\"timeGridWeek\"]")
    public WebElement weekDropdown;

    @FindBy (xpath = "//li[@data-value=\"timeGridDay\"]")
    public WebElement dayDropdown;

    @FindBy (xpath = "//p[@class=\"sc-jIILKH eSCqcV\"]")
    public WebElement monthlyText;

    //    @FindBy (xpath = "//button[@class=\"MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium sc-eKJbhj kWQXzA css-1ua49gz\"][2]")
//    public WebElement moveForward;
    @FindBy(xpath = "//div[@class=\"sc-iveFHk kqpnEj\"]")
    public WebElement knbkdButton;
    @FindBy(xpath = "(//p[@class=\"sc-kImNAt hesVgy\"])[1]")
    public WebElement testScheduleNote;
    @FindBy(xpath = "//p[@class=\"sc-kImNAt hesVgy\"]")
    public WebElement getTestScheduleNoteWeek;


}