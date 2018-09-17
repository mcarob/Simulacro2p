package modelo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;

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
			FileWriter fw = new FileWriter(archivo, true);
			PrintWriter pw = new PrintWriter(fw);
			String imprimir = "";
			String estadoPartida = null;
			if(pEstadoPartida == true)
			{
				estadoPartida = "Gano";
			}
			else
			{
				estadoPartida = "Perdio";
			}
			imprimir+= pNombreJugador + ";" + pNumeroAdivinar + ";" + pNumeroIntentos + ";" + estadoPartida;
			pw.println(imprimir);
					
			pw.close();
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
	
}
