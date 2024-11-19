/**
 * 
 */
package com.martam.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Clase que lee un Json con las propiedades de una persona.
 */
public class LeerJsonPersona {

	/**
	 * Lee texto en JSON y lo convierte en un objeto de tipo Persona.
	 * 
	 * @param json
	 * @return
	 */
	public Persona getPersona(String json) {

		ObjectMapper mapper = new ObjectMapper();
		JsonNode nodo = null;

		try {
			nodo = mapper.readTree(json);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return new Persona(nodo.get("nombre").asText());
	}

}
