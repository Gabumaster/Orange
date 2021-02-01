#language: pt
Funcionalidade: Login sistema OrangeHRM
	Eu como usuário
	Quero reralizar login no sistema
	
Contexto: acessar o sistema
	Dado que acesso a URL "https://opensource-demo.orangehrmlive.com/index.php/auth/login"

@CT-01
Cenario: CT-01 - Login com sucesso
	Quando digitado "admin" no campo usuario, "admin123" no campo senha corretos 
	E clicar no botão "LOGIN"
	Entao a pagina realiza o login
	
Cenario: CT-02 - Login invalido
	Quando digitado no campo usuario "!@#$$%", no campo senha "!@@$%"
	E clicar no botão "LOGIN"
	Entao a mensagem de erro "invalid credentials" aparece
	
Cenario: CT-03 - Forgot your password
	Quando clicado no botão "Forgot your password?" na area de acesso da pagina
	Entao a pagina doreciona para a area de reset de senhas
	
Cenario: CT-04 - Acesso sem preenchimento
	Quando clicado no botao "LOGIN" sem digitar dados de usuario 
	E senha
	Entao a mensagem "Username Cannot be empty" aparece e nao permite o login
	
Cenario: CT-05 - botao linkedin
	Quando clicado no botão "IN" do Linkedin
	Entao é redirecionado a pagina OrangeHRM no linkedin

Cenario: CT-06 - botão facebook
	Quando clicado no botao "f" do facebook
	Entao é redirecionado a pagina OrangeHRM no facebook
	
Cenario: CT-07 - botao twitter
	Quando clicado no botão "t" do Twitter
	Entao é redirecionado a pagina OrangeHRM no twitter
	
Cenario: CT-08 - botao youtube
	Quando clicado no botão "youtube"
	Entao é redirecionado para canal OrangeHRM Inc no YouTube
	
Cenario: CT-09 - botao OrangeHRM.inc
	Quando clicado no botão OrangeHRM.inc no rodape da pagina
	Entao acesso a pagina "https://www.orangehrm.com/"
		
Cenario: CT-10	- caracteres campo senha
	Quando digitado qualquer caracter Alpha Numerico no campo senha
	Entao os caracteres sao todos camuflados
	
Cenario: CT-11 - caracteres campo usuario
	Quando digitado qualquer caracter Alpha Numerico no campo usuario
	Entao os caracteres aparecem normalmente