package com.tarea.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tarea.modelo.Persona;



public interface IPersonaRepo  extends JpaRepository<Persona, Integer> {

}
