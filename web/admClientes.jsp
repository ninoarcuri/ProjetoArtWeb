<%@page import="br.uninove.dao.ClienteDAO"%>
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
    
                                 
            <h2> Nossos Clientes:</h2>
            <br>
            <br>
            <!--  ------------------------------>
     <div class="container mt-4">
            <table class="table justify-content-center">
                <thead class="thead-dark">
                    <tr>
                        <th scope="col">ID</th>
                        <th scope="col">Nome</th>
                        <th scope="col">Sobrenome</th>
                        <th scope="col">Data Nascimento</th>
                        <th scope="col">Endereço</th>
                        <th scope="col">Bairro</th>
                        <th scope="col">CEP</th>
                        <th scope="col">Tel</th>
                        <th scope="col">Cel</th>
                        <th scope="col">E-mail</th>
                        <th scope="col">Login</th>
                        <th scope="col">Senha</th>
                        
                        
                        
                    </tr>
                </thead>
                <tbody>
                <% for(Usuario u : usuarios) { %>
                    <tr>
                        <td><%=u.getIdUser()%></td>
                        <td><%=u.getCliente().getNomeUsuario()%></td>
                        <td><%=u.getCliente().getSobrenomeUsuario()%></td>
                        <td><%=u.getCliente().getData_nasc()%></td>
                        <td><%=u.getCliente().getEndereco() %></td>
                        <td><%=u.getCliente().getBairro() %></td>
                        <td><%=u.getCliente().getCep() %></td>
                        <td><%=u.getCliente().getTelefone() %></td>
                        <td><%=u.getCliente().getCelular() %></td>
                        <td><%=u.getCliente().getEmail() %></td>
                        <td><%=u.getLogin()%></td>
                        <td><%=u.getSenha()%></td>
                        
                        <td>Editar</td>
                        <td>Excluir</td>
                        
                    </tr>
                    <% } %>
                </tbody>
            </table>
        </div>
