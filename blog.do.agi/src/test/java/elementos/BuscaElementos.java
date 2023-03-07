package elementos;

import org.openqa.selenium.By;

public class BuscaElementos {

	private By lupa = By.id("search-open");
	private By campoBusca = By.xpath("//input[@type='search']");
	private By btnPesquisar = By.xpath("//input[@type='submit'][@value='Pesquisar']");
	private By resultado = By.xpath("//*[@id=\"primary\"]/header/h1/span");

	public By getLupa() {
		return lupa;
	}

	public By getCampoBusca() {
		return campoBusca;
	}

	public By getBtnPesquisar() {
		return btnPesquisar;
	}

	public By getResultado() {
		return resultado;
	}

}
