package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CommonPage {
    WebDriver driver;
    public CommonPage() {
        this.driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//li[contains(@class,'MuiListIte')])[2]")
    public WebElement scheduleBtn;

    @FindBy(xpath = "(//li[contains(@class,'MuiListIte')])[1]")
    public WebElement myCoursesBtn;

    @FindBy(xpath = "//span[@class=\"sc-hTBuwn ckeXbs\"]")
    public WebElement userIcon;

    @FindBy(xpath = "//ul[@class=\"MuiList-root MuiList-padding MuiMenu-list css-r8u8y9\"]")
    public WebElement logOutIcon;

    @FindBy(xpath = "//button[text()='Log out']")
    public WebElement logOutOption;

    @FindBy(xpath = "//p[contains(text(),'Student')]")
    public WebElement user;

    @FindBy(xpath = "//div[@class='sc-lllmON lnzwxX']")
    public WebElement logoutWindow;

    public void openLogoutWindow(){
        userIcon.click();
        logOutIcon.click();
    }

    public int getXofElement(WebElement element){
        return element.getLocation().getX();
    }
    public int getYofElement(WebElement element){
        return element.getLocation().getX();
    }

    public void moveAndClick(int x, int y){
        Actions actions = new Actions(driver);
        actions.moveByOffset(x,y).click().build().perform();
    }

}
