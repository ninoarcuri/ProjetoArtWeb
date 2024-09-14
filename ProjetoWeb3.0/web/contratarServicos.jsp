<%@page import="br.uninove.model.Servico"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.uninove.dao.ServicoDAO"%>
<%@page import="java.util.Map"%>
<%@page import="br.uninove.model.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ServicoDAO aDAO = new ServicoDAO();
    ArrayList<Servico> servicos = aDAO.getTodosServicos();
%>


<html>
    <head>
        <jsp:include page="cabeçalho2.jsp"></jsp:include>
            <title>ArtWeb Área do Cliente</title>
            <meta charset="utf-8">
            <!--===============================================================================================-->
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <!--===============================================================================================-->
            <link href="Css/estilos.css" rel="stylesheet">
            <!--===============================================================================================-->
            <link rel="stylesheet" type="text/css" href="Css/main.css">

        </head>
        <b <body>
                <div class=cabeçalho">
                    <ul>
                        <li><a href="clienteHome.jsp">Meus dados</a></li>
                        <li><a href="meusServicos.jsp">Meus Serviços</a></li>
                        <li><a href="contratarServicos.jsp">Contratar Serviços</a></li>
                        <li style="float:right"><a class="active" href="index.jsp">Sair</a></li>
                    </ul>
                </div>

                <form action="ServicosCliente" method="post">
                    <h3> Selecione os serviços que deseja contratar:</h3>
                    <br>
                    <br>

                    <div class="container mt-4">
                        <table class="table justify-content-center">
                            <thead class="thead-dark">
                                <tr>
                                    <th scope="col">ID</th>
                                    <th scope="col">Nome do Serviço</th>
                                    <th scope="col">Descrição</th>
                                    <th scope="col">Tipo</th>
                                    <th scope="col">Valor</th>


                                </tr>
                            </thead>
                            <tbody>
                            <% for (Servico a : servicos) {%>
                            <tr>
                                <td><%=a.getIdServ()%></td>
                                <td><%=a.getNome_servico()%></td>
                                <td><%=a.getDescricao()%></td>
                                <td><%=a.getTipo()%></td>
                                <td><%=a.getValor()%></td>
                                <td>Contratar</td>

                            </tr>
                            <% }%>
                        </tbody>
                    </table>
                </div>




        </body>


