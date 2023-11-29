<%-- 
    Document   : erro
    Created on : 06/06/2023, 09:29:13
    Author     : alunos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Falha na operação</title>
        <link rel="stylesheet" type="text/css" href="estilo/estilo.css">
    </head>
    <body>
        <%
           String msg = (String) request.getAttribute("message");
        %>
        <h1><%out.println(msg);%> não realizado</h1>
        <div>
            <img src="imagens/vindi.png">
            </div>
    </body>
</html>

