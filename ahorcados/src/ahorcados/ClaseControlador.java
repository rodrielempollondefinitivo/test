package ahorcados;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;

public class ClaseControlador implements ActionListener {

	ClaseModelo objModelo = null;
	ClaseVista objVista = null;

	public ClaseControlador(ClaseVista objVista, ClaseModelo objModelo) { 
		this.objModelo = objModelo; 
		this.objVista = objVista; 
		actionListener(this); // Escuchador para el botón 
	}
}