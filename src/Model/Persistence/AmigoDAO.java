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
	private ArrayList<String> paises;
	private ArrayList<Cercano> amigos;
	private ArrayList<Trabajo> trabajo;
	
public AmigoDAO(){
	
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
		for (int i = 1; i <= cantidad_amigos; i++) {
			String n = propiedades.getProperty("amigo.nombre" + i);
			String p = propiedades.getProperty("amigo.pais" + i);
			String t = propiedades.getProperty("amigo.telefono" + i);
			String c = propiedades.getProperty("amigos.correo" + i);
			Cercano aux = new Cercano(n, p, t, c);
			amigos.add(aux);
		}
		
		int cantidad_trabajo = Integer.parseInt(propiedades.getProperty("contacto.cantidad"));
		for (int i = 1; i <= cantidad_trabajo; i++) {
			String n = propiedades.getProperty("contacto.nombre" + i);
			String e = propiedades.getProperty("contacto.empresa" + i);
			String p = propiedades.getProperty("contacto.pais" + i);
			String t = propiedades.getProperty("contacto.telefonoManager" + i);
			String c = propiedades.getProperty("contacto.correo" + i);
			Trabajo aux = new Trabajo(n,e, p, t, c);
			trabajo.add(aux);
		}

		archiv.escribirArchivo(paises,amigos,trabajo);

	} catch (Exception e) {
		System.out.println("No se puede cargar el archivo de propiedades");
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
