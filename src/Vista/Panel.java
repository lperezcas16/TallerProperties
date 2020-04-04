package Vista;

import java.awt.Color;

import javax.swing.*;


// PANEL DE AMIGOS CERCANOS 
public class Panel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JLabel etiqueta_nombre, etiqueta_pais, etiqueta_telefono, amigos_cercanos,etiqueta_correo;
	public JTextField campo_nombre, campo_pais, campo_telefono, campo_correo;
	public JButton boton_registrar;
	
	public Panel() {
		
		setLayout(null);
		setVisible(false);
		setBounds(5,5,320,305);
		setBackground(Color.white);
		
		inicializarComponentes();
	}
	
	public void inicializarComponentes(){
		
		amigos_cercanos= new JLabel("Amigos Cercanos");
//		etiqueta_correo = new JLabel("Correo");
		etiqueta_nombre = new JLabel("Nombre");
		etiqueta_pais =new JLabel("Pais");
		etiqueta_telefono = new JLabel("Teléfono");
		boton_registrar = new JButton("Registrar");
		
//		campo_correo = new JTextField();
		campo_nombre = new JTextField();
		campo_pais = new JTextField();
		campo_telefono = new JTextField();
		
		amigos_cercanos.setBounds(110,0,200,50);
//		etiqueta_correo.setBounds(10,45,80,50);
		etiqueta_nombre.setBounds(10,25,80,50);
		etiqueta_pais.setBounds(10,65,80,50);
		etiqueta_telefono.setBounds(10,105,80,50);
		
		boton_registrar.setBounds(115,165,90,20);
		
//		campo_correo.setBounds(80,65,200,20);
		campo_nombre.setBounds(80,40,200,20);
		campo_pais.setBounds(80,80,200,20);
		campo_telefono.setBounds(80,120,200,20);
		
		add(amigos_cercanos);
//		add(etiqueta_correo);
		add(etiqueta_nombre);
		add(etiqueta_pais);
		add(etiqueta_telefono);
		add(boton_registrar);
//		add(campo_correo);
		add(campo_nombre);
		add(campo_pais);
		add(campo_telefono);
		
		
	}

	public JLabel getEtiqueta_nombre() {
		return etiqueta_nombre;
	}

	public void setEtiqueta_nombre(JLabel etiqueta_nombre) {
		this.etiqueta_nombre = etiqueta_nombre;
	}

	public JLabel getEtiqueta_pais() {
		return etiqueta_pais;
	}

	public void setEtiqueta_pais(JLabel etiqueta_pais) {
		this.etiqueta_pais = etiqueta_pais;
	}

	public JLabel getEtiqueta_telefono() {
		return etiqueta_telefono;
	}

	public void setEtiqueta_telefono(JLabel etiqueta_telefono) {
		this.etiqueta_telefono = etiqueta_telefono;
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
