package Vista;

import java.awt.Color;

import javax.swing.*;


// PANEL PARA ESCOGER EN CÚAL AGENDA INGRESAR  
public class Panel1 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9105769089425560343L;
	public JButton boton_amigos, boton_trabajo;
	
	
	public Panel1(){
		
		setLayout(null);
		setVisible(true);
		setBounds(5,5,320,305);
		setBackground(Color.white);
		
		
		inicializarComponentes();
	}
	
	public void inicializarComponentes() {
		
		boton_amigos = new JButton("Agenda de amigos");
		boton_trabajo = new JButton ("Agenda Contactos de Trabajo");
		
		boton_amigos.setBounds(45,25,250,70);
		boton_trabajo.setBounds(45,110,250,70);
	
		add(boton_amigos);
		add(boton_trabajo);
	}
}
