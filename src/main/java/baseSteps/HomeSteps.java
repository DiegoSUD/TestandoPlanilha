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
	public void digito_o_cpf() throws GeneralLeanFtException, InterruptedException {
	   homePage.digitoCPF();
	   homePage.clicarBotaoContinuarCPF();
	}

	@E("preencho o cadastro")
	public void preencho_o_cadastro() throws GeneralLeanFtException, CloneNotSupportedException, InterruptedException {
		homePage.preencherFormularioCadastro();
	   
	}

	@Entao("retorna a tela home")
	public void retorna_a_tela_home() throws GeneralLeanFtException {
		homePage.espera("https://hml-lojaonline.vivo.com.br/vivostorefront/?site=vivo");
		homePage.validarTelaHome();
	    
	}

	@E("clico no botao sair")
	public void clico_no_botao_sair() throws GeneralLeanFtException {
		homePage.botaoSair();
	   
	}

	@E("recarrega a pagina novamente")
	public void recarrega_a_pagina_novamente() throws GeneralLeanFtException {
	   homePage.recarregarPaina();
	}

	@E("digito a senha")
	public void digito_a_senha() throws GeneralLeanFtException, InterruptedException {
	    homePage.digitarSenha();
//	    Thread.sleep(50000);
	}

	@E("preenche os campos com pedencia")
	public void preenche_os_campos_com_pedencia() throws InterruptedException, GeneralLeanFtException, CloneNotSupportedException {
		homePage.clicarBotaoOkAlert();
		homePage.preencherFormularioPendenciasCadastrais();
	   
	}

	@Entao("valido a tela cadastro com sucesso")
	public void valido_a_tela_cadastro_com_sucesso() throws GeneralLeanFtException {
		homePage.espera("https://hml-lojaonline.vivo.com.br/vivostorefront/?site=vivo");
		homePage.validarTelaHome();
		homePage.preencherPlanilhaExcel();
	}

	
}
