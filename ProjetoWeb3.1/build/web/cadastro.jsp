<%@page import="java.util.ArrayList"%>
<%@page import="br.uninove.dao.UsuarioDAO"%>
<%@page import="java.util.Map"%>
<%@page import="br.uninove.model.Usuario"%>
<%@page import="br.uninove.model.Cliente"%>
<jsp:include page ="cabeçalho2.jsp" />

<html lang="pt">
    <head>
        <title>Cadastro</title>
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="Css/util.css">
        <link rel="stylesheet" type="text/css" href="Css/estilocadastro.css">
        <!--===============================================================================================-->
        <meta name="robots" content="noindex, follow">
    </head>
    <body>

        <div class="limiter">
            <div class="container-cadastro100">
                <div class="wrap-cadastro100">
                    <div class="cadastro100-form-title" style="background-color: rgb(0, 255, 100); ">
                        <span class="cadastro100-form-title-1">
                            Cadastro de Usuário
                        </span>
                    </div>

                    <form method="POST" action="Cadastro" class="cadastro100-form validate-form">
                        <div class="wrap-input100 validate-input m-b-26" data-validate="Username is required">
                            <span class="label-input100">Nome</span>
                            <input class="input100" type="text" name="txtnome" placeholder="Coloque Seu Primeiro Nome">
                            <span class="focus-input100"></span>
                        </div>

                        <div class="wrap-input100 validate-input m-b-26" data-validate="Username is required">
                            <span class="label-input100">Sobrenome</span>
                            <input class="input100" type="text" name="txtsobrenome" placeholder="Coloque seu Sobrenome Completo">
                            <span class="focus-input100"></span>
                        </div>

                        <div class="wrap-input100 validate-input m-b-10" data-validate = "Password is required">
                            <span class="label-input100">Data Nascimento:</span>
                            <input class="input100" type="date" name="txtdataNascimento" placeholder="Data de Nascimento">
                            <span class="focus-input100"></span>
                        </div>
                        <div class="wrap-input100 validate-input m-b-10" data-validate = "Password is required">
                            <span class="label-input100">Endereço</span>
                            <input class="input100" type="text" name="txtendereco" placeholder="Ex:Rua dos Exemplos 777 ">
                            <span class="focus-input100"></span>
                        </div>
                        <div class="wrap-input100 validate-input m-b-26" data-validate = "Password is required">
                            <span class="label-input100">Bairro</span>
                            <input class="input100" type="text" name="txtbairro" placeholder="Ex. Pq São Paulo">
                            <span class="focus-input100"></span>
                        </div>
                        <div class="wrap-input100 validate-input m-b-26" data-validate = "Password is required">
                            <span class="label-input100">CEP</span>
                            <input class="input100" type="text" name="txtcep" placeholder="Ex. 000.00-000">
                            <span class="focus-input100"></span>
                        </div>
                        <div class="wrap-input100 validate-input m-b-26" data-validate = "Password is required">
                            <span class="label-input100">Telefone</span>
                            <input class="input100" type="text" name="txttelefone" placeholder="Ex.(11)7777-7777">
                            <span class="focus-input100"></span>
                        </div>
                        <div class="wrap-input100 validate-input m-b-26" data-validate = "Password is required">
                            <span class="label-input100">Celular</span>
                            <input class="input100" type="text" name="txtcelular" placeholder="Ex.(11)97777-7777">
                            <span class="focus-input100"></span>
                        </div>
                        <div class="wrap-input100 validate-input m-b-30" data-validate = "Password is required">
                            <span class="label-input100">Email</span>
                            <input class="input100" type="text" name="txtemail" placeholder="exemplo@exemplo.com">
                            <span class="focus-input100"></span>
                        </div>
                        <div class="wrap-input100 validate-input m-b-26" data-validate = "Password is required">
                            <span class="label-input100">Usuário</span>
                            <input class="input100" type="text" name="txtlogin" placeholder="Coloque se Usuário">
                            <span class="focus-input100"></span>
                        </div>
                        <div class="wrap-input100 validate-input m-b-18" data-validate = "Password is required">
                            <span class="label-input100">Senha</span>
                            <input class="input100" type="password" name="txtsenha" placeholder="Coloque sua senha">
                            <span class="focus-input100"></span>
                        </div>

                        <div class="flex-sb-m w-full p-b-30">
                            <div>
                                <a href="login.jsp" class="txt1">
                                    
                                </a>
                            </div>

                        </div>

                        <div class="container-cadastro100-form-btn">
                            <button class="cadastro100-form-btn">
                                Cadastrar
                            </button>
                        </div>
                    </form>
                </div>
            </div>
        </div>

    </body>
</html>