<%-- 
    Document   : resultadoconsultarbyid
    Created on : 06/06/2023, 21:44:12
    Author     : alunos
--%>

<%@page import="Model.Carro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="estilo/estilo.css">
    </head>
    <body>
        <h1>Resultado Consultar By ID</h1>
        <%
            Carro c = (Carro) request.getAttribute("c");
        %>
        <% boolean preenchido = (c.getModelo()!=null)&&(c.getPlaca()!=null)&&(c.getCor()!=null)&&(c.getKm() != null);
        preenchido = preenchido&& (c.getFabricante() != null)&&(c.getCategoria() != null)&&(c.getCambio() != null)&&(c.getAno()!=null);
        preenchido = preenchido&&(c.getMotor() != null);
        if (c != null){ %>

        ID <%out.print(c.getIdcarro());%> <br/>
        Modelo <%out.print(c.getModelo());%> <BR/>
        Placa <%out.print(c.getPlaca());%> <BR/>
        Placa <%out.print(c.getCor());%> <BR/>
        Placa <%out.print(c.getKm());%> <BR/>
        Placa <%out.print(c.getPreco());%> <BR/>
        Placa <%out.print(c.getFabricante());%> <BR/>
        Placa <%out.print(c.getCategoria());%> <BR/>
        Placa <%out.print(c.getCambio());%> <BR/>
        Placa <%out.print(c.getAno());%> <BR/>
        Placa <%out.print(c.getMotor());%> <BR/>
        <%} else {%>
        <h2>Produto não encontrado.</h2>
        <%}%>
    </body>
</html>
