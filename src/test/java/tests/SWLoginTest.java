package tests;

import frolov.PhoneNumberLoginPage;
import frolov.UnifiedLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SWLoginTest extends BaseTest {
    PhoneNumberLoginPage phoneNumberLoginPage = new PhoneNumberLoginPage(driver);
    UnifiedLoginPage unifiedLoginPage = new UnifiedLoginPage(driver);

    @Test
    public void loginToSW() {
        unifiedLoginPage.unifiedLoginPageOpen();
        unifiedLoginPage.inputPhoneNumber();
        unifiedLoginPage.ckickNextButton();

        //phoneNumberLoginPage.inputExtPin();
        //phoneNumberLoginPage.inputExtPassword();
        //phoneNumberLoginPage.ckickSignInButton();
    }

}
