package metodos;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;

import drivers.BuscaDrivers;

public class BuscaMetodos extends BuscaDrivers {

	public void fecharNavegador() {
		driver.quit();
	}

	public void escrever(String texto, By elemento) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void buscar(By elemento) {
		driver.findElement(elemento).submit();
	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	public void validarTexto(String textoEsperado, By elemento) throws IOException {
		String textoResultado = driver.findElement(elemento).getText();
		assertEquals(textoEsperado, textoResultado);
		

	}
}
