package pages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class AdminLogInPage extends BasePage {

    @FindBy(id = "input-username")
    private static WebElement usernameInputField;

    @FindBy(id = "input-password")
    private static WebElement passwordInputField;

    @FindBy(className = "btn-primary")
    private static WebElement LogInButton;

    private static String LogInPageUrl = "http://shop.pragmatic.bg/admin/";

    static {
        PageFactory.initElements(Browser.driver, AdminLogInPage.class);
    }

    public static void goTo() {Browser.driver.get(LogInPageUrl);}

    public  static void typeInUsernameInputField(String username) {usernameInputField.sendKeys(username);}

    public  static void typeInPasswordInputField(String password) {passwordInputField.sendKeys(password);}

    public static void clickOnLogInButton () {LogInButton.click();}

}
