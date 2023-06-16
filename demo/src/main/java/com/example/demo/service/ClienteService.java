package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Cliente;
import com.example.demo.repository.ClienteRepository;


@Service
public class ClienteService {
	private final ClienteRepository clienteRepository;
	
	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	public Cliente createCliente (Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public Cliente getClientebyId (Integer id) {
		return clienteRepository.findById(id).get();
	}
	
	public List<Cliente> findAll(){
		return clienteRepository.findAll();
	}
	
}
