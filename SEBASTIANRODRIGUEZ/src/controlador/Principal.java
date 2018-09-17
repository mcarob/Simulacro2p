package controlador;

import java.util.Scanner;

public class Principal 
{
	public static void main(String[] args)
	{
		System.out.println("Bienvenido al juego pica, por favor siga las instrucciones para su debido funcionamiento");
		System.out.println("Ingrese 4 numeros mayor o igual a 0 y menor o igual a 9");

		Scanner lector = new Scanner(System.in);
		String num = lector.nextLine();
		int res = Integer.parseInt(num);

		int inicio = 0;
		

		int x = 1;
		while (inicio >= 0 && inicio <= 10)
		{
			if(res >= 0 && res<=9999)
			{

			}
			else if(res < 0 && res > 9999)
			{
				System.out.println("Señor usuario, es un numero de 4 cifras");

			}
		}

	}
}
