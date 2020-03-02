package com.phegion.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phegion.cursomc.domain.Categoria;
import com.phegion.cursomc.repositories.CategoriaRepository;
import com.phegion.cursomc.services.exception.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;	

	public Categoria find(Integer id) {  //BUSCAR CATEGORIA PELO ID
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(   //EXCEPTION CASO O ID SEJA INEXISTENTE
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
}
