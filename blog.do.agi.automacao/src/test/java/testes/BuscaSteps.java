package testes;

import java.io.IOException;

import drivers.BuscaDrivers;
import elementos.BuscaElementos;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.BuscaMetodos;
import runner.BuscaExecuta;

public class BuscaSteps extends BuscaDrivers {

	BuscaMetodos metodos = new BuscaMetodos();
	BuscaElementos el = new BuscaElementos();

	@Given("que eu esteja no {string}")
	public void queEuEstejaNo(String site) {
		BuscaExecuta.abrirNavegador(site);
	}

	@And("clico na lupa")
	public void clicoNaLupa() {
		metodos.clicar(el.getLupa());
	}

	@When("preencher o campo de busca")
	public void preencherOCampoDeBusca() {
		metodos.escrever("ir 2023", el.getCampoBusca());
	}

	@And("realizar a busca")
	public void realizarABusca() {
		metodos.buscar(el.getBtnPesquisar());
	}

	@Then("valido o resultado da busca")
	public void validoOResultadoDaBusca() throws IOException {
		metodos.validarTexto("ir 2023", el.getResultado());
		metodos.fecharNavegador();
	}

	@Given("clicar na lupa")
	public void clicarNaLupa() {
		metodos.clicar(el.getLupa());
	}

	@When("realizo a busca com o campo vazio")
	public void realizoABuscaComOCampoVazio() {
		metodos.buscar(el.getBtnPesquisar());
	}

	@Then("verifico o resultado da busca")
	public void verificoOResultadoDaBusca() throws IOException {
		metodos.validarTexto("", el.getResultado());
		metodos.fecharNavegador();
	}
}