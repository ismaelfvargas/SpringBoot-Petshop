package com.petshopapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// O @Controller serve p/ dizer a app o que exibir
@Controller
public class indexController {

    // @Request diz que quando for requisitada a url /index, será executado o método index() da classe indexController.
    @RequestMapping("/")
    public String index(){
       return "index";
    }
}
