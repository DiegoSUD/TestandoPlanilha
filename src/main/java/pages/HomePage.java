package pages;

import org.junit.Assert;

import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.web.Browser;


public class HomePage extends BasePage{

	

	private String botaoEntrarTelaHomeMeuVivo = "a.login-btn[title='Entre']";

	public HomePage(Browser browser) {
		super(browser);
	}

	public void validarTelaHome() throws GeneralLeanFtException {
		Assert.assertEquals(this.browser.getURL(), "https://hml-lojaonline.vivo.com.br/vivostorefront/?site=vivo");
		
	}

	public void clicarBotaoEntrarTelaHomeMeuVivo() throws GeneralLeanFtException {
		click(botaoEntrarTelaHomeMeuVivo);
		
	}

	public void digitoCPF() {
		
		
	}
	

	
	

}
