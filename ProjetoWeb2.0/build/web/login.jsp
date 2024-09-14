<jsp:include page ="cabeçalho.jsp" />

<html lang="pt">
    <head>
        <title>Login</title>
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="Css/util.css">
        <link rel="stylesheet" type="text/css" href="Css/main.css">
        <!--===============================================================================================-->
        <meta name="robots" content="noindex, follow">
    </head>
    <body>

        <div class="limiter">
            <div class="container-login100">
                <div class="wrap-login100">
                    <div class="login100-form-title" style="background-image: url(images/bg-01.jpg);">
                        <span class="login100-form-title-1">
                            Entrar
                        </span>
                    </div>

                    <form class="login100-form validate-form">
                        <div class="wrap-input100 validate-input m-b-26" data-validate="Username is required">
                            <span class="label-input100">Usuário</span>
                            <input class="input100" type="text" name="username" placeholder="Enter username">
                            <span class="focus-input100"></span>
                        </div>

                        <div class="wrap-input100 validate-input m-b-18" data-validate = "Password is required">
                            <span class="label-input100">Senha</span>
                            <input class="input100" type="password" name="pass" placeholder="Enter password">
                            <span class="focus-input100"></span>
                        </div>

                        <div class="flex-sb-m w-full p-b-30">
                            

                            <div>
                                <a href="cadastro.jsp" class="txt1">
                                    Cadastrar?
                                </a>
                            </div>
                        </div>

                        <div class="container-login100-form-btn">
                            <button class="login100-form-btn">
                                Login
                            </button>
                        </div>
                    </form>
                </div>
            </div>
        </div>

    </body>
</html>