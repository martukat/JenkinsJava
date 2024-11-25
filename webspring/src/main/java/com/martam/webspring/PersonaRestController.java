package com.martam.webspring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.martam.webspring.dtos.PersonaDto;
import com.martam.webspring.mapper.PersonaMapper;

@RestController
@RequestMapping("/personas")
public class PersonaRestController {

	@Autowired
	private PersonaRepository repositorio;

	/**
	 * @param persona
	 * @see com.martam.webspring.PersonaRepository#add(com.martam.webspring.models.Persona)
	 */
	public void add(PersonaDto personaDto) {
		repositorio.add(PersonaMapper.toBusinessObject(personaDto));
	}

	/**
	 * @return
	 * @see com.martam.webspring.PersonaRepository#buscarTodos()
	 */
	@GetMapping
	public List<PersonaDto> buscarTodos() {
		return repositorio.buscarTodos().stream().map((p) -> new PersonaDto(p.getNombre())).toList();
	}

}
