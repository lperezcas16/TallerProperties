package Model.Persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import javax.swing.JFileChooser;


import Model.Cercano;
import Model.Trabajo;


public class AmigoDAO {
	private Archivo archiv = new Archivo();
	private Properties propiedades;
	private File f;
	private ArrayList<Cercano> amigos;
	private ArrayList<String> paises;
	private ArrayList<Trabajo> trabajo;

	public AmigoDAO() {
		paises = new ArrayList<>();
		amigos = new ArrayList<Cercano>();
		trabajo = new ArrayList<Trabajo>();
		funcionar();

	}

	public void funcionar() {
		try {

			JFileChooser fc = new JFileChooser(System.getProperty("user.dir"));
			fc.showOpenDialog(fc);
			f = fc.getSelectedFile();
			FileInputStream archivo = new FileInputStream(f);
			propiedades = new Properties();
			propiedades.load(archivo);
			archivo.close();

			int cantidad_paises = Integer.parseInt(propiedades.getProperty("agenda.paises"));
			System.out.println(cantidad_paises);
			for (int i = 1; i <= cantidad_paises; i++) {
				paises.add(propiedades.getProperty("agenda.pais" + i));
			}
			for (int i = 0; i < paises.size(); i++) {
				System.out.println(paises.get(i));
			}

			int cantidad_amigos = Integer.parseInt(propiedades.getProperty("amigo.cantidad"));
			System.out.println(cantidad_amigos);
			for (int i = 1; i <= cantidad_amigos; i++) {
				String n = propiedades.getProperty("amigo.nombre" + i);
				String p = propiedades.getProperty("amigo.pais" + i);
				String t = propiedades.getProperty("amigo.telefono" + i);
				String c = propiedades.getProperty("amigo.correo" + i);
				Cercano aux = new Cercano(n, p, t, c);
				amigos.add(aux);
			}
			for (int i = 0; i < amigos.size(); i++) {
				System.out.println(amigos.get(i));
			}

			int cantidad_trabajo = Integer.parseInt(propiedades.getProperty("contacto.cantidad"));
			System.out.println(cantidad_trabajo);
			for (int i = 1; i <= cantidad_trabajo; i++) {
				String n = propiedades.getProperty("contacto.nombre" + i);
				String e = propiedades.getProperty("contacto.empresa" + i);
				String p = propiedades.getProperty("contacto.pais" + i);
				String t = propiedades.getProperty("contacto.telefonoManager" + i);
				String c = propiedades.getProperty("contacto.correo" + i);
				Trabajo aux = new Trabajo(n, e, p, t, c);
				trabajo.add(aux);
			}
			for (int i = 0; i < trabajo.size(); i++) {
				System.out.println(trabajo.get(i));
			}

			archiv.escribirArchivo(paises, amigos, trabajo);

		} catch (Exception e) {
			System.out.println("No se puede cargar el archivo de propiedades");
			e.printStackTrace();
		}

	}

	public Cercano buscarContactoCercano(String correo, ArrayList<Cercano> cercano) {
		Cercano encontrado = null;
		if (!cercano.isEmpty()) {
			for (int i = 0; i < cercano.size(); i++) {
				if (cercano.get(i).getCorreo().equals(correo)) {
					encontrado = cercano.get(i);
				}
			}
		}

		return encontrado;
	}
	public Trabajo buscarContactoTrabajo(String correo, ArrayList<Trabajo> trabajo) {
		Trabajo encontrado = null;
		if (!trabajo.isEmpty()) {
			for (int i = 0; i < trabajo.size(); i++) {
				if (trabajo.get(i).getCorreo().equals(correo)) {
					encontrado = trabajo.get(i);
				}
			}
		}

		return encontrado;
	}

	

	public boolean agregarContactoCercano(String nombre, String pais, String telefono, String correo,
			ArrayList<Cercano> cercano) {
		
		Cercano aux = new Cercano(nombre, pais, telefono,correo);

		if (buscarContactoCercano(correo, cercano) == null) {
			cercano.add(aux);
			archiv.escribirArchivoCercano(cercano);
			return true;
		} else {
			return false;
		}

	}
	public boolean agregarContactoTrabajo(String nombre, String empresa,String pais, String telefono, String correo,
			ArrayList<Trabajo> trabajo) {

		Trabajo aux = new Trabajo(nombre,empresa, pais, telefono,correo);

		if (buscarContactoTrabajo(correo, trabajo) == null) {
			trabajo.add(aux);
			archiv.escribirArchivoTrabajo(trabajo);
			return true;
		} else {
			return false;
		}

	}
	
	public boolean eliminarContactoCercano(String correo, ArrayList<Cercano> cercano) {
		try {
			Cercano e = buscarContactoCercano(correo, cercano);
			cercano.remove(e);
			archiv.getArchivo().delete();
			archiv.getArchivo().createNewFile();
			archiv.escribirArchivoCercano(cercano);
			return true;
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return false;
		}

	}
	
	public boolean eliminarContactoTrabajo(String correo, ArrayList<Trabajo> trabajo) {
		try {
			Trabajo e = buscarContactoTrabajo(correo, trabajo);
			trabajo.remove(e);
			archiv.getArchivo().delete();
			archiv.getArchivo().createNewFile();
			archiv.escribirArchivoTrabajo(trabajo);
			return true;
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return false;
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	

	public Properties getPropiedades() {
		return propiedades;
	}

	public void setPropiedades(Properties propiedades) {
		this.propiedades = propiedades;
	}

	public File getF() {
		return f;
	}

	public void setF(File f) {
		this.f = f;
	}

	public ArrayList<String> getPaises() {
		return paises;
	}

	public void setPaises(ArrayList<String> paises) {
		this.paises = paises;
	}

	public ArrayList<Cercano> getAmigos() {
		return amigos;
	}

	public void setAmigos(ArrayList<Cercano> amigos) {
		this.amigos = amigos;
	}

	public ArrayList<Trabajo> getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(ArrayList<Trabajo> trabajo) {
		this.trabajo = trabajo;
	}

}
