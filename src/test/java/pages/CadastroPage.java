package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import runner.RunBase;
import suport.Utils;

public class CadastroPage extends RunBase {


    private By titleM = By.id("id_gender1");
    private By titleF = By.id("id_gender2");
    private By firstName = By.id("customer_firstname");
    private By lastName = By.id("customer_lastname");
    private By e_mail = By.id("email");
    private By password = By.id("passwd");
    private By field_day = By.id("days");
    private By field_month = By.id("months");
    private By field_year = By.id("years");
    private By botaoRegister = By.id("submitAccount");
    private By usuario = By.xpath("//span[contains(text(),'Renata Lobato')]");



    public void selectTitle(Integer type) {
        Utils.esperarElementoEstarPresente(titleM, 20);
        if (type == 1) {
            getDriver().findElement(titleM).click();
        } else if (type == 2) {
            getDriver().findElement(titleF).click();
        }
    }

    public void preencherNome(String nome) {
        getDriver().findElement(firstName).sendKeys(nome);
    }

    public void preencherSobrenome(String sobrenome) {
        getDriver().findElement(lastName).sendKeys(sobrenome);
    }

    public void preencherEmail(String email) {
        getDriver().findElement(e_mail).sendKeys(email);
    }

    public void preencherSenha(String senha) {
        getDriver().findElement(password).sendKeys(senha);
    }

    public void selecioneDataNascimento(Integer day, Integer months, String year){
        Select select_day = new Select(getDriver().findElement(field_day));
        select_day.selectByIndex(day);

        Select select_month = new Select(getDriver().findElement(field_month));
        select_month.selectByIndex(months);

        Select select_year = new Select(getDriver().findElement(field_year));
        select_year.selectByValue(year);
    }

    public void clicarEmRegistrar(){
        getDriver().findElement(botaoRegister).click();
    }

    public String validarUsuarioLogado(){
        Utils.esperarElementoEstarVisivel(usuario,20);
        String usuarioLogado = getDriver().findElement(usuario).getText();
        return usuarioLogado;
    }
}
