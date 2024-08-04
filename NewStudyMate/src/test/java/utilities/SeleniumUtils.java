package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumUtils {


    public static void waitForSeconds(int seconds){
        try {
            Thread.sleep(seconds*1000);
        }catch (InterruptedException e){}



    }


    public static void waitForElementTobeVisible(WebElement role, WebDriver driver, int i) {
    }
}
