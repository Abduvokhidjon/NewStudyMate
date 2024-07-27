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

    @FindBy(xpath = "//div[@class=\"MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-qiwgdb\"]")
    public WebElement dropdown;

    @FindBy (xpath = "//li[@data-value=\"dayGridMonth\"]")
    public WebElement monthDropdown;

    @FindBy (xpath = "//li[@data-value=\"timeGridWeek\"]")
    public WebElement weekDropdown;

    @FindBy (xpath = "//li[@data-value=\"timeGridDay\"]")
    public WebElement dayDropdown;

    @FindBy (xpath = "//p[@class=\"sc-jIILKH eSCqcV\"]")
    public WebElement monthlyText;

    @FindBy (xpath = "//button[@class=\"MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium sc-eKJbhj kWQXzA css-1ua49gz\"][2]")
    public WebElement moveForward;
}
