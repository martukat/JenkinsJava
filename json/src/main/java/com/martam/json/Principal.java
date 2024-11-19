/**
 * 
 */
package com.martam.json;

/**
 * 
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String json = "{\"nombre\" : \"Pedro\"}";
		LeerJsonPersona leer = new LeerJsonPersona();
		
		Persona p1 = leer.getPersona(json);
		
		System.out.println(p1.getNombre());

	}

}
