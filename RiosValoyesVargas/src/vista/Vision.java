package vista;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;

import controlador.Controlador;
import modelo.FilasYPicas;
import modelo.Lectura;

public class Vision 
{
	
	private Controlador controlador;
	private FilasYPicas modelo;
	private Lectura lectura;
	
	public Vision(Controlador pControlador, FilasYPicas pModelo)
	{
		controlador = pControlador;
		modelo = pModelo;
		lectura = new Lectura();
	}
	
	public String pedirDato(String pMensaje)
	{
		return JOptionPane.showInputDialog(null, pMensaje);
	}
	
	public void pedirNumero()
	{
		try
		{
			String numero = JOptionPane.showInputDialog(null, "Ingrese Su Numero (####)");
			int sNumero = Integer.parseInt(numero);
			if(sNumero <= 0001 || sNumero > 9999)
			{
				throw new Exception("El Numero Tiene Mas/Menos De Los Digitos Pedidos");

			}
			else if(numeroRepetido(sNumero) == true)
			{
				throw new Exception("Hay Un Numero Repetido");
			}
			else
			{
				modelo.cambiarNumeroUsuario(sNumero);
			}
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void mostrarDatos(String pDatos)
	{
		JOptionPane.showMessageDialog(null, pDatos, "DATOS", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public boolean numeroRepetido(int pNumero)
	{
		boolean repetido = false;
		String sNumero = String.valueOf(pNumero);
		
		for (int i = 0; i < 4 && repetido == false; i++) 
		{
			for (int j = 0; j < 4 && repetido == false; j++)
			{
				
				if(String.valueOf(sNumero.charAt(i)).equals(String.valueOf(sNumero.charAt(j))) && i != j)
				{
					repetido = true;
				}
			}
			
		}
		
		return repetido;
	}
	
	public void imprimirResultados()
	{
		
		ArrayList <String> datos =  lectura.cargarArchivo();
		
		for(int i = 0; i < datos.size(); i ++)
		{
			JOptionPane.showMessageDialog(null, datos.get(i));
		}
	}
}
