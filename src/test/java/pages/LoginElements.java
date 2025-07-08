package pages;

import org.openqa.selenium.By;

public class LoginElements {

	public static final By BOTAO_ENTRAR = By.xpath("//*[@id=\"root\"]/div/header/div[1]/div[2]/button[1]");
	public static final By CAMPO_USUARIO = By.xpath("//*[@id=\"root\"]/div/header/div[2]/div/div/form/div[1]/input");
    public static final By CAMPO_SENHA = By.xpath("//*[@id=\"root\"]/div/header/div[2]/div/div/form/div[2]/input");
    public static final By BOTAO_LOGIN = By.xpath("//*[@id=\"root\"]/div/header/div[2]/div/div/form/button");
	
}
