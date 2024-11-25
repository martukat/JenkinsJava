package com.martam.webspring.mapper;

import com.martam.webspring.dto.PersonaDto;
import com.martam.webspring.models.Persona;

public class PersonaMapper {
	
	public static PersonaDto toDto(Persona persona) {
		return new PersonaDto(persona.getNombre());
	}
	
	public static Persona toBusinessObject(PersonaDto personaDto) {
		return new Persona(personaDto.getNombre());
	}
}
