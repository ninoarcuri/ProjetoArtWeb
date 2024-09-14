<jsp:include page="cabeçalho2.jsp"></jsp:include>
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
                <li style="float:right"><a class="active" href="login.jsp">Login</a></li>
            </ul>
        </div>
         
          <form action="ServicosCliente" method="post">
            <h3> Meus Serviços Contratados:</h3>
            <br>
            <br>
            <table>
                    <tr>
                    <td>Código:</td>
                    <td><input type="text" name="txtidServico"/></td>
                    </tr>
                    
                    <tr>
                    <td>Nome do Serviço:</td>
                    <td><input type="text" name="txtmostraNomeServico"/></td>
                    </tr>
                    
                    <tr>
                    <td>Descrição:</td>
                    <td><input type="text" name="txtmostraDescricao"/></td>
                    </tr>
                    
                    <tr>
                    <td>valor:</td>
                    <td><input type="text" name="txtmostraValor"/></td>
                    </tr>
                    
                    <tr>
                    <td>Tipo:</td>
                    <td><input type="text" name="txtmostraTipo"/></td>
                    </tr>
                                                        
            </table>
        </form>
         
         
    </body>