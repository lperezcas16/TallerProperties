package Model;

import java.io.Serializable;

public abstract class Amigo implements Serializable{
	private static final long serialVersionUID = 1L;
	String nombre, pais,correo;

	public Amigo(String nombre, String pais, String correo) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		this.correo = correo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	
	
	

}
