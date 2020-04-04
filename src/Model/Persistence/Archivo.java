package Model.Persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Properties;
import javax.swing.JFileChooser;
import Model.Amigo;
import Model.Cercano;
import Model.Trabajo;


public class Archivo {

	private Properties propiedades;
	private File f;
	private ArrayList<String> paises;
	private ArrayList<Cercano> amigos;
	private ArrayList<Trabajo> trabajo;
	private Archivo arch;
	private ObjectInputStream entrada;
	private ObjectOutput salida;
	private File archivo = new File("datos/agendaDigital.dat");

	public Archivo() {
		paises = new ArrayList<String>();
		amigos = new ArrayList<Cercano>();
		trabajo = new ArrayList<Trabajo>();
		arch = new Archivo();
		funcionar();
		if (archivo.exists()) {
			System.out.println("El archivo ya existe");
		} else {
			try {
				archivo.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
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

			arch.escribirArchivo(paises,amigos,trabajo);

		} catch (Exception e) {
			System.out.println("No se puede cargar el archivo de propiedades");
		}

	}

	public void escribirArchivo(ArrayList<String> paises,ArrayList<Cercano> amigos,ArrayList<Trabajo> trabajo) {
		try {
			salida = new ObjectOutputStream(new FileOutputStream(archivo));
			salida.writeObject(paises);
			salida.writeObject(amigos);
			salida.writeObject(trabajo);
			salida.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Amigo> leerArchivo() {
		ArrayList<Amigo> amigos = new ArrayList<Amigo>();
		if (archivo.length() != 0) {
			try {
				entrada = new ObjectInputStream(new FileInputStream(archivo));
				amigos = (ArrayList<Amigo>) entrada.readObject();

			} catch (FileNotFoundException e) {
				e.printStackTrace();

			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return amigos;

	}

	public ObjectInputStream getEntrada() {
		return entrada;
	}

	public void setEntrada(ObjectInputStream entrada) {
		this.entrada = entrada;
	}

	public ObjectOutput getSalida() {
		return salida;
	}

	public void setSalida(ObjectOutput salida) {
		this.salida = salida;
	}

	public File getArchivo() {
		return archivo;
	}

	public void setArchivo(File archivo) {
		this.archivo = archivo;
	}

}