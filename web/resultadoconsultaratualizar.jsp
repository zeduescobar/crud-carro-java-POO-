<%-- 
    Document   : resultadoconsultaratualizar
    Created on : 06/06/2023, 11:54:09
    Author     : alunos
--%>

<%@page import="Model.Carro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado Consultar por Id</title>
        <link rel="stylesheet" type="text/css" href="estilo/estilo.css">
    </head>
    <body>
        <h1>Resultado Consultar By ID</h1>
        <%
            Carro c = (Carro) request.getAttribute("c");
        %>


        <%if (c.getModelo() != null) {%>
        <%if (c.getPlaca() != null) {%>
        <%if (c.getCor() != null) {%>
        <%if (c.getKm() != null) {%>

        <%if (c.getFabricante() != null) {%>
        <%if (c.getCategoria() != null) {%>
        <%if (c.getCambio() != null) {%>
        <%if (c.getAno() != null) {%>
        <%if (c.getMotor() != null) {%>

        <form name="f1" action="Controle_Carro" method="GET">
            ID: <%out.print(c.getIdcarro());%> <input type="hidden" name="txtidcarro" value="<%out.print(c.getIdcarro());%>"> <BR>
            MODELO <input type="text" name="txtmodelo"value="<%out.print(c.getModelo());%>"> <BR>
            PLACA <input type="text" name="txtplaca"value="<%out.print(c.getPlaca());%>"> <BR>
            COR <input type="text" name="txtcor"value="<%out.print(c.getCor());%>"> <BR>
            KM <input type="text" name="txtkm"value="<%out.print(c.getKm());%>"> <BR>
            Preço <input type="text" name="txtpreco"value="<%out.print(c.getPreco());%>"> <BR>
            FABRICANTE <input type="text" name="txtfabricante"value="<%out.print(c.getFabricante());%>"> <BR>
            CATEGORIA <input type="text" name="txtcategoria"value="<%out.print(c.getCategoria());%>"> <BR>
            CAMBIO <input type="text" name="txtcambio"value="<%out.print(c.getCambio());%>"> <BR>
            ANO <input type="text" name="txtano"value="<%out.print(c.getAno());%>"> <BR>
            MOTOR <input type="text" name="txtmotor"value="<%out.print(c.getMotor());%>"> <BR>

            <input type="submit" name="op" value="EFETIVAR ATUALIZAÇÃO">
        </form>
        <%} else {%>
        <h2>Produto não encontrado.</h2>
        <%}%>
    </body>
</html>
