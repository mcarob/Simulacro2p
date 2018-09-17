package vista;

import javax.swing.JOptionPane;

public class Interfaz 
{
	public String pedirNumeros()
	{
		return JOptionPane.showInputDialog("Introduzca el numero");
	}
	public void numeroDePyF(String resul)
	{
		JOptionPane.showMessageDialog(null, resul);
	}
	
	public void seAcabaronLosIntentos()
	{
		JOptionPane.showMessageDialog(null, "Se Acabaron los intentos solo tenias 10 intentos, en la mala");
	}
}