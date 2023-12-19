package steps;

import cucumber.api.java.pt.Dado;
import pages.LoginPage;
import runner.RunBase;
import runner.RunCucumberTeste;
import suport.Utils;

public class LoginSteps extends RunCucumberTeste {

    LoginPage loginPage = new LoginPage();


    @Dado("^que estou na tela de login$")
    public void que_estou_na_tela_de_login() throws Throwable {
        getDriver(RunBase.Browser.CHROME);
        loginPage.acessarTelaLogin();
    }

    @Dado("^acesso o cadastro de usuário$")
    public void acesso_o_cadastro_de_usuário() throws Throwable {
        loginPage.preencherCampoEmail(Utils.geraEmail());
        loginPage.clicarBotaoCriarConta();
    }
}
