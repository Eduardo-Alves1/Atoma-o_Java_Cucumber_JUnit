package plataforma.cucumber.steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.E;
import pages.LoginElements;

public class LoginSteps {

	private WebDriver driver;
	private WebDriverWait wait;

	/**
	 * Abre o navegador Chrome, acessa o site da plataforma e clica no botão "Entrar"
	 * localizado na tela inicial. Também inicializa o WebDriverWait para uso posterior.
	 */
	@Dado("que eu acesse o formulário de login")
	public void acessarFormularioLogin() {
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	
		driver.get("https://plataforma.dev.e2etreinamentos.com.br/");
		driver.manage().window().maximize();
		driver.findElement(By.className("btn-entrar")).click();
	}

	/**
	 * Aguarda o carregamento do campo de e-mail e insere as credenciais
	 * de login configuradas na classe de suporte {@code support.Config}.
	 */
	@Quando("eu informar as credenciais email e senha")
	public void euInformarAsCredenciaisEmailESenha() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(LoginElements.CAMPO_USUARIO));
		driver.findElement(LoginElements.CAMPO_USUARIO).sendKeys(support.Config.EMAIL);
		driver.findElement(LoginElements.CAMPO_SENHA).sendKeys(support.Config.SENHA);
	}
	
	/**
	 * Realiza o clique no botão "Entrar" do formulário de login.
	 */
	@E("clicar no botão entrar")
	public void clicarNoBotaoEntar() {
	    driver.findElement(LoginElements.BOTAO_LOGIN).click();
	}

	/**
	 * Aguarda o redirecionamento para a URL que contém "dashboard"
	 * e valida se o usuário foi de fato redirecionado corretamente.
	 * Em caso negativo, falha o teste com mensagem detalhada.
	 */
	@Então("devo ser redirecionado a tela inicial")
	public void devoSerRedirecionadoAPaginaInicial() {
	    String urlAtual = driver.getCurrentUrl();
	    boolean redirecionado = wait.until(ExpectedConditions.urlContains("dashboard"));
	    assertTrue(redirecionado, "USUÁRIO NÃO FOI REDIRECIONADO CORRETAMENTE. URL ATUAL >> " + urlAtual);
	}
}
