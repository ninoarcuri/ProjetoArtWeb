<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="cabeçalho2.jsp"></jsp:include>
<html>
    <head>
        <title>ArtWeb Pedidos</title>
        <meta charset="utf-8">
        <!--===============================================================================================-->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!--===============================================================================================-->
        <link href="Css/estilomenu.css" rel="stylesheet">
        <!--===============================================================================================-->
        <link href="Css/estilotable.css" rel="stylesheet">

    </head>
    <body>
        <div class="menu2">
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
        <div class="limiter">           
            <div class="table100">
                <table>
                    <thead>
                        <tr class="table100-head">
                            <th class="column1">ID do Cliente:</th>   
                            <th class="column1">Nome do Cliente:</th> 
                            <th class="column1">Sobrenome do Cliente:</th>
                            <th class="column1">Nome do Serviço:</th> 
                            <th class="column1">ID do Serviço:</th>
                            <th class="column1">Data do Pedido:</th> 
                            <th class="column1">OBS:</th> 
                            <th class="column1">Telefone:</th> 
                            <th class="column1">Celular:</th> 
                            <th class="column1">Stats:</th> 
                            <th class="column1">Stats:</th> 
                        </tr>
                    </thead>
                    <tbody>

                        <tr>
                            <td class="column1">1</td>
                            <td class="column1">Renan</td>
                            <td class="column1">Rosela Batista</td>
                            <td class="column1">Logotipo</td>
                            <th class="column1">3</th>
                            <td class="column1">23/05/2021</td>
                            <td class="column1">Gostaria de um logotipo empresarial para minha empresa de Contabilidade</td>
                            <th class="column1">(13)5256-9474:</th>
                            <th class="column1">(13)98854-9573:</th>
                            <th class="column1">Pendente</th> 
                            <th class="column1">Alterar</th>

                        </tr>

                    </tbody>
                </table>
            </div>
        </div>


        <script>
            window.dataLayer = window.dataLayer || [];
            function gtag() {
                dataLayer.push(arguments);
            }
            gtag('js', new Date());

            gtag('config', 'UA-23581568-13');
        </script>

        <script defer src="https://static.cloudflareinsights.com/beacon.min.js" data-cf-beacon='{"rayId":"65945bee0a6bf667","token":"cd0b4b3a733644fc843ef0b185f98241","version":"2021.5.2","si":10}'></script>
    </body>
