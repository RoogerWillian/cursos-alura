<!DOCTYPE html>
<html>
<head>
    <title>Controle de estoque</title>
    <link rel="stylesheet" href="/css/app.css">
</head>

<body>
<h1>Listagem de produtos</h1>

<table class="table">

    <?php foreach ($produtos as $p): ?>
        <tr>
            <td> <?= $p->nome ?> </td>
            <td> <?= $p->valor ?> </td>
            <td> <?= $p->descricao ?> </td>
            <td> <?= $p->quantidade ?> </td>
        </tr>

    <?php endforeach; ?>

</table>
</body>
</html>