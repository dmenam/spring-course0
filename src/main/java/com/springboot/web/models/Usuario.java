package com.springboot.web.models;

/*Esta es una clase POJO (PLAIN OLD JAVA OBJECT)*/
public class Usuario {
	private String nombre;
	private String apellido;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
}