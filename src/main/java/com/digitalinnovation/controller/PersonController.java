package com.digitalinnovation.controller;

import com.digitalinnovation.dto.request.PersonDTO;
import com.digitalinnovation.dto.response.MessageResponseDTO;
import com.digitalinnovation.exception.PersonNotFoundException;
import com.digitalinnovation.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


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
    public MessageResponseDTO createPerson(@RequestBody @Valid PersonDTO personDTO){ //informa que esta vindo de uma requisicao do tipo pessoa
        return personService.createPerson(personDTO);
    }

    @GetMapping
    public List<PersonDTO> listAll(){
         return personService.listALl();
    }

    @GetMapping("/{id}")
    public PersonDTO findById(@PathVariable Long id) throws PersonNotFoundException {
        return personService.findById(id);
    }
}
