package frolov;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UnifiedLoginPage extends BasePage{

    public UnifiedLoginPage(WebDriver driver) {
        super(driver);
    }

    String baseURL = "https://service-amsup.lab.nordigy.ru/#/enterCredential/";

    public void unifiedLoginPageOpen(){
        driver.navigate().to(baseURL);
    }

    public void inputPhoneNumber() {
        WebElement inputPhoneNumberField = driver.findElement(By.id("credential"));
        inputPhoneNumberField.sendKeys("(678) 744-0130");
    }

    public void ckickNextButton() {
        click(By.xpath("//button[@data-test-automation-id='loginCredentialNext']"));
    }

}
