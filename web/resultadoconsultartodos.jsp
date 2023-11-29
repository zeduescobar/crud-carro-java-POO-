<%-- 
    Document   : resultadoconsultartodos
    Created on : 06/06/2023, 10:48:45
    Author     : alunos
--%>

<%@page import="java.util.List"%>
<%@page import="Model.Carro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado Consultar Todos</title>
        <link rel="stylesheet" type="text/css" href="estilo/estilo.css">
    </head>
    <body>
       <h1>Todos os Produtos</h1>
        <%
            List<Carro> carro1 = (List<Carro>) request.getAttribute("carro1");
        %>
        
        <table border="1">
             <tr>
                <th>ID</th>
                <th>Modelo</th>
                <th>Placa</th>
                <th>Cor</th>
                <th>KM</th>
                <th>Preço</th>
                <th>Fabricante</th>
                <th>Categoria</th>
                <th>Cambio</th>
                <th>Ano</th>
                <th>Motor</th>
                <th>Remover</th>
                <th>Editar</th>
            </tr>
             <%for (Carro c: carro1) {%>
            <tr>                
                <td><%out.print(c.getIdcarro());%></td>
                <td><%out.print(c.getModelo());%></td>
                <td><%out.print(c.getPlaca());%></td>
                <td><%out.print(c.getCor());%></td>
                <td><%out.print(c.getKm());%></td>
                <td><%out.print(c.getFabricante());%></td>
                <td><%out.print(c.getCategoria());%></td>
                <td><%out.print(c.getCambio());%></td>
                <td><%out.print(c.getAno());%></td>
                <td><%out.print(c.getMotor());%></td>
                <td align="center"><a href="http://localhost:8084/CRUDCARRO/controle_carro?op=DELETAR&txtidcarro=<%out.print(c.getIdcarro());%>"><img src="images/lixeira01.png" width="25" height="25"></a></td>
                <td align="center"><a href="http://localhost:8084/CRUDCARRO/controle_carro?txtidcarro=<%out.print(c.getIdcarro());%>&txtmodelo=<%out.print(c.getModelo());%>&txtplaca=<%out.print(c.getPlaca());%>&txtcor<%out.print(c.getCor());%>&txtcor<%out.print(c.getCor());%>&txtpreco<%out.print(c.getPreco());%>&op=ATUALIZAR" ><img src="images/editar01.png" width="25" height="25"></a></td>
            </tr>
           <% }%>
        </table>
    </body>
</html>
