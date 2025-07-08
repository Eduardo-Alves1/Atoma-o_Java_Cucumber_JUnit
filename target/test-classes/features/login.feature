#language:pt
#autor: Eduardo

Funcionalidade: Login de usuário na plataforma do Aluno
  Como um usuário da plataforma do aluno
  Quero enviar minhas credenciais
  Para acessar a área logada

  Contexto: Acessar tela de login
    Dado que eu acesse o formulário de login

  Cenário: Login com credenciais válidas
    Quando eu informar as credenciais email e senha
    E clicar no botão entrar
    Então devo ser redirecionado a tela inicial