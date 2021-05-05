package com.digitalinnovation.controller;

import com.digitalinnovation.dto.MessageResponseDTO;
import com.digitalinnovation.entity.Person;
import com.digitalinnovation.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController //significa que é um controlador e será acessado através de uma api rest
@RequestMapping("/api/v1/people") // o princial caminho de acesso da api
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    //toda requisição de página é acessado atrevés de uma oprç get
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody Person person){ //informa que esta vindo de uma requisicao do tipo pessoa
        return personService.createPerson(person);
    }
}