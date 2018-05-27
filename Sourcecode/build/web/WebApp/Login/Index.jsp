<%-- 
    Document   : Index
    Created on : 26/05/2018, 11:46:40
    Author     : Alisson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../_shared/Header.jsp" %>
    </head>
    <body>
        <div class="card" style="width: 400px; margin: 20px auto;">
            <div class="card-header">
                Sejam bem-vindo(a) ao WebImovel!
            </div>
            <div class="card-body">
                <h5 class="card-title">Login</h5>
                <p class="card-text">Faça login para entrar no sistema.</p>
                <form action="Login">
                    <input type="hidden" name="c" value="Login" />
                    <div class="form-group">
                        <label for="exampleInputEmail1">Usuário</label>
                        <input type="text" name="usuario" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Usuário">
                    </div>
                    <div class="form-group">
                        <label for="exampleInputPassword1">Senha</label>
                        <input type="password" name="senha" class="form-control" id="exampleInputPassword1" placeholder="Senha">
                    </div>
                    <button type="submit" class="btn btn-primary">Entrar</button>
                    <a href="/Usuario?c=Cadastrar">Cadastre-se</a>
                </form>
            </div>
        </div>
    </body>
</html>
