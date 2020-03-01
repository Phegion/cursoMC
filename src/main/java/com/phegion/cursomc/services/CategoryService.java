package com.phegion.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phegion.cursomc.domain.Category;
import com.phegion.cursomc.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repo;

	public Category find(Integer id) {  //BUSCAR CATEGORIA PELO ID
		Optional<Category> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
