package com.tarea.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tarea.modelo.Venta;
import com.tarea.service.IVentaService;

@RestController
@RequestMapping("/ventas")
public class VentaController {
	
	@Autowired
	private IVentaService service;
			
	@GetMapping
	public List<Venta> listar() {
		
		return service.listar();
	}
	
	@PostMapping
	public Venta registrar(@RequestBody Venta per) {
		return service.registrar(per);
	}
	
}
