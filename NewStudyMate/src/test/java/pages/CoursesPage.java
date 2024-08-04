package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.SeleniumUtils;

import java.util.List;

public class CoursesPage {
    WebDriver driver;

    public CoursesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(@class,'MuiTypography-root MuiTypography-h5')]")
    private List<WebElement> listOfCourses;
    @FindBy(xpath = "//div[@class='sc-iWOQzb UgwiX']//p")
    private List<WebElement> listOfLessons;

    @FindBy(xpath = "//div[@class='sc-gInZnl caKcFY']")
    private List<WebElement> listOfVideos;

    @FindBy(xpath = "//a[contains(text(),'Presentation') and @role='tab']")
    private WebElement presentationBtn;

    @FindBy(xpath = "//div[@class='sc-gInZnl caKcFY']")
    private List<WebElement> listOfPresentations;

    @FindBy(xpath = "//a[contains(text(),'Task') and @role='tab']")
    private WebElement taskBtn;

    @FindBy(xpath = "//div[@class='sc-iWOQzb UgwiX']")
    private List<WebElement> listOfTasks;

    @FindBy (xpath = "//a[contains(text(),'Link') and @role='tab']")
    private WebElement linkBtn;

    @FindBy(xpath = "//div[@class='sc-iWOQzb UgwiX']")
    private List<WebElement> listOfLinks;

    @FindBy(xpath = "//a[contains(text(),'Test') and @role='tab']")
    private WebElement testBtn;
    @FindBy(xpath = "//div[@class='sc-iWOQzb UgwiX']")
    private List<WebElement> listOfTests;

    @FindBy(xpath = "//a[contains(text(),'Video lesson') and @role='tab']")
    private WebElement videoLessonBtn;

    public void clickOnVideoLessonBtn(){
        if (videoLessonBtn.getAttribute("aria-selected").equals("false")) {
            videoLessonBtn.click();
        }
    }
    public void clickOnTestBtn(){
        if (testBtn.getAttribute("aria-selected").equals("false")) {
            testBtn.click();
        }
    }
    public int seeListOfTests(){
        return listOfTests.size();
    }
    public void clickOnLinkBtn(){
        if (linkBtn.getAttribute("aria-selected").equals("false")) {
            linkBtn.click();
        }
    }
    public int seeListOfLinks(){
        return listOfLinks.size();
    }

    public int seeAllPresentations(){
        return listOfPresentations.size();
    }

    public void clickOnCourseByTitle(String courseTitle) {
        SeleniumUtils.waitForElementTobeVisible(listOfCourses.get(0), driver, 10);
        for (WebElement course : listOfCourses) {
            if (course.getText().equals(courseTitle)) {
                course.click();
                break;
            }
        }
    }
    public void clickOnPresentationButton(){
        if (presentationBtn.getAttribute("aria-selected").equals("false")) {
            presentationBtn.click();
        }
    }

    public void clickOnTaskButton(){
        if (taskBtn.getAttribute("aria-selected").equals("false")){
            taskBtn.click();
        }
    }
    public int seeListOfTasks(){
        return listOfTasks.size();
    }

    public int seeListOfLessons() {
        return listOfLessons.size();
    }

    public void clickOnLessonByTitle(String lessonTitle) {
        for (WebElement lesson : listOfLessons) {
            String title = lesson.getText().split("   ")[1];
            if (title.equals(lessonTitle)) {
                lesson.click();
                break;
            }
        }
    }

    public int seeListOfVideos() {

        for (WebElement video : listOfVideos) {
            String videoTitle = video.findElement(By.xpath(".//p[@class='sc-hlzHbZ icenxl']")).getText();
        }
        return listOfVideos.size();
    }
}
