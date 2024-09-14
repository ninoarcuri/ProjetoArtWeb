<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <title>ArtWeb Pedidos</title>
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
                <li><a href="admHome.jsp">Área do Administrador</a></li>
                <li><a href="admPedidos.jsp">Pedidos</a></li>
                <li><a href="admClientes.jsp">Clientes</a></li>
                <li style="float:right"><a class="active" href="index.jsp">Sair</a></li>
            </ul>
        </div>
     
         
            <h2> Pedidos:</h2>
            <br>
            <br>
            <!--  ------------------------------>
            Realizados/Pendentes
     <table border="1" style="width: 70%">
                <thead>
                    <tr style="background-color: black;color:white">
                    <th>ID do Cliente:</th>   
                    <th>Nome do Cliente:</th> 
                    <th>Sobrenome do Cliente:</th>
                    <th>Nome do Serviço:</th> 
                    <th>ID do Serviço:</th>
                    <th>Data do Pedido:</th> 
                    <th>OBS:</th> 
                    <th>Telefone:</th> 
                    <th>Celular:</th> 
                    <th>Stats:</th> 
                    
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>1</td>
			<td>Renan</td>
			<td>Rosela Batista</td>
			<td>Logotipo</td>
                        <th>3</th>
			<td>23/05/2021</td>
                        <td>Gostaria de um logotipo empresarial para minha empresa de Contabilidade</td>
                        <th>(13)5256-9474:</th>
                        <th>(13)98854-9573:</th>
                        <th>Pendente</th> <th>Alterar</th>
                        
                    </tr>    
                    </tbody>
                    </table>
