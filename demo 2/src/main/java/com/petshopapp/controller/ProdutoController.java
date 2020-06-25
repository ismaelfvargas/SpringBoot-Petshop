package com.petshopapp.controller;

import com.petshopapp.Repository.ProdutoRepository;
import com.petshopapp.models.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProdutoController {

    @Autowired
    private ProdutoRepository cr;

    //metodo que retorna o formulario do cliente
    @RequestMapping(value = "/cadastrarProduto", method=RequestMethod.GET)
    public String form(){
        return "formProduto";
    }


    //metodo que retorna a requisição para o banco de dados (direciona p/ o banco de dados)
    @RequestMapping(value = "/cadastrarProduto", method=RequestMethod.POST)
    public String form(Produto produto) {

        cr.save(produto);

        return "redirect:/cadastrarProduto";
    }

}
