<?php

Route::get('/', function () {
    return "<h1>Primeira Lógica com Laravel</h1>";
});

Route::get('/produtos', 'ProdutoController@lista');