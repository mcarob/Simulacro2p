package controlador;


import Vista.Interfaz;
import modelo.Numero;
import modelo.Persistencia;

public class Controlador {

	private Numero num;
	private Interfaz gui;
	private Persistencia p;
	
	public Controlador() {
		p=new Persistencia();
		gui.CalcularNum();
		
	
p.escribirArchvio(gui.nombre(),gui.numero());
p.leerArchvio();

	}

}
