package com.digitalinnovation.personapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController //significa que é um controlador e será acessado através de uma api rest
@RequestMapping("/api/v1/people") // o princial caminho de acesso da api
public class homeController {

    //toda requisição de página é acessado atrevés de uma oprç get
    @GetMapping()
    public String getBook(){
        return "API test!";
    }
}
