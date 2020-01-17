package pages;

import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.web.Browser;
import com.hp.lft.sdk.web.WebElement;
import com.hp.lft.sdk.web.WebElementDescription;

public class BasePage {
	
	
	public Browser browser;

	public BasePage(Browser browser) {
		this.browser = browser;
	}
	
	
	private WebElement getElementByCssSelector(String cssSelector) throws GeneralLeanFtException {
		WebElement buscarElemento = browser.describe(WebElement.class, new WebElementDescription.Builder()
				.cssSelector(cssSelector)
				.visible(true)
				.build());
		return buscarElemento;
	}
	
	
	public void click(String cssSelector) throws GeneralLeanFtException {
		this.getElementByCssSelector(cssSelector).click();
	}

	
	

	
	
	

}
