package br.com.casadocodigo.loja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/produtos")
public class ProdutosController {
	
	@RequestMapping("novo")
	public String form(){
		return "/produtos/form";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String gravar(String titulo, String descricao, int paginas){
		System.out.println(titulo);
		System.out.println(descricao);
		System.out.println(paginas);
		return "produtos/ok";
	}
}
