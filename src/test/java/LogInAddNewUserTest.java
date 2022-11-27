import base.BaseTest;
import org.testng.annotations.Test;
import pages.AddCustomerPage;
import pages.CustomerListPage;
import pages.DashboardPage;
import pages.AdminLogInPage;

public class LogInAddNewUserTest extends BaseTest {

    @Test
    public void testAdminPage() {
        AdminLogInPage.goTo();
        AdminLogInPage.typeInUsernameInputField("admin");
        AdminLogInPage.typeInPasswordInputField("parola123!");
        AdminLogInPage.clickOnLogInButton();
        DashboardPage.clickOnNavigationMenuCustomersList();
        DashboardPage.waitAndClickOnMenuListCustomers();
        DashboardPage.clickOnAddNewButton();
        AddCustomerPage.typeOnInputFirstnameField("Ran");
        AddCustomerPage.typeOnInputLastnameField("Bosilek");
        AddCustomerPage.typeOnInputEmailField();
        AddCustomerPage.typeOnInputTelephoneField("+35911111");
        AddCustomerPage.typeOnInputPasswordFieldAndConfirmPassword("ffffddd!123");
        AddCustomerPage.clickOnSaveButton();
        CustomerListPage.setEmailOninputEmailFieldFilter();
        CustomerListPage.clickOnCustomListFilterButton();
        CustomerListPage.verificationOfAddedNewUser();

    }

}
