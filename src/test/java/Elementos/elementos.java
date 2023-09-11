package Elementos;

import org.openqa.selenium.By;

public class elementos {

	
	private By pesquisar = By.xpath("//*[@id=\"input-search\"]");
	private By btnpesqui = By.cssSelector("#search-container > div > svg");
	private By celular = By.cssSelector("#__next > div > main > section:nth-child(5) > div.sc-dcJsrY.hmLryf > div > ul > li:nth-child(1) > a > div.sc-wkolL.fMMuUd > img");
	private By armazenamento = By.cssSelector("#__next > div > main > section:nth-child(6) > div:nth-child(2) > div > div:nth-child(1) > div.sc-dhKdcB.gOYmVe.sc-eFRcpv.dRDyvx > div:nth-child(2) > label");
	public By getPesquisar() {
		return pesquisar;
	}
	public By getBtnpesqui() {
		return btnpesqui;
	}
	public By getCelular() {
		return celular;
	}
	public By getArmazenamento() {
		return armazenamento;
	}
	
}
