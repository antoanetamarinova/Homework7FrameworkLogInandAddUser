package pages;

import base.BasePage;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import utils.Browser;

public class CustomerListPage extends BasePage {

    @FindBy(id = "input-email")
    private static WebElement inputEmailFieldFilter;

    @FindBy(id = "button-filter")
    private static WebElement customListFilterButton;

    @FindBy(xpath = "//*[@id='form-customer']//tbody/tr/td[2]")
    private static WebElement addedNewUser;



    static {
        PageFactory.initElements(Browser.driver, CustomerListPage.class);
    }

    public static void setEmailOninputEmailFieldFilter(){
        inputEmailFieldFilter.sendKeys(AddCustomerPage.getRandomEmailAddress());
    }

    public static void clickOnCustomListFilterButton() {click(customListFilterButton);}

    public static void verificationOfAddedNewUser() {
        waitOfVisibilityOfElement(addedNewUser);
        Assert.assertEquals(addedNewUser.getText(), "Ran Bosilek");
    }


}
