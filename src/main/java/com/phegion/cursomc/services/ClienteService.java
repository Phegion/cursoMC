package com.phegion.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phegion.cursomc.domain.Cliente;
import com.phegion.cursomc.repositories.ClienteRepository;
import com.phegion.cursomc.services.exception.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;	

	public Cliente find(Integer id) {  //BUSCAR CLIENTE PELO ID
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(   //EXCEPTION CASO O ID SEJA INEXISTENTE
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}
}
