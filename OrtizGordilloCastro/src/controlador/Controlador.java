package controlador;

import modelo.Mundo;
import modelo.Numero;
import vista.Interfaz;

public class Controlador 
{
	public Controlador()
	{
		Mundo m = new Mundo();
		Numero n = new Numero();
		Interfaz i =  new Interfaz();

		for (int j = 0; j < 10; j++) 
		{
			String pedir = i.pedirNumeros();
			i.numeroDePyF(n.CalcularP(pedir));
			j++;
			
			if(n.CalcularP(pedir).equals("Has encontrado el numero, GANO"))
			{
				j =10;
			}
		}
		i.seAcabaronLosIntentos();
	}
}