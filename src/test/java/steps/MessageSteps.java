package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MessagePage;
import runner.RunCucumberTeste;

import java.util.concurrent.TimeUnit;

public class MessageSteps extends RunCucumberTeste {

    MessagePage messagePage = new MessagePage();

    @Dado("^que estou na tela de mensagens$")
    public void que_estou_na_tela_de_mensagens() throws Throwable {
             messagePage.acessarMessage();
    }

    @Dado("^preencho todos os campos$")
    public void preencho_todos_os_campos() throws Throwable {
        messagePage.selecioneAssunto("Webmaster");
        messagePage.preencherEmail("re_srs@yahoo.com.br");
        messagePage.preencheMensagem("Minha mensagem!!!");
        messagePage.uploadFile("C:\\Users\\renat\\OneDrive\\Documentos\\Template_SeleniumWebdriver\\template_Selenium_Java\\jesus.png");
    }

    @Quando("^clico em enviar mensagem$")
    public void clico_em_enviar_mensagem() throws Throwable {
        messagePage.clicarBotaoEnviar();
    }

    @Então("^vejo uma mensagem de sucesso na tela$")
    public void vejo_uma_mensagem_de_sucesso_na_tela() throws Throwable {
        String mensagemTela = messagePage.validarMensagemNaTela();
        Assert.assertEquals("Your message has been successfully sent to our team.", mensagemTela );
    }

}
