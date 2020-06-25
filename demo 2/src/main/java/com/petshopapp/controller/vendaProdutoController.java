package com.petshopapp.controller;

import com.petshopapp.models.VendaProduto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.petshopapp.Repository.VendaProdutoRepository;

@Controller
public class vendaProdutoController {

    @Autowired
    private VendaProdutoRepository lr;

    //metodo que retorna o formulario do cliente
    @RequestMapping(value = "cadastrarVendas", method = RequestMethod.GET)
    public String form() {
        return "formVendaProd";
    }

    @RequestMapping(value = "cadastrarVendas", method = RequestMethod.POST)
    public String form(VendaProduto vendas) {

        lr.save(vendas);

        return "redirect:/cadastrarVendas";
    }

    @RequestMapping("/listaVendas")
    public ModelAndView listaVendas() {
        ModelAndView mv = new ModelAndView("listaVendas");
        Iterable<VendaProduto> vendas = lr.findAll();
        mv.addObject("vendas", vendas);
        return mv;
    }

}