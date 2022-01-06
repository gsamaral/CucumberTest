package io.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.skeleton.Filme;
import io.cucumber.skeleton.NotaAluguel;
import io.cucumber.skeleton.servicos.AluguelService;
import org.junit.jupiter.api.Assertions;

import java.util.Calendar;
import java.util.Date;

public class AlugarFilmesSteps {

    private Filme filme;
    private AluguelService aluguelService = new AluguelService();
    private NotaAluguel nota;
    private String erro;
    private String tipoAluguel;

    @Given("um filme com estoque de {int} unidades")
    public void um_filme_com_estoque_de_unidades(Integer int1) {
        filme = new Filme();
        filme.setEstoque(int1);
        // Write code here that turns the phrase above into concrete actions
    }
    @Given("que o preco do aluguel seja R$ {int}")
    public void que_o_preco_do_aluguel_seja_r$(Integer int1) {
        filme.setAluguel(int1);
        // Write code here that turns the phrase above into concrete actions
    }
    @When("alugar {string}")
    public void alugar(String string) {
        // Write code here that turns the phrase above into concrete actions
        try {
            nota = aluguelService.alugar(filme, tipoAluguel);
        } catch (RuntimeException e) {
            erro=e.getMessage();
        }

    }

    @Then("o preco do aluguel sera R$ {int}")
    public void o_preco_do_aluguel_sera_r$(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        Assertions.assertEquals(int1,nota.getPrecoAluguel());
    }
    @Then("a data de entrega sera no dia seguinte")
    public void a_data_de_entrega_sera_no_dia_seguinte() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH,1);
        Date dataRetorno = nota.getDataEntrega();
        Calendar calRetorno = Calendar.getInstance();
        calRetorno.setTime(dataRetorno);
        Assertions.assertEquals(cal.get(Calendar.DAY_OF_MONTH),calRetorno.get(Calendar.DAY_OF_MONTH));
        Assertions.assertEquals(cal.get(Calendar.MONTH),calRetorno.get(Calendar.MONTH));
        Assertions.assertEquals(cal.get(Calendar.YEAR),calRetorno.get(Calendar.YEAR));


        // Write code here that turns the phrase above into concrete actions
    }
    @Then("estoque do filme sera {int} unidade")
    public void estoque_do_filme_sera_unidade(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        Assertions.assertEquals(int1,filme.getEstoque());
    }

    @Then("nao sera possivel por falta de estoque")
    public void nao_sera_possivel_por_falta_de_estoque() {
        Assertions.assertEquals("Filme sem estoque",erro);
        // Write code here that turns the phrase above into concrete actions
    }

    @Given("que o tipo de aluguel seja extendido")
    public void que_o_tipo_de_aluguel_seja_extendido() {
        // Write code here that turns the phrase above into concrete actions
        tipoAluguel = "extendido";

    }

    @Then("a data da entrega sera em {int} dias")
    public void a_data_da_entrega_sera_em_dias(Integer int1) {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("a pontuacao sera de {int} pontos")
    public void a_pontuacao_sera_de_pontos(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        Assertions.assertEquals(int1,nota.getPontuacao());
    }

}

