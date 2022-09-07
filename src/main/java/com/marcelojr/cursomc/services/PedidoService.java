package com.marcelojr.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcelojr.cursomc.domain.Pedido;
import com.marcelojr.cursomc.repositories.PedidoRepository;
import com.marcelojr.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;
	
	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
					"Objeto não econtrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}
	
}
