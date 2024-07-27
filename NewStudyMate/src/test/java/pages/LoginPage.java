package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    private WebDriver driver;
    public LoginPage() {
        this.driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@autocomplete='username']")
    public WebElement loginInput;

    @FindBy(xpath = "//div[contains(@class,'MuiAlert-message')]//p")
    public WebElement alertMessage;

    @FindBy(xpath = "//input[@id=':r1:']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginBtn;

    public void loginWithValidCredentials(String username, String password) {
        loginInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }
    public void loginWithInvalidCredentials(String InvalidUsername, String InvalidPassword) {
        loginInput.sendKeys(InvalidUsername);
        passwordInput.sendKeys(InvalidPassword);
        loginBtn.click();
    }

}
