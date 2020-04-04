package Vista;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class Ventana extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3976866435966505711L;
//	PANEL DE AMIIGOS CERCANOS 
	public Panel panel;
//	PANEL DE CONTACTOS DE TRABAJO
	public PanelTrabajo panel_trabajo;
//	PANEL PARA ESCOGER CUAL AGENDA VAN A MODIFICAR
	public Panel1 panel_inicial;
//	PANEL PARA AGREGAR CORREO 
	public PanelCedula panel_cedula;
	
	public Ventana() {
		
		setTitle("Agenda");
		
		setVisible(true);
		setSize(350, 250);
		setLocationRelativeTo(null);
		setResizable(false);
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		inicializarComponentes();
		
		
	}
	public void inicializarComponentes() {
		getContentPane().setLayout(null);
//		Panel de amigos cercanos
		panel = new Panel();
//		Panel compañeros de trabajo
		panel_trabajo = new PanelTrabajo();
//		Panel para escoger la agenda a modificar
		panel_inicial = new Panel1();
//		panel para ingresar en correo 
		panel_cedula = new PanelCedula();
		getContentPane().setBackground(Color.white);
		getContentPane().add(panel, BorderLayout.CENTER);
		getContentPane().add(panel_trabajo, BorderLayout.CENTER);
		getContentPane().add(panel_inicial, BorderLayout.CENTER);
		getContentPane().add(panel_cedula,BorderLayout.CENTER);
				
	}
	public Panel getPanel() {
		return panel;
	}
	public void setPanel(Panel panel) {
		this.panel = panel;
	}
	
	

}
