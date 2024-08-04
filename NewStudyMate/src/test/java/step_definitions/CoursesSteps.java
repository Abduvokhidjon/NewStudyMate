package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.CoursesPage;
import pages.LoginPage;
import utilities.Config;
import utilities.Driver;

public class CoursesSteps {

    WebDriver driver = Driver.getDriver();
    private LoginPage loginPage = new LoginPage(driver);
    private CoursesPage coursesPage = new CoursesPage(driver);


    @Given("user on the my courses page")
    public void user_on_the_my_courses_page() {
        driver.get(Config.getProperty("URL"));
        loginPage.logIn(Config.getProperty("validLogin"), Config.getProperty("validPassword"));
    }
    @When("user clicks on the course {string}")
    public void user_clicks_on_the_course(String courseTitle) {
        coursesPage.clickOnCourseByTitle(courseTitle);
    }

    @Then("user should see all lessons")
    public void user_should_see_all_lessons() {
        int numberOfLessons = coursesPage.seeListOfLessons();
        Assert.assertTrue(numberOfLessons > 0);
    }


    @And("close browser")
    public void close_browser() {
        Driver.close();
    }

    @When("user click on the lesson {string}")
    public void user_click_on_the_lesson(String lessonTitle){
        coursesPage.clickOnLessonByTitle(lessonTitle);
    }
    @Then("user should see videos")
    public void user_should_see_videos() {
        Assert.assertTrue(coursesPage.seeListOfVideos() > 0);
    }


    @And("user clicks on presentation button")
    public void user_clicks_on_presentation_button() {
        coursesPage.clickOnPresentationButton();
    }
    @Then("user should see presentations")
    public void user_should_see_presentations() {
        Assert.assertTrue(coursesPage.seeAllPresentations() > 0);
    }

    @When("user clicks on task button")
    public void user_clicks_on_task_button() {
        coursesPage.clickOnTaskButton();
    }
    @Then("user should see tasks")
    public void user_should_see_tasks() {
        Assert.assertTrue(coursesPage.seeListOfTasks() > 0);
    }


    @When("user clicks on links button")
    public void user_clicks_on_links_button() {
        coursesPage.clickOnLinkBtn();

    }
    @Then("user should see links")
    public void user_should_see_links() {
        Assert.assertTrue(coursesPage.seeListOfLinks() > 0);
    }


    @When("user clicks on test button")
    public void user_clicks_on_test_button() {
        coursesPage.clickOnTestBtn();
    }
    @Then("user should see tests")
    public void user_should_see_tests() {
        Assert.assertTrue(coursesPage.seeListOfTests() > 0);

    }

    @When("user clicks on video lesson button")
    public void user_clicks_on_video_lesson_button() {
        coursesPage.clickOnVideoLessonBtn();
    }

}
