package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Lectura 
{

	public Lectura()
	{

	}


	public ArrayList<String> cargarArchivo()
	{

		ArrayList <String> lectura = new ArrayList<String>();
		try
		{
			File archivo = new File("./data/resultados.txt");
			BufferedReader reader = new BufferedReader(new FileReader(archivo));
			String linea = reader.readLine();
			
			while(linea != null)
			{
				String[] escritura = linea.split(";");				
				lectura.add( "[Nombre]: " + escritura[0] + " [Número]: " + escritura[1] + " [Intentos]: " + escritura[2] + " [Estado de la partida]: " + escritura[3]);
				linea = reader.readLine();
			}
			
			return lectura;
		}
		catch(Exception e)
		{
			return null;

		}
	}

}
