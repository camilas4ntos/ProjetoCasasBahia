package Telas_cbh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeCbh {

	
	public WebElement menuCBH (WebDriver driver) {
		return driver.findElement(By.id("lnkCadastreSe"));
		
	}
		
}
