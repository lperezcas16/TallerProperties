package Controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.StringTokenizer;

import javax.swing.JFileChooser;

public class AplTaller {
	File f;
	public static void main(String[] args) {
		AplTaller apl = new AplTaller();
		
		apl.abrirAgenda();
		

	}
	public void abrirAgenda()
	{
        //Pregunta por el archivo de la agenda
       
        JFileChooser fc=new JFileChooser(System.getProperty("\\data\\agendaFisica.properties"));   
		fc.showOpenDialog(fc);
		f=fc.getSelectedFile(); //Devuelve el File que vamos a leerName
        if( f != null ){
            try {
				cargarAgenda( f );
			} catch (Exception e) {	System.out.println("No se pudo cargar el archivo." );}
        }else{
           System.out.println("Debe seleccionar un archivo para poder jugar." );
            System.exit( 0 );
        }
    }
	
	private void cargarAgenda( File archivoAgenda) throws Exception{
        // Cargar la agenta del archivo de propiedades
        Properties infoAgenda = new Properties( );
        InputStream inputLetras = new FileInputStream( archivoAgenda);
        infoAgenda.load( inputLetras );
        // Cargar las letras
      /*
        for( int i = 1; i <= filas; i++ ){
            String cadenaLetras = infoSopa.getProperty( "sopaDeLetras.fila" + i );
            StringTokenizer st = new StringTokenizer( cadenaLetras, " " );
            for( int j = 1; j <= columnas; j++ ){
                String letra = st.nextToken( );
                letras[ j - 1 ][ i - 1 ] = letra;
            }
        }*/
    }

}
