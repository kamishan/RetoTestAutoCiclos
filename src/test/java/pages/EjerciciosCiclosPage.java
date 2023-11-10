package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class EjerciciosCiclosPage extends WebBasePage {

    @FindBy(xpath = "(//p[@class='text-center text-xl'])[2]")
    private WebElement conjuntoAnimales;

    @FindBy(xpath = "(//p[@class='text-center text-xl'])[1]")
    private WebElement animalBuscar;

    @FindBy(xpath = "(//input[@placeholder=' Numero  '])")
    private WebElement numeroAnimales;

    @FindBy(xpath = "(//p[contains(text(), 'Escriba')])")
    private WebElement textoEscribir;

    @FindBy(xpath = "(//textarea[@placeholder='Texto'])")
    private WebElement textArea;

    @FindBy(xpath = "(//p[@class='text-center text-xl font-bold'])")
    private WebElement textoOperacion;

    @FindBy(xpath = "(//select[@name='select'])")
    private WebElement textRespuesta;

    @FindBy(xpath = "(//p[contains(text(), 'Selecciona')])")
    private WebElement textoMultiplo;

    @FindBy(xpath = "//input[@name = 'checkbox']")
    private List<WebElement> listaLabel;

    @FindBy(xpath = "//button[@type = 'submit']")
    private WebElement buttonEnviar;

    @FindBy(xpath = "//h1[contains(text(), 'Felicidades, ')]")
    private WebElement labelFinalizacionPrueba;

    @FindBy(xpath = "//p[contains(text(), 'General')]")
    private WebElement codigoFinalizacionPrueba;

    public List<WebElement> obtenerListaValores() {
        return listaLabel;
    }

    public void clickElement(WebElement element){
        waitUntilElementIsPresent(element, 10);
        element.click();
    }

    public void clickButtonEnviar() {
        waitUntilElementIsPresent(buttonEnviar, 10);
        buttonEnviar.click();
    }
    public String obtenerMensajeExito(){
        waitUntilElementIsPresent(labelFinalizacionPrueba, 10);
        return labelFinalizacionPrueba.getText();
    }

    public String obtenerCodigoFinalizacionPrueba(){
        waitUntilElementIsPresent(codigoFinalizacionPrueba, 10);
        return codigoFinalizacionPrueba.getText();
    }

    public String getAnimarBuscar() {
        waitUntilElementIsPresent(animalBuscar, 10);
        return animalBuscar.getText().split(" ")[2];
    }

    public String leerLista(String animalFind) {
        return conjuntoAnimales.getText().replaceAll(animalFind,"|");
    }

    public void sendKeysnumeroAnimales(int numero){
        String numeroString = Integer.toString(numero);
        waitUntilElementIsPresent(numeroAnimales, 10);
        numeroAnimales.clear();
        numeroAnimales.sendKeys(numeroString);
    }

    public String[] getLetraEscribir() {
        waitUntilElementIsPresent(textoEscribir, 10);
        String[] vecesEscribir = {textoEscribir.getText().split(" ")[1], textoEscribir.getText().replace("\"","").split(" ")[5]};
        return vecesEscribir;
    }

    public void sendKeysMultiplicarLetra(String cadena) {
        waitUntilElementIsPresent(textArea, 10);
        textArea.clear();
        textArea.sendKeys(cadena);
    }

    public String getOperacion() {
        waitUntilElementIsPresent(textoOperacion, 10);
        return textoOperacion.getText();
    }

    public void sendKeysResultado(String resultado) {
        waitUntilElementIsPresent(textRespuesta, 10);
        textRespuesta.sendKeys(resultado);
    }

    public String getObtenerMultiplo() {
        waitUntilElementIsPresent(textoMultiplo, 10);
        return textoMultiplo.getText().split(" ")[5];
    }
}
