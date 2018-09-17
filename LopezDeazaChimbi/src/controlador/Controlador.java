package controlador;

import modelo.Mundo;
import vista.Interfaz;

public class Controlador {

	private Mundo m;
	private Interfaz i;
	
	public Controlador()
	{
		i = new Interfaz();

		m = new Mundo();
	}
	
}
