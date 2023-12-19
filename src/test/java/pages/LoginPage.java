package pages;

import org.openqa.selenium.By;
import runner.RunBase;
import suport.Utils;

public class LoginPage extends RunBase {


    private By create_email_field = By.id("email_create");
    private By create_email_button = By.id("SubmitCreate");


    public void acessarTelaLogin(){
        getDriver().get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
        Utils.esperarElementoEstarPresente(create_email_field, 20);
    }

    public void preencherCampoEmail(String geraEmail) throws InterruptedException {
        getDriver().findElement(create_email_field).sendKeys(geraEmail);
        Thread.sleep(2000);

    }
    public void clicarBotaoCriarConta() {
        getDriver().findElement(create_email_button).click();
    }
}
