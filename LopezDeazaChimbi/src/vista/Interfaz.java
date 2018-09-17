package vista;

import javax.swing.JOptionPane;

import modelo.Numero;

public class Interfaz {

	
	public Interfaz()
	{
		pedirNom();

		CalcularNum();
	}
	public static String pedirNom()
	{
		JOptionPane.showMessageDialog(null, "Bienvenido a Picas y Fijas");
		String nombre = JOptionPane.showInputDialog("Ingrese el nombre del jugador");
		JOptionPane.showMessageDialog(null, nombre);
		
		return nombre;
	}
	
	public static void CalcularNum()
	{
		Numero numero = new Numero();
		String num1 = JOptionPane.showInputDialog("Introduzca el primer numero");
		int	iNum1 = Integer.parseInt(num1);
		
		String num2 = JOptionPane.showInputDialog("Introduzca  el segundo numero");
		int	iNum2 = Integer.parseInt(num2);
		
		String num3 = JOptionPane.showInputDialog("Introduzca el tercer numero");
		int	iNum3 = Integer.parseInt(num3);
		
		String num4 = JOptionPane.showInputDialog("Introduzca el cuarto numero");
		int	iNum4 = Integer.parseInt(num4);
		
		numero.cargarNum(iNum1, iNum2,iNum3, iNum4);
		String r = numero.CalcularPF();
		JOptionPane.showMessageDialog(null, r);
	}
}
