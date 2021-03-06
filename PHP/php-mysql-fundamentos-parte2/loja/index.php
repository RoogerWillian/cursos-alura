<?php include("cabecalho.php"); ?>
<?php include("logica-usuario.php"); ?>

<?php if (isset($_SESSION['danger'])) { ?>
    <p class="alert alert-danger"><?= $_SESSION['danger'] ?></p>
    <?php
    unset($_SESSION['danger']);
} ?>

<?php if (isset($_SESSION['success'])) { ?>
    <p class="alert alert-success"><?= $_SESSION['success'] ?></p>
    <?php
    unset($_SESSION['success']);
} ?>

<h2>Bem vindo</h2>

<?php if (usuarioEstaLogado()) { ?>
    <p class="text-success">Você está logado como <?= usuarioLogado() ?> <a href="logout.php">Deslogar</a></p>
<?php } else { ?>

    <h2>Login</h2>

    <form action="login.php" method="post">
        <table class="table">
            <tr>
                <td>E-mail</td>
                <td><input type="email" name="email" class="form-control" autofocus></td>
            </tr>

            <tr>
                <td>Senha</td>
                <td><input type="password" name="senha" class="form-control"></td>
            </tr>

            <tr>
                <td>
                    <button type="submit" class="btn btn-primary">Login</button>
                </td>
            </tr>
        </table>
    </form>
<?php } ?>
<?php include("rodape.php"); ?>			
