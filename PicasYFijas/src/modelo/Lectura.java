package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Lectura {

	private FileReader fr;
	private BufferedReader bf;
	private String path = "C:\\Users\\paula\\Documents\\Data\\resultados.txt";
	
	public Lectura()
	{
		
	}
		public void leerArchivo() throws IOException
		{
			File f = new File(path);
			try {
				fr = new FileReader(path);
				bf = new BufferedReader(fr);
				String linea = bf.readLine();
				while(linea != null)
				{
					System.out.println(linea);
					linea = bf.readLine();
				}
				fr.close();
			} catch (IOException e) {
				System.out.println("ERROR");
			}
		}
	}
	

