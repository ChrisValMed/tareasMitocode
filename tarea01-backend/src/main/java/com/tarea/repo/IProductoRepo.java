package com.tarea.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tarea.modelo.Producto;



public interface IProductoRepo  extends JpaRepository<Producto, Integer> {

}
