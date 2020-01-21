package pages;

import java.util.Random;

import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.java.ButtonDescription;
import com.hp.lft.sdk.web.Browser;
import com.hp.lft.sdk.web.Button;
import com.hp.lft.sdk.web.EditField;
import com.hp.lft.sdk.web.WebElement;
import com.hp.lft.sdk.web.WebElementDescription;

public class BasePage {
	
	
	public Browser browser;
	Random random = new Random();
	int gerador = random.nextInt(100);
	

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
	
	private WebElement getElementByInnerText(String innerText) throws GeneralLeanFtException {
		WebElement buscarElemento = browser.describe(WebElement.class, new WebElementDescription.Builder()
				.innerText(innerText)
				.visible(true)
				.build());
		return buscarElemento;
	}
	
	private WebElement getElementByInnerTextWithTagName(String innerText, String tagName) throws GeneralLeanFtException {
		WebElement buscarElemento = browser.describe(WebElement.class, new WebElementDescription.Builder()
				.innerText(innerText)
				.tagName(tagName)
				.visible(true)
				.build());
		return buscarElemento;
	}
	
	private EditField getElementById(String id) throws GeneralLeanFtException {
		EditField buscarElemento = browser.describe(EditField.class, new WebElementDescription.Builder()
				.id(id)
				.visible(true)
				.build());
		return buscarElemento;
	}
	
	
	private WebElement[]getElementsByCssSelector(String cssSelector) throws GeneralLeanFtException, CloneNotSupportedException{
		WebElement[] elements = this.browser.findChildren(WebElement.class,
				new WebElementDescription.Builder().cssSelector(cssSelector).visible(true).build());
		return elements;
		
	}
	
	private Button getElementByTagName_Button(String tagName) throws GeneralLeanFtException {
		Button botao = this.browser.describe(Button.class, new ButtonDescription.Builder()
				.tagName(tagName).build());
		return botao;
		
	}
	
	private WebElement getElementById_WebElement(String id) throws GeneralLeanFtException {
		WebElement buscarElemento = browser.describe(WebElement.class, new WebElementDescription.Builder()
				.id(id)
				.visible(true)
				.build());
		return buscarElemento;
	}
	
	
	public void click(String cssSelector) throws GeneralLeanFtException {
		this.getElementByCssSelector(cssSelector).click();
	}
	
	
	public void clickEditField(String id) throws GeneralLeanFtException {
		this.getElementById(id).click();
	}
	
	public void clickWebElement(String id) throws GeneralLeanFtException {
		this.getElementById_WebElement(id).click();
	}
	
	public void clickEditFieldAndWrite(String id, String value) throws GeneralLeanFtException {
		EditField inp = getElementById(id);
		inp.click();
		inp.setValue(value);
	}
	
	protected void write(final String id, String value) throws GeneralLeanFtException {
		this.getElementById(id).setValue(value);
	}
	
	public void comboBox(String cssSelector, String uf) throws GeneralLeanFtException, CloneNotSupportedException, InterruptedException {
//		click(cssSelector);
		WebElement[] elementos = this.getElementsByCssSelector(cssSelector);
		for (WebElement web : elementos) {
			if(web.getInnerText().contains(uf)) {
				web.click();
				break;
			}
		}
		
	}
	
	public void waitByElement(String espera) throws InterruptedException, GeneralLeanFtException {
		this.getElementByInnerText(espera).waitUntilExists(30);
	}
	
	public void waitByElementCurto(String espera) throws InterruptedException, GeneralLeanFtException {
		this.getElementByInnerText(espera).waitUntilExists(4);
	}
	
	public void espera(String innerText) throws GeneralLeanFtException{
		this.getElementByInnerText(innerText).waitUntilVisible(60);
	}
	
	
	public void selecionarComboBox(String tagName, String innerText) throws GeneralLeanFtException {
		this.getElementByInnerTextWithTagName(innerText, tagName).click();
	}

	public void clicarBotao(String tagName) throws GeneralLeanFtException {
		this.getElementByTagName_Button(tagName);
	}
	
	

}
