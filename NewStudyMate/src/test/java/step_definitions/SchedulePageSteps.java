package step_definitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.CommonPage;
import pages.LoginPage;
import pages.SchedulePage;
import utilities.Driver;

public class SchedulePageSteps extends SchedulePage {
    WebDriver driver = Driver.getDriver();

    @Given("the user is on {string}")
    public void the_user_is_on(String url) {
        driver.get(url);
    }
    @Given("user logs in")
    public void user_logs_in() {
        LoginPage lp = new LoginPage();
        lp.loginWithValidCredentials("abduvohidabdujamolov@gmail.com","A123456789");
    }
    @Given("User clicks on Schedule Page")
    public void user_clicks_on_schedule_page()  {
        scheduleBtn.click();
    }
    @When("user clicks on log out icon")
    public void user_clicks_on_log_out_icon() {
        CommonPage cp = new CommonPage();
        cp.openLogoutWindow();
    }
    @Then("user clicks outside the log out confirmation box")
    public void user_clicks_outside_the_log_out_confirmation_box() {
        CommonPage cp = new CommonPage();
        int xOfLogoutWindow = cp.getXofElement(cp.logoutWindow);
        int yOfLogoutWindow = cp.getYofElement(cp.logoutWindow);
        cp.moveAndClick(xOfLogoutWindow,yOfLogoutWindow);

    }
    @Then("the url before click and after click should not match")
    public void the_url_before_click_and_after_click_should_not_match() {
        String beforeClick = "https://batch-6.studymate.us/student/schedule?modal=LOGOUT_MODAL";
        String urlAfterClick = driver.getCurrentUrl();
        Assert.assertNotEquals(beforeClick, urlAfterClick);
    }

    @Then("user clicks on log out inside confirmation box")
    public void user_clicks_on_log_out_inside_confirmation_box() {
        CommonPage cp = new CommonPage();
        cp.logOutOption.click();
    }
    @Then("the url should match with login page url")
    public void the_url_should_match_with_login_page_url() {
        String urlLoginPage = "https://batch-6.studymate.us/login";
        String urlAfterLogout = driver.getCurrentUrl();
        Assert.assertEquals(urlAfterLogout, urlLoginPage);
    }
}
