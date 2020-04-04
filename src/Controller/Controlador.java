package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.Persistence.AmigoDAO;
import Vista.Ventana;


public class Controlador implements ActionListener{
	 
	Ventana ventana;
	AmigoDAO amigo;
	
	public Controlador() {
		
		this.ventana = new Ventana();
		actionListener(this);
		amigo = new AmigoDAO();
		
	}

	private void actionListener(Controlador controlador) {
		
	ventana.getPanel().getBoton_registrar().addActionListener(controlador);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}




	


}
