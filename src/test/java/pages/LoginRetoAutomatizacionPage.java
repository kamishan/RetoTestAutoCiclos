package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginRetoAutomatizacionPage extends WebBasePage {

    @FindBy(xpath = "//input[@name='username']")
    private WebElement inputUsername;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement inputPassword;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement buttonEnviar;

    public void sendKeysInputUsername(String username) {
        waitUntilElementIsPresent(inputUsername,10);
        inputUsername.clear();
        inputUsername.sendKeys(username);
    }

    public void sendKeysInputPassword(String password) {
        waitUntilElementIsPresent(inputPassword,10);
        inputPassword.clear();
        inputPassword.sendKeys(password);
    }
    public void clickButtonEnviar() {
        waitUntilElementIsPresent(buttonEnviar,10);
        buttonEnviar.click();
    }
}
