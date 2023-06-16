package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Cliente;
import com.example.demo.service.ClienteService;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
	private final ClienteService clienteService;

	public ClienteController(ClienteService clienteService) {
		super();
		this.clienteService = clienteService;
	}
	@PostMapping
	public Cliente createDepartament(@RequestBody Cliente cliente) {
		return clienteService.createCliente(cliente);
	}
	
	@GetMapping("/{id}")
	public Cliente getDepartamentbyId(@PathVariable Integer id) {
		return clienteService.getClientebyId(id);
	}
	
	@GetMapping
	public List<Cliente> findAll(){
		return clienteService.findAll();
	}
	
}
