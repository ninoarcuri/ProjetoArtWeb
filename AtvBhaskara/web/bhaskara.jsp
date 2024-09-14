<%@page import="br.bhaskara.Bhaskara"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculo de bhaskara</title>
    </head>
    <body>
        <!--        Aqui você deve colocar a lógica para exeibir o delta, e as raizes
                Somente podem exisitr raizes se o delta for > 0
                O valor "a" nunca poderá ser zero-->
        <h1>Calculando</h1>
        <hr>
        <%
            double vA, vB, vC, x1, x2, delta;
            vA = Double.parseDouble(request.getParameter("txtA"));
            vB = Double.parseDouble(request.getParameter("txtB"));
            vC = Double.parseDouble(request.getParameter("txtC"));

            Bhaskara bhaskara = new Bhaskara();
            bhaskara.setValorA(vA);
            bhaskara.setValorB(vB);
            bhaskara.setValorC(vC);
            
          

        %>
        <strong>Dados Informados:</strong>
        <ul>
            <li><strong>Valor A:</strong><%= vA%> </li> 
            <li><strong>Valor B:</strong><%= vB%> </li>
            <li><strong>Valor C:</strong><%= vC%> </li>
            <br>

        </ul>
            <form action="index.html">
        <strong>Calculo de Bhaskara:</strong>
        <ul>

            <li><strong>Delta:</strong><%= bhaskara.calculaDelta() %> </li>
            <br>
            <li><strong>x1:</strong><%= bhaskara.calculaX1() %> </li>
            <br>
            <li><strong>x2:</strong><%= bhaskara.calculaX2()%> </li>

        </ul>
            <input type="submit" value="Volta">
            </form>

    </body>
</html>
