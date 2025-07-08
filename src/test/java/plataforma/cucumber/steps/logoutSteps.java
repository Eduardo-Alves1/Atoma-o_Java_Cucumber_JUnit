package plataforma.cucumber.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import pages.LogoutElements;

public class logoutSteps {
	private LoginSteps loginSteps = new LoginSteps();
	private WebDriver driver;
	private WebDriverWait wait;
	
	
	@Dado("que eu esteja com cessão ativa")
	public void logadoNoSistema() {
		driver = new ChromeDriver();
		loginSteps.acessarFormularioLogin();
		loginSteps.euInformarAsCredenciaisEmailESenha();
		loginSteps.clicarNoBotaoEntar();
		loginSteps.devoSerRedirecionadoAPaginaInicial();
	}
	@Quando("eu clicar no botão sair")
	public void clickbotaoSair() {
		driver.findElement(LogoutElements.BOTAO_SAIR).click();
		
	}
	

}
