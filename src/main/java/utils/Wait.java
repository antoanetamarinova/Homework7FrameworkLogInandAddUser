package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Wait {

    public static WebDriverWait wait;

    public  static WebDriverWait setUpWait() {
        wait = new WebDriverWait(Browser.driver, Duration.ofSeconds(5));
        return  wait;
    }

}
