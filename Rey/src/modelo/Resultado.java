package modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Resultado 
{
	private Mundo m;
	private Persistencia p;
	
	public Resultado()
	{
		m = new Mundo();
		p = new Persistencia();
	}
	public void guardar()
	{
		File f = new File("C:\\Users\\aulamovil06\\Desktop\\Resultados.txt");
		try 
		{
			FileWriter fw = new FileWriter(f,true);
			PrintWriter pw = new PrintWriter(fw);
			pw.println(m.getNombre()+", "+p.getA()+p.getB()+p.getC()+p.getD()+", "+m.getTurnos()+", "+m.terminarJuego());
			fw.close();
			
		} catch (Exception e) 
		{
			JOptionPane.showMessageDialog(null, "No se pudo guardar el  juego");
		}
	}
	public String cargar()
	{
		String texto="";
		File f = new File("C:\\Users\\aulamovil06\\Desktop\\Resultados.txt");
		try 
		{
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String linea = br.readLine();
			while(linea!=null)
			{
				texto=texto+linea+"\n";
				linea = br.readLine();
			}
			
			fr.close();
			
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		return texto;
	}
}
