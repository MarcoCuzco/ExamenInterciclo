package com.example.demo1.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.entity.Producto;
import com.example.demo1.service.ProductoService;

@RestController
@RequestMapping("/api/producto")
public class ProductoController {
	private final ProductoService productoService;

	public ProductoController(ProductoService productoService) {
		super();
		this.productoService = productoService;
	}
	@PostMapping
	public Producto createProducto(@RequestBody Producto producto) {
		return productoService.createProducto(producto);
	}
	
	@GetMapping("/{id}")
	public Producto getProductobyId(@PathVariable Integer id) {
		return productoService.getProductobyId(id);
	}
	
	@GetMapping
	public List<Producto> findAll(){
		return productoService.findAll();
	}
}
