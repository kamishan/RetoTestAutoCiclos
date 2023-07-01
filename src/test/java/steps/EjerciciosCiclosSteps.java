package steps;

import definitions.Hooks;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.EjerciciosCiclosPage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class EjerciciosCiclosSteps {

    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

    EjerciciosCiclosPage ejerciciosCiclosPage;

    public EjerciciosCiclosSteps() {
        this.ejerciciosCiclosPage = new EjerciciosCiclosPage();
        ejerciciosCiclosPage.setDriver(Hooks.getDriver());
    }

    public void seleccionarMultiplo(String modulo){
        Integer moduloInt = Integer.valueOf(modulo);
        List<WebElement> elementos = ejerciciosCiclosPage.obtenerListaValores();
        for (WebElement element: elementos) {
            if (Integer.valueOf(element.getAttribute("value")) % moduloInt == 0){
                ejerciciosCiclosPage.clickElement(element);
                System.out.println(element);
        }
        }
    }

    public void obtenerFechaTexto(String dias) throws ParseException {
        Integer diasInt = Integer.valueOf(dias);
        String fecha = ejerciciosCiclosPage.obtenerFecha().split(":")[1];
        Date fechaFormat = formato.parse(fecha);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaFormat);
        calendar.add(calendar.DAY_OF_MONTH,diasInt);
        Date fechaSuma = calendar.getTime();
        String fechaString = formato.format(fechaSuma);
        System.out.println(fechaString);
        ejerciciosCiclosPage.sendKeysInputFecha(fechaString);
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