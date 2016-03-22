package br.com.casadocodigo.loja.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.casadocodigo.loja.dao.ProdutoDAO;
import br.com.casadocodigo.loja.model.Produto;

@Controller
@RequestMapping("/produtos")
public class ProdutosController {
	
	@Autowired
	private ProdutoDAO produtoDao;
	
	@RequestMapping("novo")
	public String form(){
		return "/produtos/form";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String gravar(Produto produto){
		produtoDao.gravar(produto);
		return "produtos/ok";
	}
}
