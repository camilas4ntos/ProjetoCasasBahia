package Telas_cbh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IdentificacaoCbh {

	public WebElement email (WebDriver driver) {
	return driver.findElement(By.id("Email"));
	
}
	public WebElement radiobutton (WebDriver driver) {
		return driver.findElement(By.id("rbNaoCadastrado"));
		
	}

	public WebElement botaocontinuar (WebDriver driver) {
		return driver.findElement(By.id("btnClienteLogin"));
}
	public WebElement esquecisenha (WebDriver driver) {
		return driver.findElement(By.id("lnkEsqueciSenha"));
	
}
	public WebElement camposenha (WebDriver driver) {
		return driver.findElement(By.id("Senha"));
	
}
	
	
}

