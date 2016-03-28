package br.com.casadocodigo.loja.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.casadocodigo.loja.dao.ProdutoDAO;
import br.com.casadocodigo.loja.model.Produto;
import br.com.casadocodigo.loja.model.TipoPreco;

@Controller
@RequestMapping("/produtos")
public class ProdutosController {
	
	@Autowired
	private ProdutoDAO produtoDao;
	
	@RequestMapping("novo")
	public ModelAndView form(){
		ModelAndView mv = new ModelAndView("/produtos/form");
		mv.addObject("tipos", TipoPreco.values());
		return mv;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String gravar(Produto produto){
		produtoDao.gravar(produto);
		return "produtos/ok";
	}
}
