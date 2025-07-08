package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import support.Config;

public class LoginSteps {

	private WebDriver driver;

	@Dado("que eu acesse o formulário de login")
	public void acessarFormularioLogin() {
		driver = new ChromeDriver();
	
		driver.get(Config.BASE_URL);
		driver.manage().window().maximize();
		driver.findElement(By.className("btn-entrar"));

	}

	@Quando("eu informar as credenciais email e senha")
	public void euInformarAsCredenciaisEmailESenha() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}
	
	@Quando("clicar no botão entrar")
	public void clicarNoBotaoEntar() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Então("devo ser redirecionado a tela inicial")
	public void devoSerDirecionadoAPaginaInicial() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
