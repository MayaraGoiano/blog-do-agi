package runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import drivers.BuscaDrivers;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "src/test/resources/features",
	glue = "testes",
	tags = "@tag",
	monochrome = true,
	dryRun = false,
	plugin = {"pretty","html:target/cucumber-report.html"},
	snippets = SnippetType.CAMELCASE	
)

public class BuscaExecuta extends BuscaDrivers {
	 
	public static void abrirNavegador(String Url) {

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(Url);
		driver.manage().window().maximize();
	}

}
