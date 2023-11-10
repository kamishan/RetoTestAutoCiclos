package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import steps.EjerciciosCiclosSteps;

public class EjerciciosCiclosDefinitions {
    EjerciciosCiclosSteps ejerciciosCiclosSteps;

    public EjerciciosCiclosDefinitions() {
        this.ejerciciosCiclosSteps = new EjerciciosCiclosSteps();
    }

    @And("completo los ejecicios del ciclo 1")
    public void completarEjercicios(){
        ejerciciosCiclosSteps.contarAnimales();
        ejerciciosCiclosSteps.multiplicarLetras();
        ejerciciosCiclosSteps.operacionMatematica();
        ejerciciosCiclosSteps.seleccionarMultiplo();
    }

    @And("avanzo al siguiente ciclo")
    public void avanzoAlSiguienteCiclo(){
        ejerciciosCiclosSteps.AvanzarSiguienteCiclo();
    }

    @And("completo los ejecicios del ciclo 2")
    public void completarEjercicios2(){
        ejerciciosCiclosSteps.contarAnimales();
        ejerciciosCiclosSteps.multiplicarLetras();
        ejerciciosCiclosSteps.operacionMatematica();
        ejerciciosCiclosSteps.seleccionarMultiplo();
    }

    @And("completo los ejecicios del ciclo 3")
    public void completarEjercicios3(){
        ejerciciosCiclosSteps.contarAnimales();
        ejerciciosCiclosSteps.multiplicarLetras();
        ejerciciosCiclosSteps.operacionMatematica();
        ejerciciosCiclosSteps.seleccionarMultiplo();
    }

    @And("completo los ejecicios del ciclo 4")
    public void completarEjercicios4(){
        ejerciciosCiclosSteps.contarAnimales();
        ejerciciosCiclosSteps.multiplicarLetras();
        ejerciciosCiclosSteps.operacionMatematica();
        ejerciciosCiclosSteps.seleccionarMultiplo();
    }

    @And("completo los ejecicios del ciclo 5")
    public void completarEjercicios5(){
        ejerciciosCiclosSteps.contarAnimales();
        ejerciciosCiclosSteps.multiplicarLetras();
        ejerciciosCiclosSteps.operacionMatematica();
        ejerciciosCiclosSteps.seleccionarMultiplo();
    }

    @And("completo los ejecicios del ciclo 6")
    public void completarEjercicios6(){
        ejerciciosCiclosSteps.contarAnimales();
        ejerciciosCiclosSteps.multiplicarLetras();
        ejerciciosCiclosSteps.operacionMatematica();
        ejerciciosCiclosSteps.seleccionarMultiplo();
    }

    @And("completo los ejecicios del ciclo 7")
    public void completarEjercicios7(){
        ejerciciosCiclosSteps.contarAnimales();
        ejerciciosCiclosSteps.multiplicarLetras();
        ejerciciosCiclosSteps.operacionMatematica();
        ejerciciosCiclosSteps.seleccionarMultiplo();
    }

    @And("completo los ejecicios del ciclo 8")
    public void completarEjercicios8(){
        ejerciciosCiclosSteps.contarAnimales();
        ejerciciosCiclosSteps.multiplicarLetras();
        ejerciciosCiclosSteps.operacionMatematica();
        ejerciciosCiclosSteps.seleccionarMultiplo();
    }

    @And("completo los ejecicios del ciclo 9")
    public void completarEjercicios9(){
        ejerciciosCiclosSteps.contarAnimales();
        ejerciciosCiclosSteps.multiplicarLetras();
        ejerciciosCiclosSteps.operacionMatematica();
        ejerciciosCiclosSteps.seleccionarMultiplo();
    }

    @And("completo los ejecicios del ciclo 10")
    public void completarEjercicios10(){
        ejerciciosCiclosSteps.contarAnimales();
        ejerciciosCiclosSteps.multiplicarLetras();
        ejerciciosCiclosSteps.operacionMatematica();
        ejerciciosCiclosSteps.seleccionarMultiplo();
    }

    @When("completo los ejercicios")
    public void completarTodosCiclos(){
        completarEjercicios();
        avanzoAlSiguienteCiclo();
        completarEjercicios2();
        avanzoAlSiguienteCiclo();
        completarEjercicios3();
        avanzoAlSiguienteCiclo();
        completarEjercicios4();
        avanzoAlSiguienteCiclo();
        completarEjercicios5();
        avanzoAlSiguienteCiclo();
        completarEjercicios6();
        avanzoAlSiguienteCiclo();
        completarEjercicios7();
        avanzoAlSiguienteCiclo();
        completarEjercicios8();
        avanzoAlSiguienteCiclo();
        completarEjercicios9();
        avanzoAlSiguienteCiclo();
        completarEjercicios10();
        avanzoAlSiguienteCiclo();
    }

    @Then("se valida la ejecución de los ciclos de ejercicio, y se obtiene el codigo de finalización de la prueba exitosamente")
    public void seValidaEjecucionExitosa(){
        ejerciciosCiclosSteps.validarPruebaFinalizadaExitosamente();
    }
}
