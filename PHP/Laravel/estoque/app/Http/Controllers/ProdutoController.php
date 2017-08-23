<?php namespace estoque\Http\Controllers;

use estoque\Categoria;
use estoque\Http\Requests\ProdutosRequest;
use Request;
use estoque\Produto;

class ProdutoController extends Controller
{

    function __construct()
    {
        $this->middleware('auth');
    }

    public function lista()
    {
        $produtos = Produto::all();
        return view('produto.listagem')->with('produtos', $produtos);
    }

    public function mostra()
    {
        $id = Request::route('id');
        $produto = Produto::find($id);
        return view('produto.detalhes')->with('p', $produto);
    }

    public function novo()
    {
        return view('produto.formulario')->with('categorias', Categoria::all());
    }

    public function adiciona(ProdutosRequest $request)
    {
        Produto::create($request->all());
        return redirect()->action('ProdutoController@lista')->withInput(Request::only('nome'));
    }

    public function listaJson()
    {
        $produtos = Produto::all();
        return response()->json($produtos);
    }

    public function remove($id)
    {
        $produto = Produto::find($id);
        $produto->delete();

        return redirect()->action('ProdutoController@lista');
    }
}