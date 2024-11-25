package com.martam.webspring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personas")
public class PersonaRestController {
	
	@Autowired
	private PersonaRepository repositorio;

	/**
	 * @param persona
	 * @see com.martam.webspring.PersonaRepository#add(com.martam.webspring.Persona)
	 */
	public void add(Persona persona) {
		repositorio.add(persona);
	}

	/**
	 * @return
	 * @see com.martam.webspring.PersonaRepository#buscarTodos()
	 */
	@GetMapping
	public List<Persona> buscarTodos() {
		return repositorio.buscarTodos();
	}
	

}
