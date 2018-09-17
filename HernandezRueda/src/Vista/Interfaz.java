package Vista;

import javax.swing.JOptionPane;

import modelo.Numero;

public class Interfaz {
static String a;
	public Interfaz() 
	{
	CalcularNum();	
		// TODO Auto-generated constructor stub
		a="";
				
	}
	public String numero()
	{
		return "0,8,2,9";
	}
	public String nombre()
	{
		return JOptionPane.showInputDialog("ingrese el nombre");
	}
	public static void CalcularNum()
	{
		
		
		int i=0;
		while(true) {
			if(i<10) {
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
		String r = numero.CalcularP();
		JOptionPane.showMessageDialog(null, r);
		i++;
		JOptionPane.showMessageDialog(null, "Intentos realizados"+i);
		
			}
			else
			JOptionPane.showMessageDialog(null, "perdio");
			break;
			
	}
	}
	


}
