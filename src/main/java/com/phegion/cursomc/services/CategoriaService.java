package com.phegion.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phegion.cursomc.domain.Categoria;
import com.phegion.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;

	public Categoria find(Integer id) {  //BUSCAR CATEGORIA PELO ID
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
