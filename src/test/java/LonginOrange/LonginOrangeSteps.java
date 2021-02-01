package LonginOrange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import hooks.com.br.hooks;

public class LonginOrangeSteps {
	
	WebDriver driver;
	
	public LonginOrangeSteps() {
		driver = hooks.getDriver();
	}
	
	@Dado("^que acesso a URL \"([^\"]*)\"$")
	public void que_acesso_a_URL(String url) {
		driver.get(url);
	}

	@Quando("^digitado \"([^\"]*)\" no campo usuario, \"([^\"]*)\" no campo senha corretos$")
	public void digitado_no_campo_usuario_no_campo_senha_corretos(String usuario, String senha) {
		
		driver.findElement(By.id("txtUsername")).sendKeys(usuario);
		driver.findElement(By.id("txtPassword")).sendKeys(senha);
	}

	@Quando("^clicar no botão \"([^\"]*)\"$")
	public void clicar_no_botão(String arg1) {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Entao("^a pagina realiza o login$")
	public void a_pagina_realiza_o_login() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Quando("^digitado no campo usuario \"([^\"]*)\", no campo senha \"([^\"]*)\"$")
	public void digitado_no_campo_usuario_no_campo_senha(String arg1, String arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Entao("^a mensagem de erro \"([^\"]*)\" aparece$")
	public void a_mensagem_de_erro_aparece(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Quando("^clicado no botão \"([^\"]*)\" na area de acesso da pagina$")
	public void clicado_no_botão_na_area_de_acesso_da_pagina(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Entao("^a pagina doreciona para a area de reset de senhas$")
	public void a_pagina_doreciona_para_a_area_de_reset_de_senhas() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Quando("^clicado no botao \"([^\"]*)\" sem digitar dados de usuario$")
	public void clicado_no_botao_sem_digitar_dados_de_usuario(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Quando("^senha$")
	public void senha() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Entao("^a mensagem \"([^\"]*)\" aparece e nao permite o login$")
	public void a_mensagem_aparece_e_nao_permite_o_login(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Quando("^clicado no botão \"([^\"]*)\" do Linkedin$")
	public void clicado_no_botão_do_Linkedin(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Entao("^é redirecionado a pagina OrangeHRM no linkedin$")
	public void é_redirecionado_a_pagina_OrangeHRM_no_linkedin() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Quando("^clicado no botao \"([^\"]*)\" do facebook$")
	public void clicado_no_botao_do_facebook(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Entao("^é redirecionado a pagina OrangeHRM no facebook$")
	public void é_redirecionado_a_pagina_OrangeHRM_no_facebook() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Quando("^clicado no botão \"([^\"]*)\" do Twitter$")
	public void clicado_no_botão_do_Twitter(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Entao("^é redirecionado a pagina OrangeHRM no twitter$")
	public void é_redirecionado_a_pagina_OrangeHRM_no_twitter() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Quando("^clicado no botão \"([^\"]*)\"$")
	public void clicado_no_botão(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Entao("^é redirecionado para canal OrangeHRM Inc no YouTube$")
	public void é_redirecionado_para_canal_OrangeHRM_Inc_no_YouTube() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Quando("^clicado no botão OrangeHRM\\.inc no rodape da pagina$")
	public void clicado_no_botão_OrangeHRM_inc_no_rodape_da_pagina() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Entao("^acesso a pagina \"([^\"]*)\"$")
	public void acesso_a_pagina(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Quando("^digitado qualquer caracter Alpha Numerico no campo senha$")
	public void digitado_qualquer_caracter_Alpha_Numerico_no_campo_senha() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Entao("^os caracteres sao todos camuflados$")
	public void os_caracteres_sao_todos_camuflados() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Quando("^digitado qualquer caracter Alpha Numerico no campo usuario$")
	public void digitado_qualquer_caracter_Alpha_Numerico_no_campo_usuario() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Entao("^os caracteres aparecem normalmente$")
	public void os_caracteres_aparecem_normalmente() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
}
