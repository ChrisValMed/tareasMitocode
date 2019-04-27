package com.tarea.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tarea.modelo.Venta;



public interface IVentaRepo  extends JpaRepository<Venta, Integer> {

}
