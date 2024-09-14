<jsp:include page ="cabeçalho.jsp" />

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

                    <form class="cadastro100-form validate-form">
                        <div class="wrap-input100 validate-input m-b-26" data-validate="Username is required">
                            <span class="label-input100">Nome</span>
                            <input class="input100" type="text" name="Nome" placeholder="Enter Nome">
                            <span class="focus-input100"></span>
                        </div>

                        <div class="wrap-input100 validate-input m-b-26" data-validate="Username is required">
                            <span class="label-input100">Sobrenome</span>
                            <input class="input100" type="text" name="Sobrenome" placeholder="Enter Sobrenome">
                            <span class="focus-input100"></span>
                        </div>

                        <div class="wrap-input100 validate-input m-b-10" data-validate = "Password is required">
                            <span class="label-input100">Idade</span>
                            <input class="input100" type="text" name="Idade" placeholder="Enter Idade">
                            <span class="focus-input100"></span>
                        </div>
                        <div class="wrap-input100 validate-input m-b-10" data-validate = "Password is required">
                            <span class="label-input100">Sexo</span>
                            <input class="input100" type="text" name="Sexo" placeholder="Enter Sexo">
                            <span class="focus-input100"></span>
                        </div>
                        <div class="wrap-input100 validate-input m-b-26" data-validate = "Password is required">
                            <span class="label-input100">Endereço</span>
                            <input class="input100" type="text" name="Endereço" placeholder="Enter Endereço">
                            <span class="focus-input100"></span>
                        </div>
                        <div class="wrap-input100 validate-input m-b-30" data-validate = "Password is required">
                            <span class="label-input100">Email</span>
                            <input class="input100" type="text" name="Email" placeholder="Enter Email">
                            <span class="focus-input100"></span>
                        </div>
                        <div class="wrap-input100 validate-input m-b-26" data-validate = "Password is required">
                            <span class="label-input100">Usuário</span>
                            <input class="input100" type="text" name="use" placeholder="Enter Usuário">
                            <span class="focus-input100"></span>
                        </div>
                        <div class="wrap-input100 validate-input m-b-18" data-validate = "Password is required">
                            <span class="label-input100">Senha</span>
                            <input class="input100" type="password" name="pass" placeholder="Enter password">
                            <span class="focus-input100"></span>
                        </div>

                        <div class="flex-sb-m w-full p-b-30">


                            <div>
                                <a >
                                    
                                </a>
                            </div>
                        </div>

                        <div class="container-cadastro100-form-btn">
                            <button class="cadastro100-form-btn">
                                Cadastra
                            </button>
                        </div>
                    </form>
                </div>
            </div>
        </div>

    </body>
</html>