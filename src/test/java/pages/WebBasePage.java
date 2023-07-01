package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import definitions.Hooks;

public class WebBasePage extends PageObject {

    public void openPageEvalart() {
        Hooks.getDriver().get("https://tasks.evalartapp.com/automatization/");
    }

    boolean waitUntilElementIsPresent(WebElement element, int time){
        try{
            new WebDriverWait(Hooks.getDriver(),time).until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public WebElement getElement(String xpath, String option){
        return element(By.xpath(xpath.replace("Replaceable",option)));
    }

    public void scrollElement(WebElement element){
        ((JavascriptExecutor) Hooks.getDriver()).executeScript("arguments[0].scrollIntoView(true);",element);
    }

    public void waitTime(int time){
        try {
            Thread.sleep(time*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
