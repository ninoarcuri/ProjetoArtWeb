<%@page import="java.util.ArrayList"%>
<%@page import="br.uninove.dao.UsuarioDAO"%>
<%@page import="java.util.Map"%>
<%@page import="br.uninove.model.Usuario"%>
<%@page import="br.uninove.model.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    UsuarioDAO uDAO = new UsuarioDAO();
    ArrayList<Usuario> usuarios = uDAO.getTodosUsuarios();

%>
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


            <h2> Nossos Clientes:</h2>
            <br>
            <br>
            <!--  ------------------------------>
            <div class="limiter">           
                <div class="table100">
                    <table>
                        <thead>
                            <tr class="table100-head">
                                <th class="column1">ID</th>
                                <th class="column1">Nome</th>
                                <th class="column1">Sobrenome</th>
                                <th class="column1">Data Nascimento</th>
                                <th class="column1">Endereço</th>
                                <th class="column1">Bairro</th>
                                <th class="column1">CEP</th>
                                <th class="column1">Tel</th>
                                <th class="column1">Cel</th>
                                <th class="column1">E-mail</th>
                                <th class="column1">Login</th>
                                <th class="column1">Senha</th>
                                <th class="column2"></th>
                                <th class="column2"></th>
                            </tr>
                        </thead>
                        <tbody>
                        <% for (Usuario u : usuarios) {%>
                        <tr>
                            <td class="column1"><%=u.getIdUser()%></td>
                            <td class="column1"><%=u.getCliente().getNomeUsuario()%></td>
                            <td class="column1"><%=u.getCliente().getSobrenomeUsuario()%></td>
                            <td class="column1"><%=u.getCliente().getData_nasc()%></td>
                            <td class="column1"><%=u.getCliente().getEndereco()%></td>
                            <td class="column1"><%=u.getCliente().getBairro()%></td>
                            <td class="column1"><%=u.getCliente().getCep()%></td>
                            <td class="column1"><%=u.getCliente().getTelefone()%></td>
                            <td class="column1"><%=u.getCliente().getCelular()%></td>
                            <td class="column1"><%=u.getCliente().getEmail()%></td>
                            <td class="column1"><%=u.getLogin()%></td>
                            <td class="column1"><%=u.getSenha()%></td>

                            <td class="column2">Editar</td>
                            <td class="column2">Excluir</td>

                        </tr>
                        <% }%>
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
