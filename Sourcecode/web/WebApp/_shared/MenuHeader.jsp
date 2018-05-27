<%-- 
    Document   : MenuHeader
    Created on : 27/05/2018, 11:24:13
    Author     : Alisson
--%>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Navbar</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Imóveis
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
          <a class="dropdown-item" href="Apartamento?c=Listar">Apartamentos</a>
          <a class="dropdown-item" href="Casa?c=Listar">Casas</a>
          <a class="dropdown-item" href="Chacara?c=Listar">Chácaras</a>
          <a class="dropdown-item" href="Cobertura?c=Listar">Coberturas</a>
          <a class="dropdown-item" href="Flat?c=Listar">Flats</a>
          <a class="dropdown-item" href="Garagem?c=Listar">Garagens</a>
          <a class="dropdown-item" href="Kitnet?c=Listar">Kitnets</a>
          <a class="dropdown-item" href="Loja?c=Listar">Lojas</a>
          <a class="dropdown-item" href="Sobrado?c=Listar">Sobrados</a>
          <a class="dropdown-item" href="Terreno?c=Listar">Terrenos</a>
        </div>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="Usuario?c=Listar">Usuários</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="Login?c=Logout">Sair</a>
      </li>
    </ul>
  </div>
</nav>
