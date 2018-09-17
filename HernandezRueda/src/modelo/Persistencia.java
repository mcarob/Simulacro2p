package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import Vista.Interfaz;

public class Persistencia {
	
	Numero m;
	Interfaz i;
	private String rutaArchivo;
	
	public Persistencia()
	{
	m=new Numero();
	i= new Interfaz();
	
	}
	
	
	
	
	
	
	
	
	public void escribirArchvio(String p,String a) {
		File f=new File("C:\\Users\\aulamovil06\\Desktop\\Archivos/1.txt");
		try {
			FileWriter fw=new FileWriter(f);
			PrintWriter pw=new PrintWriter(fw);
			pw.println(p+a);
			fw.close();
			}

		catch(IOException e) {
			System.out.println("error");
			
			}
			}


	public void leerArchvio() {
		try
		{
			
		
	
		FileReader fr=new FileReader("C:\\\\Users\\\\aulamovil06\\\\Desktop\\\\Archivos/1.txt");
		BufferedReader br= new BufferedReader(fr);
		String linea=br.readLine();
		while(linea!=null)
		{
			
			System.out.println(linea);
			linea=br.readLine();
		}
		fr.close();
		}
		catch(IOException e)
		{
			System.out.println("kadiwjma");
		}
	}


}

