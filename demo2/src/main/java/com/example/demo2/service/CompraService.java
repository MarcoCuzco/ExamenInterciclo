package com.example.demo2.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo2.entity.Compra;
import com.example.demo2.repository.CompraRepository;
import com.example.demo2.dto.*;
import com.example.demo2.*;

@Service
public class CompraService {
	private final CompraRepository compraRepository;
	private final RestTemplate restTemplate = new RestTemplate();
	
	public CompraService(CompraRepository compraRepository) {
		this.compraRepository = compraRepository;
	}
	
	public Compra createCompra(Compra producto) {
		return compraRepository.save(producto);
	}
	
	public Compra getComprabyId (Integer id) {
		return compraRepository.findById(id).get();
	}
	
	public List<Compra> findAll(){
		return compraRepository.findAll();
	}
	public ResponseDTO getHorarioById(Integer id) {
		ResponseDTO responseDTO = new ResponseDTO();
		Compra compra = new Compra();
		compra = compraRepository.findById(id).get();
		
		ResponseEntity<ClienteDTO> responseEntity = restTemplate.getForEntity("http://localhost:8081/api/cliente" + compra.getCodproducto(),
				ClienteDTO.class);
		ResponseEntity<ProductoDTO> responseEntity1 = restTemplate.getForEntity("http://localhost:8082/api/producto" + compra.getIdcliente(),
				ProductoDTO.class);
		
		ClienteDTO clienteDTO = responseEntity.getBody();
		ProductoDTO productoDTO = responseEntity1.getBody();
		responseDTO.setCompra(compra);
		responseDTO.setClienteDTO(clienteDTO);;
		responseDTO.setProductoDTO(productoDTO);
		
		return responseDTO;
	}
}
