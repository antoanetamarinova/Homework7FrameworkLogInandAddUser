package pages;

import base.BasePage;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class AddCustomerPage extends BasePage {

    @FindBy(id = "input-firstname")
    private static WebElement inputFirstnameField;

    @FindBy(id = "input-lastname")
    private static WebElement inputLastnameField;

    @FindBy(id = "input-email")
    private  static WebElement inputEmailField;

    private static String randomEmailAddress;

    private static String prefix = RandomStringUtils.randomAlphabetic(8);
    private static String domainPrefix = RandomStringUtils.randomAlphabetic(5);
    private static String mainDomain = RandomStringUtils.randomAlphabetic(3);


    private static String email;




    @FindBy(id = "input-telephone")
    private static WebElement inputTelephoneField;


    @FindBy(id = "input-password")
    private static WebElement inputPasswordField;


    @FindBy(id = "input-confirm")
    private static WebElement inputConfirmPasswordField;

    @FindBy(css = "[data-original-title='Save']")
    private static WebElement saveButton;



    static{
        PageFactory.initElements(Browser.driver, AddCustomerPage.class);
    }

    public static void typeOnInputFirstnameField(String firstname) {inputFirstnameField.sendKeys(firstname);}

    public static void typeOnInputLastnameField(String lastname) {inputLastnameField.sendKeys(lastname);}

    public static void typeOnInputEmailField(){
        randomEmailAddress = prefix + "@" + domainPrefix + "." + mainDomain;
        inputEmailField.sendKeys(randomEmailAddress);
    }

    public static String getRandomEmailAddress () {
        return randomEmailAddress;
    }


    public static void typeOnInputTelephoneField(String telephoneNumber) {inputTelephoneField.sendKeys(telephoneNumber);}

    public static void  typeOnInputPasswordFieldAndConfirmPassword(String typePassword) {
        inputPasswordField.sendKeys(typePassword);
        inputConfirmPasswordField.sendKeys(typePassword);
    }



//    public static String getPassword() {
//        String typedPass;
//        typedPass = inputPasswordField.getText();
//        return typedPass;
//    }

    public static void clickOnSaveButton() {click(saveButton);}

    public static void setEmail(String email) {
        AddCustomerPage.email = email;
    }

//    driver.findElement(By.cssSelector("[data-original-title='Save']")).click();
//        driver.findElement(By.id("input-email")).sendKeys(emailAddress);
//        driver.findElement(By.id("button-filter")).click();

}
