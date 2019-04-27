package com.tarea.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tarea.modelo.Persona;
import com.tarea.service.IPersonaService;

@RestController
@RequestMapping("/personas")
public class PersonaController {
	
	@Autowired
	private IPersonaService service;
	
	@GetMapping("/{id}")
	@RequestMapping("/{id}")
	public Persona listarPorId(@PathVariable("id") Integer idPersona) {
		
		return service.leer(idPersona);
	}
	
	@GetMapping
	public List<Persona> listar() {
		
		return service.listar();
	}
	
	@PostMapping
	public Persona registrar(@RequestBody Persona per) {
		return service.registrar(per);
	}
	
	@PutMapping
	public Persona modificar(@RequestBody Persona per) {
		return service.modificar(per);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer idPersona) {
		service.eliminar(idPersona);
	}

}
