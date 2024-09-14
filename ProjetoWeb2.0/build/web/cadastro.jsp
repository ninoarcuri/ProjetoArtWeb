<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
    </head>
    <body>
        <form action="CadastroServlet" method="post">
            <h3> Cadastro de Clientes</h3>
            <table>
                    <tr>
                    <td>Nome</td>
                    <td><input type="text" name="txtnome"/></td>
                    </tr>
                    
                    <tr>
                    <td>Sobrenome</td>
                    <td><input type="text" name="txtsobrenome"/></td>
                    </tr>
                    
                    <tr>
                    <td>Data de Nascimento</td>
                    <td><input type="date" name="txtdatanascimento"/></td>
                    </tr>
                    
                    <tr>
                    <td>Endereço</td>
                    <td><input type="text" name="txtendereco"/></td>
                    </tr>
                    
                    
                    <tr>
                    <td>Bairro</td>
                    <td><input type="text" name="txtbairro"/></td>
                    </tr>
                    
                    <tr>
                    <td>CEP</td>
                    <td><input type="text" name="txtcep"/></td>
                    </tr>
                    
                    <tr>
                    <td>Telefone</td>
                    <td><input type="text" name="txttelefone"/></td>
                    </tr>
                    
                    <tr>
                    <td>Celular</td>
                    <td><input type="text" name="txtcelular"/></td>
                    </tr>
                    
                    <tr>
                    <td>Email</td>
                    <td><input type="text" name="txtemail"/></td>
                    </tr>
                    
                    <tr>
                    <td>Login</td>
                    <td><input type="text" name="txtlogin"/></td>
                    </tr>
                                                            
                    <tr>
                    <td>Senha</td>
                    <td><input type="text" name="txtsenha"/></td>
                    </tr>
                    
                    <tr>
                    <td>
                    <input type="submit" value="Salvar"/>
                    </td>
                    </tr>
                    
            </table>
        </form>
    </body>
</html>
