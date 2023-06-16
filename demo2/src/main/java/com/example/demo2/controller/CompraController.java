package com.example.demo2.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo2.entity.Compra;
import com.example.demo2.service.CompraService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/compras")
@AllArgsConstructor
public class CompraController {
	private final CompraService compraService;

	public CompraController(CompraService compraService) {
		super();
		this.compraService = compraService;
	}
	@PostMapping
	public Compra createCompra(@RequestBody Compra compra) {
		return compraService.createCompra(compra);
	}
	
	@GetMapping("/{id}")
	public Compra getComprabyId(@PathVariable Integer id) {
		return compraService.getComprabyId(id);
	}
	
	@GetMapping
	public List<Compra> findAll(){
		return compraService.findAll();
	}
}
