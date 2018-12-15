package com.pdonatilio.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pdonatilio.cursomc.domain.Categoria;
import com.pdonatilio.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Categoria obj = repo.findOne(id);
		return obj;
	}

}