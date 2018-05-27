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
            <h1>Usuários</h1>
            <div>
                <a href="Usuario?c=Cadastrar"> 
                    <button type="button" class="btn btn-success">Adicionar</button>
                </a>
            </div>
            <br />
            <table class="table">
                <thead>
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">Usuário</th>
                        <th scope="col">Senha</th>
                        <th scope="col">Ação</th>
                    </tr>
                </thead>
                <tbody>
                    <% for(Models.Usuario u : FakeStorage.Usuario.List) { %>
                    <tr>
                        <th scope="row"><%=u.getId()%></th>
                        <td><%=u.getUsuario()%></td>
                        <td><%=u.getSenha()%></td>
                        <td><a href="Usuario?c=Detalhar&Id=<%=u.getId()%>">Editar</a> | <a href="Usuario?c=Remover&Id=<%=u.getId()%>">Remover</a> </td>
                    </tr>
                    <% } %>
                </tbody>
            </table>
        </div>
    </body>
</html>
