# language: pt

  @cadastro
  Funcionalidade: Cadastro de usuário

    @cadastro_sucesso
    Cenario: Registrar novo usuário com sucesso
      Dado que estou na tela de login
      E acesso o cadastro de usuário
      Quando eu preencho o formulário de cadastro
      E clico em registrar
      Então vejo usuario logado na tela

