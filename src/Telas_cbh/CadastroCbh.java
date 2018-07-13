package Telas_cbh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroCbh {

	public WebElement nomecompleto (WebDriver driver) {
		return driver.findElement(By.id("NomeCompleto"));
	}

	public WebElement cpf (WebDriver driver) {
		return driver.findElement(By.id("Cpf"));
	}
	
	public WebElement tipotelefone1 (WebDriver driver) {
		return driver.findElement(By.id("TipoFone1"));
	}
	
	public WebElement tipotelefone2 (WebDriver driver) {
		return driver.findElement(By.id("TipoFone2"));
	}
	
	public WebElement ddd (WebDriver driver) {
		return driver.findElement(By.id("Telefone1DDDPF"));
	}
	
	public WebElement telefone (WebDriver driver) {
		return driver.findElement(By.id("Telefone1PF"));
	}
	
	public WebElement ddd2 (WebDriver driver) {
		return driver.findElement(By.id("Telefone2DDDPF"));
	}
	
	public WebElement telefone2 (WebDriver driver) {
		return driver.findElement(By.id("Telefone2PF"));
	}
	
	public WebElement dianasc (WebDriver driver) {
		return driver.findElement(By.id("DataNascimentoDia"));
	}

	public WebElement mesnasc (WebDriver driver) {
		return driver.findElement(By.id("DataNascimentoMes"));
	}
	
	public WebElement anonasc (WebDriver driver) {
		return driver.findElement(By.id("DataNascimentoAno"));
	}
	
	public WebElement sexo (WebDriver driver) {
		return driver.findElement(By.className("sexF"));
	}
	
	public WebElement confirmaemail (WebDriver driver) {
		return driver.findElement(By.id("ConfirmarEmail"));
	}
	
	//public WebElement senha(WebDriver driver) {
		//return driver.findElement(By.name("Senha"));
	//}
	
	public WebElement confirmasenha (WebDriver driver) {
		return driver.findElement(By.id("ConfirmarSenha"));
	}
	
	public WebElement salvar (WebDriver driver) {
		return driver.findElement(By.id("btnClienteSalvar"));
	}

	
}
