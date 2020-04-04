package Model;

import java.io.Serializable;

public class Trabajo extends Amigo implements Serializable {
	private static final long serialVersionUID = 1L;

	String empresa, telefono_manager;
	
	@Override
	public String toString() {
		return "Compa�ero de Trabajo Nombre " + getNombre() + " Empresa " + getEmpresa() + " Pais " + getPais()
					+ " Telefono de Manager " +  getTelefono_manager() + " Correo " + getCorreo();
	}


	public Trabajo(String nombre,String empresa, String pais, String telefono_manager,String correo
						 ) {
		super(nombre, pais, correo);
	this.empresa = empresa;
	this.telefono_manager = telefono_manager;
	}

	
	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getTelefono_manager() {
		return telefono_manager;
	}

	public void setTelefono_manager(String telefono_manager) {
		this.telefono_manager = telefono_manager;
	}

	
	

}
