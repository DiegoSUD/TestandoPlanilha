#language:pt
Funcionalidade: Cadastrar massas apartir do site meu Vivo

  Cenario: Cadastrar massa no meu vivo
  	Dado que estou na tela home do site meu vivo
    #Quando clico no botao entrar
    #E digito o cpf
    #E preencho o cadastro
    #Entao retorna a tela home
    #E clico no botao sair
    #E recarrega a pagina novamente
    E clico no botao entrar
    E digito o cpf
    E digito a senha
    E preenche os campos com pedencia
    Entao valido a tela cadastro com sucesso