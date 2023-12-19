package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import pages.CadastroPage;
import runner.RunCucumberTeste;

public class CadastroSteps extends RunCucumberTeste {


    CadastroPage cadastroPage = new CadastroPage();


    @Quando("^eu preencho o formulário de cadastro$")
    public void eu_preencho_o_formulário_de_cadastro() throws Throwable {
        cadastroPage.selectTitle(1);
        cadastroPage.preencherNome("Renata");
        cadastroPage.preencherSobrenome("Lobato");
       // cadastroPage.preencherEmail("teste12345@teste.com");
        cadastroPage.preencherSenha("testeRenata16");
        cadastroPage.selecioneDataNascimento(16,12,"1986");
    }

    @Quando("^clico em registrar$")
    public void clico_em_registrar() throws Throwable {
        cadastroPage.clicarEmRegistrar();
    }

    @Então("^vejo usuario logado na tela$")
    public void vejo_usuario_logado_na_tela() throws Throwable {
        Assert.assertEquals("Renata Lobato", cadastroPage.validarUsuarioLogado());
    }
}
