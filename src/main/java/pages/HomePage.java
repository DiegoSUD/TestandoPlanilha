package pages;

import java.util.Random;

import org.junit.Assert;

import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.web.Browser;

import baseSteps.LeitorExcel;


public class HomePage extends BasePage{

	

	private String botaoEntrarTelaHomeMeuVivo = "a.login-btn[title='Entre']";
	private String inputCPF = "j_username";
	private String botaoContinuarCPF = "button[title='Continuar']";
	private String nomeCompleto = "fullname";
	private String rg = "rg";
	private String orgaoEmissor = "issuingbody";
	private String comboBoxUFOrgaoEmissor = "button[data-id='issuingorgan']";
	private String tituloDadosPessoais = "Dados pessoais";
	private String dataNasc = "dob";
	private String radioMasc = "input#sex2";
	private String nomeMae = "mothersname";
	private String telefoneCadastro = "contactphone";
	private String comboBoxUFOrgaoEmissorOpçoes = "li[data-original-index] > a > span.text";
	private String email = "email";
	private String senha = "password";
	private String confirmarSenha = "confirmpassword";
	private String cep = "mobile";
	private String numero = "paragraph";
	private String logadouro = "button[data-id='logradouro']";
	private String complemento = "complement";
	private String botaoConcluirCadastro = "submitFormBtn";
	private String clicaBotaoSair = ".login a[href='#']";
	private String inputSenha = "j_password";
	private String botaoEntrar = "button[title='Entrar']";
	private String botaoOkAlert = "button#okerrordialogone";
	private String inputSexo = "button[data-id='sex']";
	private String botaoContinuar = "button#continuesignupform";

	public HomePage(Browser browser) {
		super(browser);
	}

	public void validarTelaHome() throws GeneralLeanFtException {
		Assert.assertEquals(this.browser.getURL(), "https://hml-lojaonline.vivo.com.br/vivostorefront/?site=vivo");
		
	}

	public void clicarBotaoEntrarTelaHomeMeuVivo() throws GeneralLeanFtException {
		click(botaoEntrarTelaHomeMeuVivo);
		
	}

	public void digitoCPF() throws GeneralLeanFtException, InterruptedException {
		try {
			clickEditField(inputCPF);
			write(inputCPF, LeitorExcel.lerPlanilhaExcel());
		} catch (Exception e) {
			System.err.println("TODOS CPF'S CADASTRADOS!!");
		}
		
	}

	public void clicarBotaoContinuarCPF() throws GeneralLeanFtException {
		click(botaoContinuarCPF);
		
	}

	public void preencherFormularioCadastro() throws GeneralLeanFtException, CloneNotSupportedException, InterruptedException {
		waitByElement(tituloDadosPessoais);
		clickEditFieldAndWrite(nomeCompleto, "teste dxc");
		clickEditFieldAndWrite(rg, "16627654");
		clickEditFieldAndWrite(orgaoEmissor, "ssp");
		click(comboBoxUFOrgaoEmissor);
		comboBox(comboBoxUFOrgaoEmissorOpçoes, "AM");
		clickEditFieldAndWrite(dataNasc, "01121988");
		click(radioMasc);
		clickEditFieldAndWrite(nomeMae, "dxc cadastroMassa");
		clickEditFieldAndWrite(telefoneCadastro, LeitorExcel.tel());
		clickEditFieldAndWrite(email, "testandoteste" + gerador + "@gmail.com");
		clickEditFieldAndWrite(senha, "112233");
		clickEditFieldAndWrite(confirmarSenha, "112233");
		clickEditFieldAndWrite(cep, "01010010");
		waitByElementCurto(numero);
		click(logadouro);
		selecionarComboBox("span", "RUA");
		clickEditFieldAndWrite(numero, "10");
		clickEditFieldAndWrite(complemento, "casa");
		clickWebElement(botaoConcluirCadastro);
		
		
	}

	public void botaoSair() throws GeneralLeanFtException {
		click(clicaBotaoSair);
		
	}

	public void recarregarPaina() throws GeneralLeanFtException {
		browser.refresh();
		
	}

	public void digitarSenha() throws GeneralLeanFtException, InterruptedException {
		waitByElementCurto(inputSenha);
		clickEditField(inputSenha);
		clickEditFieldAndWrite(inputSenha, "112233");
		click(botaoEntrar);
		
	}

	public void clicarBotaoOkAlert() throws InterruptedException, GeneralLeanFtException {
		waitByElement(botaoOkAlert);
		click(botaoOkAlert);
		
	}

	public void preencherFormularioPendenciasCadastrais() throws InterruptedException, GeneralLeanFtException, CloneNotSupportedException {
		waitByElementCurto(rg);
		clickEditFieldAndWrite(rg, "16627654");
		clickEditFieldAndWrite(orgaoEmissor, "ssp");
		click(comboBoxUFOrgaoEmissor);
		comboBox(comboBoxUFOrgaoEmissorOpçoes, "AM");
		click(inputSexo);
		selecionarComboBox("SPAN", "FEMININO");
		clickEditFieldAndWrite(nomeMae, "dxc cadastroMassa");
		clickEditFieldAndWrite(telefoneCadastro, LeitorExcel.tel());
		waitByElementCurto(botaoContinuar);
		click(botaoContinuar);
		
	}

	public void preencherPlanilhaExcel() {
		LeitorExcel.escreverPlanilhaExcel();
		System.out.println("Massa OK");
		
	}
	
	
	
	

}
