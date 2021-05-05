package com.digitalinnovation.entity;

import com.digitalinnovation.enums.PhoneType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data //insere geters e seters automaticamente não precisando criar e acabar poluindo a classe
@Builder //cria um padrão de projetos para a construção de objetos
//insere os construtores:
@AllArgsConstructor
@NoArgsConstructor
public class phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false) //not null
    private PhoneType type;

    @Column(nullable = false)
    private String number;
}
