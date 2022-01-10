package io.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CadastroConta {
    @Given("que estou acessando a aplicacao")
    public void que_estou_acessando_a_aplicacao() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\geovana.amaral\\Documents\\drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://seubarriga.wcaquino.me/");

        // Write code here that turns the phrase above into concrete actions
    }
    @When("informo o usuario {string}")
    public void informo_o_usuario(String string) {
        // Write code here that turns the phrase above into concrete actions
    }
    @When("a senha {string}")
    public void a_senha(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("seleciono entrar")
    public void seleciono_entrar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("visualizo a pagina inicial")
    public void visualizo_a_pagina_inicial() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("seleciono Contas")
    public void seleciono_contas() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("seleciono Adicionar")
    public void seleciono_adicionar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("informo a conta {string}")
    public void informo_a_conta(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("seleciono Salvar")
    public void seleciono_salvar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("a conta e inserida com sucesso")
    public void a_conta_e_inserida_com_sucesso() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
