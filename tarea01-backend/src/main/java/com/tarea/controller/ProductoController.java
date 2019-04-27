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

import com.tarea.modelo.Producto;
import com.tarea.service.IProductoService;

@RestController
@RequestMapping("/productos")
public class ProductoController {
	
	@Autowired
	private IProductoService prodserv;
	
	@GetMapping("/{id}")
	//@RequestMapping("/{id}")
	public Producto listarPorId(@PathVariable("id") Integer idProducto) {
		
		return prodserv.leer(idProducto);
	}
	
	@GetMapping
	public List<Producto> listar() {
		
		return prodserv.listar();
	}
	
	@PostMapping
	public Producto registrar(@RequestBody Producto prod) {
		return prodserv.registrar(prod);
	}
	
	@PutMapping
	public Producto modificar(@RequestBody Producto prod) {
		return prodserv.modificar(prod);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer idProducto) {
		prodserv.eliminar(idProducto);
	}

}
