package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utilities.Config;
import utilities.Driver;
import utilities.SeleniumUtils;

public class LoginSteps {
    WebDriver driver = Driver.getDriver();

    LoginPage loginPage = new LoginPage(driver);

    @Given("user on the login page")
    public void user_on_the_login_page() {
        driver.get(Config.getProperty("URL"));
    }

    @When("user enters {string} email")
    public void user_enters_email(String email) {
        loginPage.enterLogin(email);
    }

    @When("user enters {string} password")
    public void user_enters_password(String password) {
        loginPage.enterPassword(password);
    }

    @When("user clicks on log in button")
    public void user_clicks_on_log_in_button() {
        loginPage.clickLogin();
    }

    @Then("user url should be different")
    public void user_url_should_be_different() {
        SeleniumUtils.waitForElementTobeVisible(loginPage.getRoleWebElement(), driver, 10);
        String currentUrl = driver.getCurrentUrl();
        Assert.assertNotEquals(Config.getProperty("URL"), currentUrl);
    }

    @Then("user should see {string} warning")
    public void user_should_see_warning(String message) {
        Assert.assertEquals(message, loginPage.getWarningMsg());
    }
}
