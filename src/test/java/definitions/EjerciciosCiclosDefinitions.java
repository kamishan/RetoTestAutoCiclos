package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import steps.EjerciciosCiclosSteps;

import java.text.ParseException;

public class EjerciciosCiclosDefinitions {
    EjerciciosCiclosSteps ejerciciosCiclosSteps;

    public EjerciciosCiclosDefinitions() {
        this.ejerciciosCiclosSteps = new EjerciciosCiclosSteps();
    }

    @When("completo los ejecicios con (.*) y (.*)$")
    public void completarEjercicios(String modulo, String dias) throws ParseException {
        ejerciciosCiclosSteps.seleccionarMultiplo(modulo);
        ejerciciosCiclosSteps.obtenerFechaTexto(dias);
    }

    @And("avanzo al siguiente ciclo")
    public void avanzoAlSiguienteCiclo(){
        ejerciciosCiclosSteps.AvanzarSiguienteCiclo();
    }

    @Then("se valida la ejecución de los ciclos de ejercicio exitosamente")
    public void seValidaEjecucionExitosa(){
        ejerciciosCiclosSteps.validarPruebaFinalizadaExitosamente();
    }
}
