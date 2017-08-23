@extends('layout.principal')

@section('conteudo')

    @if(count($errors) > 0)
        <div class="alert alert-danger">
            <ul>
                @foreach($errors->all() as $error)
                    <li>{{ $error }}</li>
                @endforeach
            </ul>
        </div>
    @endif

    <form action="/produtos/adiciona" method="post">

        <input type="hidden" name="_token" value="{{ csrf_token()  }}">

        <div class="form-group">
            <label for="nome" class="control-label">Nome</label>
            <input type="text" id="nome" class="form-control" autofocus name="nome"
                   value="{{ old('nome') }}">
        </div>

        <div class="form-group">
            <label for="valor" class="control-label">Valor</label>
            <input type="text" id="valor" class="form-control" name="valor"
                   value="{{ old('valor') }}">
        </div>

        <div class="form-group">
            <label for="quantidade" class="control-label">Quantidade</label>
            <input type="text" id="quantidade" class="form-control" name="quantidade"
                   value="{{ old('quantidade') }}">
        </div>

        <div class="form-group">
            <label for="descricao" class="control-label">Descrição</label>
            <input id="descricao" class="form-control" name="descricao" value="{{ old('descricao') }}"/>
        </div>

        <div class="form-group">
            <label for="tamanho" class="control-label">Tamanho</label>
            <input type="text" id="tamanho" class="form-control" name="tamanho" value="{{ old('tamanho') }}">
        </div>

        <div class="form-group">
            <label for="categoria_id" class="control-label">Categoria</label>
            <select type="text" id="categoria_id" class="form-control" name="categoria_id">
                @foreach($categorias as $c)
                    <option value="{{$c->id}}">{{$c->nome}}</option>
                @endforeach
            </select>
        </div>

        <button class="btn btn-primary" type="submit">
            <span>Adicionar</span>
        </button>
    </form>
@stop