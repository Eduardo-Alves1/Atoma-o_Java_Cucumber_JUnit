#language:pt
#autor: Eduardo

Funcionalidade: Login de suário na plataforma do Aluno
	Como um usuário da plataforma do aluno
	Quero enviar minhas credenciais
	Para acesar a área logada
	
	
		Contexto: Acessar tela de login
		Dado que eu acesse o formulário de login
		
			Cenário: Login com credenciais válidas
				Quando eu informar as credenciais email e senha
				E clicar no botão entrar
				Então devo ser redirecionado a tela inicial
				
			Cenário: Login com credenciais inválidas
				Quando eu informar as credenciais invalidas email ou senha
				E clicar no  botão entrar
				Então devo visualizar uma menssagem de erro