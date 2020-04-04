package Model;

import java.io.Serializable;

public class Cercano extends Amigo implements Serializable{
	private static final long serialVersionUID = 1L;
	
	String telefono;
	
	public Cercano(String nombre, String pais,  String telefono,String correo) {
		super(nombre, pais, correo);
	this.telefono = telefono;
	}
	
	

	@Override
	public String toString() {
		return "Amigos cercanos  Nombre: "  + getNombre() +" Pais: "+  getPais() + " Telefono: "  
									+ getTelefono() + " Correo: " + getCorreo() ;
	}



	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	

	
}
