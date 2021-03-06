package com.marcelojr.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcelojr.cursomc.domain.Categoria;
import com.marcelojr.cursomc.repositories.CategoriaRepository;
import com.marcelojr.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
					"Objeto não econtrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
	
}
