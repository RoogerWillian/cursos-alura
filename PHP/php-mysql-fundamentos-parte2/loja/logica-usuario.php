<?php
session_start();

function verifica_usuario()
{
    if (!usuarioEstaLogado()) {
        header("Location: index.php");
        $_SESSION['danger'] = "Por favor, efetue seu login";
        die();
    }
}

function usuarioEstaLogado()
{
    return isset($_SESSION["usuario_logado"]);
}

function usuarioLogado()
{
    return $_SESSION["usuario_logado"];
}

function logaUsuario($email)
{
    $_SESSION["usuario_logado"] = $email;
}

function logout()
{
    session_destroy();
    session_start();
}