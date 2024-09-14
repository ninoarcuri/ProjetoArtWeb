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
            <!--  ------------------------------>
                        
            <table border="1" style="width: 70%">
                <thead>
                    <tr style="background-color: black;color:white">
                    <th>ID:</th>   
                    <th>Nome:</th>     
                    <th>Sobrenome:</th> 
                    <th>Data Nascimento:</th> 
                    <th>Endereço:</th> 
                    <th>Bairro:</th> 
                    <th>Cep:</th> 
                    <th>Telefone:</th> 
                    <th>Celular:</th> 
                    <th>E-mail:</th> 
                    <th>Login:</th>
                    <th>Senha:</th> 
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td><input type="text" name="txtid"/></td>
			<td><input type="text" name="txtmostraNome"/></td>
			<td><input type="text" name="txtmostraSobrenome"/></td>
			<td><input type="text" name="txtmostraDataNascimento"/></td>
			<td><input type="text" name="txtmostraEndereco"/></td>
                        <td><input type="text" name="txtmostraBairro"/></td>
                        <td><input type="text" name="txtmostraCep"/></td>
                        <td><input type="text" name="txtmostraTelefone"/></td>
                        <td><input type="text" name="txtmostraCelular"/></td>
                        <td><input type="text" name="txtmostraEmail"/></td>
                        <td><input type="text" name="txtmostraLogin"/></td>
                        <td><input type="text" name="txtmostraSenha"/></td>
                    </tr>    
                    </tbody>
                    </table>
                        
        </form>
        
    </body>