package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class EjerciciosCiclosPage extends WebBasePage {

    @FindBy(xpath = "//input[@name = 'checkbox']")
    private List<WebElement> listaLabel;

    @FindBy(xpath = "//p[contains(text(), 'Indique la fecha')]")
    private WebElement textObtenerFecha;

    @FindBy(xpath = "//input[@type = 'date']")
    private WebElement inputFecha;

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

    public String obtenerFecha(){
        waitUntilElementIsPresent(textObtenerFecha, 10);
        return textObtenerFecha.getText();
    }

    public void sendKeysInputFecha(String fecha){
        waitUntilElementIsPresent(inputFecha, 10);
        inputFecha.clear();
        inputFecha.sendKeys(fecha);
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
}
