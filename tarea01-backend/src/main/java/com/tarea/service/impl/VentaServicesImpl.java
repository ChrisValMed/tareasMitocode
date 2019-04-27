package com.tarea.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarea.modelo.Venta;
import com.tarea.repo.IVentaRepo;
import com.tarea.service.IVentaService;

@Service
public class VentaServicesImpl implements IVentaService{
	
	@Autowired
	private IVentaRepo repo;

	@Override
	public Venta registrar(Venta t) {
		// TODO Auto-generated method stub
		t.getDetalleVenta().forEach(det -> det.setVenta(t));
		return repo.save(t);
	}

	@Override
	public Venta modificar(Venta t) {
		// TODO Auto-generated method stub
		return repo.save(t);
	}

	@Override
	public Venta leer(Integer id) {
		// TODO Auto-generated method stub
		return repo.findOne(id);
	}

	@Override
	public List<Venta> listar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repo.delete(id);
	}

}
