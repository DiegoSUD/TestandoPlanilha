package baseSteps;

import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.web.Browser;
import com.hp.lft.sdk.web.BrowserFactory;
import com.hp.lft.sdk.web.BrowserType;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BaseSteps {
	
	public static Browser browser;

	@Before
    public void setUp() throws GeneralLeanFtException {
		System.out.println("PASSOU AQUIIIIIIIIIIIIIIIIIIII");
    	browser = BrowserFactory.launch(BrowserType.CHROME);
    	
    }
    
    @After
    public void fechar() throws GeneralLeanFtException {
    	browser.close();
    }
    

}
