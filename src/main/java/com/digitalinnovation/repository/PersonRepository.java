package com.digitalinnovation.repository;

import com.digitalinnovation.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

//ao extender essa interface os comandos basicos de banco de dados não precisaram ser criados
public interface PersonRepository extends JpaRepository<Person, Long> {
}
