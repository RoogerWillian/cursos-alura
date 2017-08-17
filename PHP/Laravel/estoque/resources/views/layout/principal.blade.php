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
                <a class="navbar-brand" href="/produtos">Estoque Laravel</a>
            </div>

            <ul class="nav navbar-nav navbar-right">
                <li><a href="/produtos">Listagem</a></li>
            </ul>

        </div>
    </nav>
</header>

<div class="container-fluid">
    @yield('conteudo')
</div>

</body>
</html>