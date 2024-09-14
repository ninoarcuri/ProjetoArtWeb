<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="cabeçalho2.jsp"></jsp:include>
<html>
    <head>
        <title>ArtWeb Home</title>
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


        <h2> Informações:</h2>
        <br>
        <br>
        <!--  ------------------------------>
        <div class="limiter">           
            <div class="table100">
                <table>
                    <thead>
                        <tr class="table100-head">
                            <th class="column1">Quantidade de Clientes Registrados:</th>
                            <th class="column1">Quantidade de Pedidos Pendentes:</th>
                            <th class="column1">Registrar novos Serviços:</th>
                            <th class="column1">Grafico de Pedidos:</th>
                        </tr>
                    </thead>
                    <tbody>

                        <tr>
                            <td class="column1">########33</td>
                            <td class="column1">#############</td>
                            <td class="column1">#####</td>
                            <td class="column1">#########</td>
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
