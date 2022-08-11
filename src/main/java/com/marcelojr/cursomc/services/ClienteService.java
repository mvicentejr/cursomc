package com.marcelojr.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcelojr.cursomc.domain.Cliente;
import com.marcelojr.cursomc.repositories.ClienteRepository;
import com.marcelojr.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
					"Objeto não econtrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}
	
}
