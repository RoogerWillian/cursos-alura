<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Novo Produto</title>
</head>
<body>
	<form action="/casadocodigo/produtos" method="post">
		<div>
			<label for="titulo">Título</label>
			<input id="titulo" type="text" name="titulo">
		</div>
		
		<div>
			<label for="descricao">Descricao</label>
			<textarea id="descricao" name="descricao" cols="20" rows="10"></textarea>
		</div>
		
		<div>
			<label for="paginas">Paginas</label>
			<input type="text" name="paginas" id="paginas">
		</div>
		
		<button type="submit">Cadastrar</button>
	</form>
</body>
</html>