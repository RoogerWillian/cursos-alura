<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Livros de Java, Ruby , iPhone, Android e muito mais!</title>
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
		
		<c:forEach items="${tipos}" var="tipoPreco" varStatus="status">
			<div>
				<label>${tipoPreco}</label>
				<input type="text" name="precos[${status.index}].valor"/>
				<input type="hidden" name="precos[${status.index}].tipo" value="${tipoPreco}">
			</div>
		</c:forEach>
		
		<button type="submit">Cadastrar</button>
	</form>
</body>
</html>