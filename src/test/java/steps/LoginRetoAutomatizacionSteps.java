package steps;

import definitions.Hooks;
import pages.LoginRetoAutomatizacionPage;

public class LoginRetoAutomatizacionSteps {

    LoginRetoAutomatizacionPage loginRetoAutomatizacionPage;

    public LoginRetoAutomatizacionSteps() {
        this.loginRetoAutomatizacionPage = new LoginRetoAutomatizacionPage();
        loginRetoAutomatizacionPage.setDriver(Hooks.getDriver());
    }
    public void enterPageEvalart() {
        loginRetoAutomatizacionPage.openPageEvalart();
    }

    public void completarLogin(String username, String password) {
        loginRetoAutomatizacionPage.sendKeysInputUsername(username);
        loginRetoAutomatizacionPage.sendKeysInputPassword(password);
        loginRetoAutomatizacionPage.clickButtonEnviar();
    }
}
