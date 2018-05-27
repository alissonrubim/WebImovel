
<%@page import="Models.Storage.FakeStorage"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%Models.Usuario model = ((Models.Usuario)request.getAttribute("Model")); %>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../_shared/Header.jsp" %>
    </head>
    <body>
        <%@include file="../_shared/MenuHeader.jsp" %>
        <div style="margin: 20px auto; width: 800px">
            <h1>Usuário</h1>
            <form action="Usuario">
                
                <input type="hidden" name="c" value="Editar" />
                <input type="hidden" name="Id" value="<%=model.getId()%>" />
                <div class="form-group">
                    <label for="exampleInputEmail1">Usuário</label>
                    <input type="text" name="usuario" value="<%=model.getUsuario()%>" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Usuário">
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword1">Senha</label>
                    <input type="password" name="senha" value="<%=model.getSenha()%>" class="form-control" id="exampleInputPassword1" placeholder="Senha">
                </div>
                <button type="submit" class="btn btn-primary">Salvar</button>
            </form>
        </div>
    </body>
</html>
