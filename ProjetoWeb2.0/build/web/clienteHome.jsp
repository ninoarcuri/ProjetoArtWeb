<html>
    <head>
        <title>ArtWeb Área do Cliente</title>
        <meta charset="utf-8">
        <!--===============================================================================================-->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!--===============================================================================================-->
        <link href="Css/estilos.css" rel="stylesheet">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="Css/main.css">

    </head>
    <body>
        <div class=cabeçalho">
            <ul>
                <li><a href="clienteHome.jsp">Meus dados</a></li>
                <li><a href="meusServicos.jsp">Meus Serviços</a></li>
                <li><a href="contratarServicos.jsp">Contratar Serviços</a></li>
                <li style="float:right"><a class="active" href="index.jsp">Sair</a></li>
            </ul>
        </div>
     
         <form action="DadosCliente" method="post">
            <h3> Meus Dados</h3>
            <br>
            <br>
            <table>
                    <tr>
                    <td>ID:</td>
                    <td><input type="text" name="txtid"/></td>
                    </tr>
                    
                    <tr>
                    <td>Nome:</td>
                    <td><input type="text" name="txtmostraNome"/></td>
                    </tr>
                    
                    <tr>
                    <td>Sobrenome:</td>
                    <td><input type="text" name="txtmostraSobrenome"/></td>
                    </tr>
                    
                    <tr>
                    <td>Data Nascimento:</td>
                    <td><input type="text" name="txtmostraDataNascimento"/></td>
                    </tr>
                    
                    <tr>
                    <td>Endereço:</td>
                    <td><input type="text" name="txtmostraEndereco"/></td>
                    </tr>
                    
                    <tr>
                    <td>Bairro:</td>
                    <td><input type="text" name="txtmostraBairro"/></td>
                    </tr>
                    
                    <tr>
                    <td>CEP:</td>
                    <td><input type="text" name="txtmostraCep"/></td>
                    </tr>
                    
                    <tr>
                    <td>Telefone:</td>
                    <td><input type="text" name="txtmostraTelefone"/></td>
                    </tr>
                    
                    <tr>
                    <td>Celular:</td>
                    <td><input type="text" name="txtmostraCelular"/></td>
                    </tr>
                    
                    <tr>
                    <td>Email:</td>
                    <td><input type="text" name="txtmostraEmail"/></td>
                    </tr>
                    
                    <tr>
                    <td>Login:</td>
                    <td><input type="text" name="txtmostraLogin"/></td>
                    </tr>
                    
                    <tr>
                    <td>Senha:</td>
                    <td><input type="text" name="txtmostraSenha"/></td>
                    </tr>
                                    
            </table>
        </form>
        
    </body>