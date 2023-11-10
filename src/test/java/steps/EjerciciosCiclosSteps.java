package steps;

import definitions.Hooks;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.EjerciciosCiclosPage;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.text.SimpleDateFormat;
import java.util.List;

public class EjerciciosCiclosSteps {

    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

    EjerciciosCiclosPage ejerciciosCiclosPage;

    public EjerciciosCiclosSteps() {
        this.ejerciciosCiclosPage = new EjerciciosCiclosPage();
        ejerciciosCiclosPage.setDriver(Hooks.getDriver());
    }

    public void contarAnimales(){
        String animales = ejerciciosCiclosPage.leerLista(ejerciciosCiclosPage.getAnimarBuscar());
        int count = 0;
        for (int i=0; i<animales.length(); i++){
            if (animales.substring(i, i+1).contains("|")){
                count+=1;
            }
        }
        ejerciciosCiclosPage.sendKeysnumeroAnimales(count);
    }

    public void multiplicarLetras() {
        String[] datosMultiplicar = ejerciciosCiclosPage.getLetraEscribir();
        String cadena = "";
        for (int i=0; i<Integer.valueOf(datosMultiplicar[0]);i++){
            cadena = cadena+datosMultiplicar[1];
        }
        ejerciciosCiclosPage.sendKeysMultiplicarLetra(cadena);
    }

    public void operacionMatematica() {
        String datosOperar = ejerciciosCiclosPage.getOperacion();
        try {
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("JavaScript");
            Object resultado = engine.eval(String.valueOf(datosOperar));
            Double resultadoDouble = ((Number) resultado).doubleValue();
            String resultadoFormat = String.format("%.0f", resultadoDouble);
            ejerciciosCiclosPage.sendKeysResultado(resultadoFormat);
        }
        catch (ScriptException e) {
            e.printStackTrace();
        }
    }

    public void seleccionarMultiplo(){
        Integer moduloInt = Integer.valueOf(ejerciciosCiclosPage.getObtenerMultiplo());
        List<WebElement> elementos = ejerciciosCiclosPage.obtenerListaValores();
        for (WebElement element: elementos) {
            if (Integer.valueOf(element.getAttribute("value")) % moduloInt == 0){
                ejerciciosCiclosPage.clickElement(element);
            }
        }
    }

    public void AvanzarSiguienteCiclo() {
        ejerciciosCiclosPage.clickButtonEnviar();
    }

    public void validarPruebaFinalizadaExitosamente() {
        String mensajeFinalización = ejerciciosCiclosPage.obtenerMensajeExito();

        if (mensajeFinalización.equals("Felicidades, has terminado la prueba exitosamente")){
            Assert.assertTrue("Se valida la ejecución de los 10 ciclos de forma correcta", true);
            System.out.println("El codigo generado por finalizar la prueba de forma exitosa es: " + ejerciciosCiclosPage.obtenerCodigoFinalizacionPrueba());
        }
        else
            Assert.assertFalse("Hubo un error al finalizar la ejecución de los ciclos",true);
    }
}