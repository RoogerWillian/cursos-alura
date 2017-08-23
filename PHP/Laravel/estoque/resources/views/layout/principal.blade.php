<!DOCTYPE html>
<html>
<head>
    <title>Controle de Estoque</title>
    <link href="/css/app.css" rel="stylesheet">
    <link href="/css/custom.css" rel="stylesheet">
</head>

<body>

<header>
    <nav class="navbar navbar-default">
        <div class="container-fluid">

            <div class="navbar-header">
                <a class="navbar-brand" href="{{ action('ProdutoController@lista') }}">Estoque Laravel</a>
            </div>

            <ul class="nav navbar-nav navbar-right">
                <li><a href="{{ action('ProdutoController@novo')  }}">Novo Produto</a></li>
                <li><a href="{{ action('ProdutoController@lista') }}">Produtos</a></li>
                @if (Auth::guest())
                    <li><a href="/auth/login">Login</a></li>
                    <li><a href="/auth/register">Cadastre-se</a></li>
                @else
                    <li class="navbar-text" style="color: white">{{ Auth::user()->name }} </li>
                    <li><a href="/auth/logout">Logout</a></li>
                @endif
            </ul>

        </div>
    </nav>
</header>

<div class="container-fluid">
    @yield('conteudo')
</div>

</body>
</html>