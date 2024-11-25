package com.martam.webspring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.martam.webspring.models.Persona;

@Service
public class PersonaService {
	
	@Autowired
	private PersonaRepository repositorio;

	/**
	 * @param persona
	 * @see com.martam.webspring.PersonaRepository#add(com.martam.webspring.models.Persona)
	 */
	public void add(Persona persona) {
		repositorio.add(persona);
	}

	/**
	 * @return
	 * @see com.martam.webspring.PersonaRepository#buscarTodos()
	 */
	public List<Persona> buscarTodos() {
		return repositorio.buscarTodos();
	}
	


}
