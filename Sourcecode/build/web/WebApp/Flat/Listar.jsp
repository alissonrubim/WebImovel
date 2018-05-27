<%-- 
    Document   : Listar
    Created on : 27/05/2018, 11:54:40
    Author     : Alisson
--%>

<%@page import="Models.Storage.FakeStorage"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../_shared/Header.jsp" %>
    </head>
    <body>
        <%@include file="../_shared/MenuHeader.jsp" %>
        <div style="margin: 20px auto; width: 800px">
            <h1>Flats</h1>
            <div>
                <a href="Flat?c=Cadastrar"> 
                    <button type="button" class="btn btn-success">Adicionar</button>
                </a>
            </div>
            <br />
            <table class="table">
                <thead>
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">Endereco</th>
                        <th scope="col">Preço</th>
                    </tr>
                </thead>
                <tbody>
                    <% for (Models.Flat u : FakeStorage.Flat.List) {%>
                    <tr>
                        <th scope="row"><%=u.getId()%></th>
                        <td><%=u.getEndereco()%></td>
                        <td><%=u.getPreco()%></td>
                        <td><a href="Flat?c=Detalhar&Id=<%=u.getId()%>">Editar</a> | <a href="Flat?c=Remover&Id=<%=u.getId()%>">Remover</a> </td>
                    </tr>
                    <% }%>
                </tbody>
            </table>
        </div>
    </body>
</html>
