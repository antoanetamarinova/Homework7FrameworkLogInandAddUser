package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.Browser;
import utils.Wait;

public class DashboardPage extends BasePage {


    @FindBy(id = "menu-customer")
    private static WebElement navigationMenuCustomersList;

    @FindBy(xpath = "//*[@id='menu-customer']//ul/li[1]/a")
    private static WebElement menuListCustomers;

    @FindBy(xpath = "//i[@class = 'fa fa-plus']")
    private static WebElement addNewButton;

    static {
        PageFactory.initElements(Browser.driver, DashboardPage.class);
    }

    public static void clickOnNavigationMenuCustomersList(){
        click(navigationMenuCustomersList);
    }

    public static void waitAndClickOnMenuListCustomers() {
        Wait.wait.until(ExpectedConditions.visibilityOf(menuListCustomers));
        click(menuListCustomers);
    }

    public static void clickOnAddNewButton() {
        click(addNewButton);
    }



}
