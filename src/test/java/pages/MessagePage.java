package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import suport.Utils;

public class MessagePage extends Utils {

    WebDriver driver;

    private By message_field = By.id("message");
    private By upload_field = By.id("fileUpload");
    private By send_button = By.id("submitMessage");
    private By subject_field = By.id("id_contact");
    private By mensagemSucesso = By.xpath("//p[contains(text(),'Your message has been successfully sent to our tea')]");
    private By email_field = By.id("email");

    public void acessarMessage() {
        getDriver().get("http://www.automationpractice.pl/index.php?controller=contact");
        esperarElementoEstarPresente(message_field, 20);
    }

    public void selecioneAssunto(String assunto) {
        Select select_assunto = new Select(getDriver().findElement(subject_field));
        select_assunto.selectByVisibleText(assunto);

    }

    public void preencheMensagem(String message){
        getDriver().findElement(message_field).sendKeys(message);

    }

    public void uploadFile(String caminhoArquivo){
        getDriver().findElement(upload_field).sendKeys(caminhoArquivo);

    }
    public void clicarBotaoEnviar() {
        getDriver().findElement(send_button).click();
    }

    public void preencherEmail(String email) {
        getDriver().findElement(email_field).sendKeys(email);
    }

    public String validarMensagemNaTela() {
        String mensagemTela = getDriver().findElement(mensagemSucesso).getText();
        return mensagemTela;
    }
}