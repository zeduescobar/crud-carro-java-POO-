<%-- 
    Document   : resuladoconsultarbyid
    Created on : 06/06/2023, 12:09:02
    Author     : alunos
--%>

<%@page import="Model.Carro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultar por ID</title>
        <link rel="stylesheet" type="text/css" href="estilo/estilo.css">
    </head>
    <body>
        <h1>Resultado Consultar By ID</h1>
        <%
            Carro c = (Carro) request.getAttribute("c");
        %>
        <%if (c.getModelo() != null) {%>
        <%if (c.getPlaca() != null) {%>
        <%if (c.getModelo() != null) {%>
        <%if (c.getPlaca() != null) {%>
        <%if (c.getCor() != null) {%>
        <%if (c.getKm() != null) {%>
        <%if (c.getFabricante() != null) {%>
        <%if (c.getCategoria() != null) {%>
        <%if (c.getCambio() != null) {%>
        <%if (c.getAno() != null) {%>
        <%if (c.getMotor() != null) {%>

        ID <%out.print(c.getIdcarro());%> <BR>
        Modelo <%out.print(c.getModelo());%> <BR>
        Placa <%out.print(c.getPlaca());%> <BR>
        Placa <%out.print(c.getCor());%> <BR>
        Placa <%out.print(c.getKm());%> <BR>
        Placa <%out.print(c.getPreco());%> <BR>
        Placa <%out.print(c.getFabricante());%> <BR>
        Placa <%out.print(c.getCategoria());%> <BR>
        Placa <%out.print(c.getCambio());%> <BR>
        Placa <%out.print(c.getAno());%> <BR>
        Placa <%out.print(c.getMotor());%> <BR>
        <%} else {%>
        <h2>Produto não encontrado.</h2>
        <%}%>
    </body>
</html>
