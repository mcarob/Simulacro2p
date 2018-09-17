package modelo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class Resultado 
{

	public Resultado()
	{
		
	}
	
	public void escribirResultados(String pNombreJugador, String pNumeroAdivinar, int pNumeroIntentos, boolean pEstadoPartida)
	{
		try
		{
			File archivo = new File("./data/resultados.txt");
			FileWriter fw = new FileWriter(archivo);
			
			String imprimir = "";
			imprimir+= pNombreJugador + ";" + pNumeroAdivinar + ";" + pNumeroIntentos + ";" + pEstadoPartida;
			fw.write(imprimir);
			
			fw.close();
		}
		catch(Exception e)
		{
			
		}
	}
	
}
