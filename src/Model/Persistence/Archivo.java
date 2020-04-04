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

import Model.Amigo;
import Model.Cercano;
import Model.Trabajo;


public class Archivo {

	
	
	private ObjectInputStream entrada;
	private ObjectOutput salida;
	private File archivo = new File("datos/agendaDigital.dat");

	public Archivo() {
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
