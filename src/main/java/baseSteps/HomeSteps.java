package baseSteps;

import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.web.Browser;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.HomePage;

public class HomeSteps {
	private HomePage homePage;
	Browser browser;
	
	public HomeSteps() {
		this.homePage = new HomePage(BaseSteps.browser);
	}
	

	@Dado("que estou na tela home do site meu vivo")
	public void que_estou_na_tela_home_do_site_meu_vivo() throws GeneralLeanFtException {
		homePage.browser.navigate("https://hml-lojaonline.vivo.com.br/vivostorefront/?site=vivo");
		homePage.validarTelaHome();
	}

	@Quando("clico no botao entrar")
	public void clico_no_botao_entrar() throws GeneralLeanFtException {
	   homePage.clicarBotaoEntrarTelaHomeMeuVivo();
	}


	@E("digito o cpf")
	public void digito_o_cpf() {
	   homePage.digitoCPF();
	}

	@E("preencho o cadastro")
	public void preencho_o_cadastro() {
	   
	}

	@Entao("retorna a tela home")
	public void retorna_a_tela_home() {
	    
	}

	@E("clico no botao sair")
	public void clico_no_botao_sair() {
	   
	}

	@E("recarrega a pagina novamente")
	public void recarrega_a_pagina_novamente() {
	   
	}

	@E("clico no botao ok alert")
	public void clico_no_botao_ok_alert() {
	    
	}

	@E("preenche os campos com pedencia")
	public void preenche_os_campos_com_pedencia() {
	   
	}

	@Entao("valido a tela cadastro com sucesso")
	public void valido_a_tela_cadastro_com_sucesso() {
	   
	}

	
}
