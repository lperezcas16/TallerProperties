package Model;

public class Cercano extends Amigo {
	
	String telefono;
	
	public Cercano(String nombre, String pais, String correo, String telefono) {
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
