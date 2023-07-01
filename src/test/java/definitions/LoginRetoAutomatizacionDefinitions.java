package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import steps.LoginRetoAutomatizacionSteps;

public class LoginRetoAutomatizacionDefinitions {

    LoginRetoAutomatizacionSteps loginRetoAutomatizacionSteps;

    public LoginRetoAutomatizacionDefinitions() {
        this.loginRetoAutomatizacionSteps = new LoginRetoAutomatizacionSteps();
    }

    @Given("ingreso a la WEB page Evalart")
    public void ingreso_a_la_pagina_web(){
        loginRetoAutomatizacionSteps.enterPageEvalart();

    }
    @When("completo los campos requeridos (.*), (.*)$")
    public void completo_los_campos_requeridos(String user, String pass){
        loginRetoAutomatizacionSteps.completarLogin(user, pass);
    }

    @Then("Valido que se muestre la pagina inicial")
    public void valido_que_se_muestre_la_pagina_inicial(){
    }

    @Given("realizo login con (.*), (.*)$")
    public void realizo_login_con(String user, String pass){
        loginRetoAutomatizacionSteps.enterPageEvalart();
        loginRetoAutomatizacionSteps.completarLogin(user, pass);
    }

}
