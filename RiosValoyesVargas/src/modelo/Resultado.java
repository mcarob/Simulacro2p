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
			//Creamos un File el cual tiene la ruta donde se guardaran la informacion
			File archivo = new File("./data/resultados.txt");
			FileWriter fw = new FileWriter(archivo, true);
			//Creamos un printWriter donde se cargar el FileWriter y nos esceibira en el archivo de texto plano
			PrintWriter pw = new PrintWriter(fw);
			String imprimir = "";
			//Observamos cual fue el estado de la partida para escribir si se gano o se perdio la misma
			String estadoPartida = null;
			if(pEstadoPartida == true)
			{
				estadoPartida = "Gano";
			}
			else
			{
				estadoPartida = "Perdio";
			}
			//Almacenamos toda la informacion en un String separandola por ";", para asi despues separarla
			imprimir+= pNombreJugador + ";" + pNumeroAdivinar + ";" + pNumeroIntentos + ";" + estadoPartida;
			//Escribimos la información sobre el archivo de texto plano
			pw.println(imprimir);
					
			//Cerramos el flujo de datos
			pw.close();
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
	
}
