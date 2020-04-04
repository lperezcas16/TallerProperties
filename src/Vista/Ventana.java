package Vista;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ventana extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3976866435966505711L;
//	PANEL DE AMIIGOS CERCANOS 
	public PanelCercano panel;
//	PANEL DE CONTACTOS DE TRABAJO
	public PanelTrabajo panel_trabajo;
//	PANEL PARA ESCOGER CUAL AGENDA VAN A MODIFICAR
	public Panel1 panel_inicial;
//	PANEL PARA AGREGAR CORREO 
	public PanelCorreoC panel_correoc;
	public PanelCorreoT panel_correot;
	public JButton boton_regresar;
	
	public Ventana() {
		
		setTitle("Agenda");
		
		
		setSize(350, 300);
		setLocationRelativeTo(null);
		setResizable(false);
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		inicializarComponentes();
		setVisible(true);
		
	}
	public void inicializarComponentes() {
		getContentPane().setLayout(null);
//		Panel de amigos cercanos
		panel = new PanelCercano();
//		Panel compañeros de trabajo
		panel_trabajo = new PanelTrabajo();
//		Panel para escoger la agenda a modificar
		panel_inicial = new Panel1();
//		panel para ingresar en correo 
		panel_correoc = new PanelCorreoC();
		
		panel_correot = new PanelCorreoT();
		
		boton_regresar = new JButton("Regresar");
		boton_regresar.setBounds(125,225,100,20);
		add(boton_regresar);
		
		getContentPane().setBackground(Color.white);
		getContentPane().add(panel, BorderLayout.CENTER);
		getContentPane().add(panel_trabajo, BorderLayout.CENTER);
		getContentPane().add(panel_inicial, BorderLayout.CENTER);
		getContentPane().add(panel_correoc,BorderLayout.CENTER);
		getContentPane().add(panel_correot,BorderLayout.CENTER);
				
	}
	public PanelCercano getPanel() {
		return panel;
	}
	public void setPanel(PanelCercano panel) {
		this.panel = panel;
	}
	
	// ESTE METODO SE USA PARA MOSTRAR MENSAJES DE NOTIFICACION
	public void mostrarMensajes(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}	

}
