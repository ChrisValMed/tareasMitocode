package com.tarea.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarea.modelo.Producto;
import com.tarea.repo.IProductoRepo;
import com.tarea.service.IProductoService;

@Service
public class ProductoServicesImpl implements IProductoService{
	
	@Autowired
	private IProductoRepo repo;

	@Override
	public Producto registrar(Producto t) {
		// TODO Auto-generated method stub
		return repo.save(t);
	}

	@Override
	public Producto modificar(Producto t) {
		// TODO Auto-generated method stub
		return repo.save(t);
	}

	@Override
	public Producto leer(Integer id) {
		// TODO Auto-generated method stub
		return repo.findOne(id);
	}

	@Override
	public List<Producto> listar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repo.delete(id);
	}

}
