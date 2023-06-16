package com.example.demo2.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "compra")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Compra {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer nrocompra;
	private Integer idcliente;
	private Integer codproducto;
	private Integer cantidad;
	private Integer total;
	public Integer getNrocompra() {
		return nrocompra;
	}
	public void setNrocompra(Integer nrocompra) {
		this.nrocompra = nrocompra;
	}
	public Integer getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(Integer idcliente) {
		this.idcliente = idcliente;
	}
	public Integer getCodproducto() {
		return codproducto;
	}
	public void setCodproducto(Integer codproducto) {
		this.codproducto = codproducto;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	
}
