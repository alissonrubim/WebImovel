
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
            <h1>Flat</h1>
            <form action="Flat">

                <input type="hidden" name="c" value="Inserir" />
                <input type="hidden" name="id" value="" />
                <div class="form-group">
                    <label for="exampleInputEmail1">Endereço</label>
                    <input type="text" name="endereco" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Usuário">
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword1">Metro quadrado</label>
                    <input type="text" name="metroQuadrado" class="form-control" id="exampleInputPassword1" placeholder="Senha">
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword1">Preço</label>
                    <input type="text" name="preco" class="form-control" id="exampleInputPassword1" placeholder="Senha">
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword1">Quantidade de Garagem</label>
                    <input type="text" name="numGaragem" class="form-control" id="exampleInputPassword1" placeholder="Senha">
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword1">Quantidade de Quarto</label>
                    <input type="text" name="numQuarto" class="form-control" id="exampleInputPassword1" placeholder="Senha">
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword1">Qauntidade de Banheiro</label>
                    <input type="text" name="numBanheiro" class="form-control" id="exampleInputPassword1" placeholder="Senha">
                </div>
                <button type="submit" class="btn btn-primary">Salvar</button>
            </form>
        </div>
    </body>
</html>
