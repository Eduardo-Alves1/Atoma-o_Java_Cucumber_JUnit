#language:pt
#autor: Eduardo

Funcionalidade: Deslogar o usuário
	Como usuário logado
	Quero falzer o logout
	Para para encerrar a cessão

	Contexto: Fazer logout
	Dado que eu esteja com cessão ativ
	
		Cenário: Logout do usuário
			Quando eu clicar no botão sair
			Então a cessão deve ser encerrada
			E voltar para a tela home de login