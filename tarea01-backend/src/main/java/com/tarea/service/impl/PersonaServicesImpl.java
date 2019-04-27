package com.tarea.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarea.modelo.Persona;
import com.tarea.repo.IPersonaRepo;
import com.tarea.service.IPersonaService;

@Service
public class PersonaServicesImpl implements IPersonaService{
	
	@Autowired
	private IPersonaRepo repo;

	@Override
	public Persona registrar(Persona t) {
		// TODO Auto-generated method stub
		return repo.save(t);
	}

	@Override
	public Persona modificar(Persona t) {
		// TODO Auto-generated method stub
		return repo.save(t);
	}

	@Override
	public Persona leer(Integer id) {
		// TODO Auto-generated method stub
		return repo.findOne(id);
	}

	@Override
	public List<Persona> listar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repo.delete(id);
	}

}
