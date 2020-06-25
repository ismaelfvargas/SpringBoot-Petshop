package com.petshopapp.controller;

import com.petshopapp.models.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.petshopapp.Repository.ClienteRepository;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class clienteController {

    //@Autowired - Injeção de dependencia (da interface ClienteRepository)
    @Autowired
    private ClienteRepository cr;

    //metodo que retorna o formulario do cliente
    @RequestMapping(value = "/cadastrarCliente", method=RequestMethod.GET)
    public String form() {
        return "formCliente";
    }

    //metodo que retorna a requisição para o banco de dados (direciona p/ o banco de dados)
    @RequestMapping(value = "/cadastrarCliente", method=RequestMethod.POST)
    public String form(Cliente cliente) {

        cr.save(cliente);

        return "redirect:/cadastrarCliente";
    }

    @RequestMapping("/clientes")
    public ModelAndView listaClientes(){
        ModelAndView mv = new ModelAndView("listaCli");
        Iterable<Cliente> clientes = cr.findAll();
        mv.addObject("clientes", clientes);
        return mv;
    }
}