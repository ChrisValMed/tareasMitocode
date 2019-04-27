package com.tarea.modelo;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

@Entity
@Table(name = "venta")
public class Venta {
	//prueba
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idVenta;
	
	@JsonSerialize(using = ToStringSerializer.class)//ISODate 2019-04-22T05:00:00
	private LocalDateTime fecha;
	
	@Column(name = "importe", nullable = true)
	private double importe;
	
	@ManyToOne
	@JoinColumn(name = "id_Persona", nullable = false, foreignKey = @ForeignKey(name = "Fk_venta_persona"))
	private Persona per;
	
	@OneToMany(mappedBy = "venta", cascade = 
		{CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REMOVE}, 
		fetch = FetchType.LAZY, orphanRemoval = true)
	private List<DetalleVenta> detalleVenta;

	public int getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public Persona getPer() {
		return per;
	}

	public void setPer(Persona per) {
		this.per = per;
	}

	public List<DetalleVenta> getDetalleVenta() {
		return detalleVenta;
	}

	public void setDetalleVenta(List<DetalleVenta> detalleVenta) {
		this.detalleVenta = detalleVenta;
	}
	
	

}
