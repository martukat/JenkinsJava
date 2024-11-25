package com.martam.webspring.dto;

public class PersonaDto {

	private String nombre;

	/**
	 * @param nombre
	 */
	public PersonaDto(String nombre) {
		super();
		this.nombre = nombre;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
