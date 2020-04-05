package Vista;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelCorreoT extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3462092210264769145L;
	/**
	 * 
	 */
	//hola
	
	public JLabel etiqueta;
	public JTextField campo_correot;
	public JButton boton_añadir1, boton_eliminar, boton_modificar;
	
	public PanelCorreoT() {
		
		setLayout(null);
		setVisible(false);
		setBounds(5,5,320,305);
		setBackground(Color.white);
		
		inicializarComponentes();
	}

	public void inicializarComponentes() {
		etiqueta = new JLabel("Por favor ingresa un correo electrónico");
		campo_correot = new JTextField();
		boton_añadir1 = new JButton("Añadir");
		boton_eliminar = new JButton ("Eliminar");
		boton_modificar = new JButton("Modificar");
		
		etiqueta.setBounds(40,0,250,80);
		campo_correot.setBounds(10,70,300,30);
		boton_añadir1.setBounds(45,110,100,30);
		boton_modificar.setBounds(180,110,100,30);
		boton_eliminar.setBounds(110,150,100,30);
		
		add(etiqueta);
		add(campo_correot);
		add(boton_añadir1 );
		add(boton_eliminar);
		add(boton_modificar);
		
	}
	
	
	
	
	
}


