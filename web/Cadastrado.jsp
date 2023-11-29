<%-- 
    Document   : Cadastrado
    Created on : 06/06/2023, 10:00:33
    Author     : alunos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página Resultado</title>
        <link rel="stylesheet" type="text/css" href="estilo/estilo.css">
    </head>
    <style>
        .img{
            width: 620;
                heigth: 620;
              
        }
    </style>
    <body>
        <%
           String msg = (String) request.getAttribute("message");
        %>
        
        <h1><%out.println(msg);%> realizado com sucesso.</h1>
        <div>
            <img src="imagens/vin.png">
            </div>
           
    </body>
</html>