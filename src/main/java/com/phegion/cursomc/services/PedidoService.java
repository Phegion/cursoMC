package com.phegion.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phegion.cursomc.domain.Pedido;
import com.phegion.cursomc.repositories.PedidoRepository;
import com.phegion.cursomc.services.exception.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;	

	public Pedido find(Integer id) {  //BUSCAR PEDIDO PELO ID
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(   //EXCEPTION CASO O ID SEJA INEXISTENTE
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}
}
