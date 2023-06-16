package com.example.demo1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo1.entity.Producto;
import com.example.demo1.repository.ProductoRepository;


@Service
public class ProductoService {
	private final ProductoRepository productoRepository;
	
	public ProductoService(ProductoRepository productoRepository) {
		this.productoRepository = productoRepository;
	}
	
	public Producto createProducto (Producto producto) {
		return productoRepository.save(producto);
	}
	
	public Producto getProductobyId (Integer id) {
		return productoRepository.findById(id).get();
	}
	
	public List<Producto> findAll(){
		return productoRepository.findAll();
	}
}
