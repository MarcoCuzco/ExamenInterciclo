package com.example.demo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo1.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
