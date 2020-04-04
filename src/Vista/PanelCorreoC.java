package Vista;

import java.awt.Color;

import javax.swing.*;
//  PANEL PARA INGRESAR CORREO
public class PanelCorreoC extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 623435818373587848L;
	public JLabel etiqueta;
	public JTextField campo_correo;
	public JButton boton_añadir, boton_eliminar, boton_modificar;
	
	public PanelCorreoC() {
		
		setLayout(null);
		setVisible(false);
		setBounds(5,5,320,305);
		setBackground(Color.white);
		
		inicializarComponentes();
	}

	public void inicializarComponentes() {
		etiqueta = new JLabel("Por favor ingresa un correo electrónico");
		campo_correo = new JTextField();
		boton_añadir = new JButton("Añadir");
		boton_eliminar = new JButton ("Eliminar");
		boton_modificar = new JButton("Modificar");
		
		etiqueta.setBounds(40,0,250,80);
		campo_correo.setBounds(10,70,300,30);
		boton_añadir.setBounds(45,110,100,30);
		boton_modificar.setBounds(180,110,100,30);
		boton_eliminar.setBounds(110,150,100,30);
		
		add(etiqueta);
		add(campo_correo);
		add(boton_añadir );
		add(boton_eliminar);
		add(boton_modificar);
		
	}
	
	
	
	
	
}

