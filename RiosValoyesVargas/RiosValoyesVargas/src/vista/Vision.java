package vista;

import javax.swing.JOptionPane;
import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;

import controlador.Principal;
import modelo.FilasYPicas;

public class Vision 
{
	
	private Principal controlador;
	private FilasYPicas modelo;
	
	public Vision(Principal pControlador, FilasYPicas pModelo)
	{
		controlador = pControlador;
		modelo = pModelo;
	}
	
	public void pedirNumero()
	{
		try
		{
			String numero = JOptionPane.showInputDialog(null, "Ingrese Su Numero (####)");
			int sNumero = Integer.parseInt(numero);
			if(sNumero <= 0001 || sNumero > 9999)
			{
				throw new Exception("El sNumero Tiene Mas/Menos De Los Digitos Pedidos");

			}
			else if(numeroRepetido(sNumero) == true)
			{
				throw new Exception("Hay Un sNumero Repetido");
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
}
