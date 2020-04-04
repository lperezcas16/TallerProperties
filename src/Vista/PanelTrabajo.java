package Vista;

import java.awt.Color;

import javax.swing.*;

//Panel contactos de trabajo
public class PanelTrabajo extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8148508487276781469L;
	public JLabel contactos_trabajo,etiqueta_nombre, etiqueta_empresa, etiqueta_pais, etiqueta_telefono_manager, etiqueta_correo;
	public JTextField campo_nombre, campo_empresa, campo_pais, campo_telefono, campo_correo;
	public JButton boton_registrar;
	
	
	public PanelTrabajo() {
		setLayout(null);
		setVisible(false);
		setBounds(5,5,320,305);
		setBackground(Color.white);
		
		inicializarComponentes();
		
	}

	public void inicializarComponentes() {
		
		contactos_trabajo = new JLabel ("Contactos Trabajo");
		etiqueta_correo = new JLabel("Correo");
		etiqueta_empresa= new JLabel("Empresa");
		etiqueta_nombre= new JLabel("Nombre");
		etiqueta_pais = new JLabel (" País");
		etiqueta_telefono_manager = new JLabel("Teléfono Manager");
		
		campo_nombre =  new JTextField();
		campo_empresa=   new JTextField();
		campo_pais =  new JTextField();
		campo_telefono =  new JTextField();
		campo_correo =  new JTextField();
		
		campo_nombre.setBounds(80,40,230,20);
		campo_empresa.setBounds(80,65,230,20);
		campo_pais.setBounds(80,90,230,20);
		campo_telefono.setBounds(120,120,190,20);
		campo_correo.setBounds(80,145,230,20);
		
		add(campo_nombre); 
		add(campo_empresa);
		add(campo_pais);
		add(campo_telefono);
		add(campo_correo);
		
		contactos_trabajo.setBounds(110,0,200,50);
		etiqueta_correo.setBounds(10,130,80,50);
		etiqueta_empresa.setBounds(10,48,80,50);
		etiqueta_nombre.setBounds(10,25,80,50);
		etiqueta_pais.setBounds(10,75,80,50);
		etiqueta_telefono_manager.setBounds(10,103,150,50);
		
		add(contactos_trabajo);
		add(etiqueta_correo);
		add(etiqueta_empresa);
		add(etiqueta_nombre);
		add(etiqueta_pais);
		add(etiqueta_telefono_manager);
		
		boton_registrar = new JButton("Registrar");
		boton_registrar.setBounds(115,173,90,20);
		add(boton_registrar);
	}

	public JLabel getContactos_trabajo() {
		return contactos_trabajo;
	}

	public void setContactos_trabajo(JLabel contactos_trabajo) {
		this.contactos_trabajo = contactos_trabajo;
	}

	public JLabel getEtiqueta_nombre() {
		return etiqueta_nombre;
	}

	public void setEtiqueta_nombre(JLabel etiqueta_nombre) {
		this.etiqueta_nombre = etiqueta_nombre;
	}

	public JLabel getEtiqueta_empresa() {
		return etiqueta_empresa;
	}

	public void setEtiqueta_empresa(JLabel etiqueta_empresa) {
		this.etiqueta_empresa = etiqueta_empresa;
	}

	public JLabel getEtiqueta_pais() {
		return etiqueta_pais;
	}

	public void setEtiqueta_pais(JLabel etiqueta_pais) {
		this.etiqueta_pais = etiqueta_pais;
	}

	public JLabel getEtiqueta_telefono_manager() {
		return etiqueta_telefono_manager;
	}

	public void setEtiqueta_telefono_manager(JLabel etiqueta_telefono_manager) {
		this.etiqueta_telefono_manager = etiqueta_telefono_manager;
	}

	public JLabel getEtiqueta_correo() {
		return etiqueta_correo;
	}

	public void setEtiqueta_correo(JLabel etiqueta_correo) {
		this.etiqueta_correo = etiqueta_correo;
	}

	public JTextField getCampo_nombre() {
		return campo_nombre;
	}

	public void setCampo_nombre(JTextField campo_nombre) {
		this.campo_nombre = campo_nombre;
	}

	public JTextField getCampo_empresa() {
		return campo_empresa;
	}

	public void setCampo_empresa(JTextField campo_empresa) {
		this.campo_empresa = campo_empresa;
	}

	public JTextField getCampo_pais() {
		return campo_pais;
	}

	public void setCampo_pais(JTextField campo_pais) {
		this.campo_pais = campo_pais;
	}

	public JTextField getCampo_telefono() {
		return campo_telefono;
	}

	public void setCampo_telefono(JTextField campo_telefono) {
		this.campo_telefono = campo_telefono;
	}

	public JTextField getCampo_correo() {
		return campo_correo;
	}

	public void setCampo_correo(JTextField campo_correo) {
		this.campo_correo = campo_correo;
	}

	public JButton getBoton_registrar() {
		return boton_registrar;
	}

	public void setBoton_registrar(JButton boton_registrar) {
		this.boton_registrar = boton_registrar;
	}
	
	
	
	
	
	
	
}
