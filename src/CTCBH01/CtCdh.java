package CTCBH01;

import static org.junit.Assert.*;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
<<<<<<< HEAD
import org.openqa.selenium.support.ui.Select;

=======
>>>>>>> 7841d2d565a1c532c45a7d233dc6f809b74b5fe1
import Telas_cbh.IdentificacaoCbh;
import Telas_cbh.CadastroCbh;
import Telas_cbh.HomeCbh;

public class CtCdh {

	private WebDriver driver;
	private HomeCbh homecbh;
	private IdentificacaoCbh indentificacaocbh;	
	private CadastroCbh cadastrocbh;
	String email = "teste@teste.com.br";	
	String nomecompleto = "Maria de Jesus";
	String cpf ="02970157020";
	String ddd = "11";
	String dianasc = "07";
	String mesnasc = "12";
	String anonasc = "1980";
	String telefone = "997876543";
	String telefone2 = "41678765";
	String senha = "Teste@01";
	String linkSenha;	
	
	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException  {
		
		homecbh = new HomeCbh();
		indentificacaocbh = new IdentificacaoCbh();
		cadastrocbh = new CadastroCbh();
		
		
<<<<<<< HEAD
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\camila.santos.YAMAN\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.casasbahia.com.br/");
=======
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
		driver = new ChromeDriver();
>>>>>>> 7841d2d565a1c532c45a7d233dc6f809b74b5fe1
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2 , TimeUnit.SECONDS);
		
		homecbh.menuCBH(driver).click();
		indentificacaocbh.email(driver).sendKeys(email);
		indentificacaocbh.radiobutton(driver).click();
		indentificacaocbh.botaocontinuar(driver).click();
		cadastrocbh.nomecompleto(driver).sendKeys(nomecompleto);
		cadastrocbh.cpf(driver).sendKeys(cpf);
<<<<<<< HEAD
		Select dropdown = new Select(driver.findElement(By.id("TipoFone1")));
        dropdown.selectByIndex(2);
=======
		cadastrocbh.tipotelefone1(driver).sendKeys(telefone);
>>>>>>> 7841d2d565a1c532c45a7d233dc6f809b74b5fe1
		cadastrocbh.ddd(driver).sendKeys(ddd);
		cadastrocbh.telefone(driver).sendKeys(telefone);
		cadastrocbh.ddd2(driver).sendKeys(ddd);
		cadastrocbh.telefone2(driver).sendKeys(telefone2);
		cadastrocbh.dianasc(driver).sendKeys(dianasc);
		cadastrocbh.mesnasc(driver).sendKeys(mesnasc);
		cadastrocbh.anonasc(driver).sendKeys(anonasc);
<<<<<<< HEAD
		cadastrocbh.sexo(driver).click();
		cadastrocbh.confirmaemail(driver).sendKeys(email);
		driver.findElement(By.xpath("//fieldset[@class=\"fCadastro fCadastroLoja\"]/p[3]/input[@id=\"Senha\"]"))
		.sendKeys(senha);
		cadastrocbh.confirmasenha(driver).sendKeys(senha);
		cadastrocbh.salvar(driver).click();
		
=======
		cadastrocbh.confirmaemail(driver).sendKeys(email);
		
	
		
		driver.findElement(By.xpath("//fieldset[@class=\"fCadastro fCadastroLoja\"]/p[3]/input[@id=\"Senha\"]"))
		.sendKeys("Senha@01");
		
		
		
		
		cadastrocbh.confirmasenha(driver).sendKeys(senha);
		cadastrocbh.salvar(driver).click();
>>>>>>> 7841d2d565a1c532c45a7d233dc6f809b74b5fe1
		
		
		
//		linkSenha = indentificacaocbh.esquecisenha(driver).getText();
//        assertEquals(linkSenha, "Esqueci minha senha" );
		
	}

}
