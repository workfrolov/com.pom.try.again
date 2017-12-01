package frolov;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by user on 01.12.2017.
 */
public class PhoneNumberLoginPage extends BasePage{
    public PhoneNumberLoginPage(WebDriver driver) {
        super(driver);
    }
    public void inputExtPin() {
        WebElement inputExtPinField = driver.findElement(By.id("pin"));
        inputExtPinField.sendKeys("101");
    }

    public void inputExtPassword() {
        WebElement inputExtPinField = driver.findElement(By.id("password"));
        inputExtPinField.sendKeys("Test!123");
    }

    public void ckickSignInButton(){
        click(By.xpath("//button[@data-test-automation-id='signInBtn']"));
    }
}
