package Modelo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Resultado {

	private String rutaArchivo;
	public Resultado() {
		rutaArchivo = "C:\\Users\\aulamovil06\\Desktop\\resultados";
	}
	
	public void escribirArchivo(String v)
	{
		File archivo = new File(rutaArchivo);
		try 
		{
			FileWriter escritor = new FileWriter(archivo,true);
			PrintWriter impresor = new PrintWriter(escritor);
			impresor.println(v);
			
			escritor.close();
			
		} 
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}
	}
}
