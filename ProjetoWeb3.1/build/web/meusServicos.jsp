<jsp:include page="cabeçalho2.jsp"></jsp:include>
<html>
    <head>
        <title>ArtWeb Área do Cliente</title>
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
            <!--  ------------------------------>
            <div class="limiter">           
                <div class="table100">
                    <table>
                        <thead>
                            <tr class="table100-head">
                                <th class="column1">Código:</th>
                                <th class="column1">Nome do Serviço</th>
                                <th class="column1">Descrição</th>
                                <th class="column1">Tipo</th>
                                <th class="column1">Valor</th>
                            </tr>
                        </thead>
                        <tbody>
                        
                        <tr>
                            <td class="column1"><input type="text" name="txtmostraNomeServico"/></td>
                            <td class="column1"><input type="text" name="txtmostraNomeServico"/></td>
                            <td class="column1"><input type="text" name="txtmostraNomeServico"/></td>
                            <td class="column1"><input type="text" name="txtmostraNomeServico"/></td>
                            <td class="column1"><input type="text" name="txtmostraNomeServico"/></td>
                           

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
