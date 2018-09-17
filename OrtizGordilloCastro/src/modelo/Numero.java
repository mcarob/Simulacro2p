package modelo;

public class Numero 
{
	private int numero[];
	private int numUs[];
	
	public Numero()
	{
		numero = new int [4];
		numero[0] = 0;
		numero[1] = 8;
		numero[2] = 2;
		numero[3] = 9;
		numUs = new int [4];
		
	}

	public String CalcularP(String numUsu)
	{
		try 
		{
			for (int i = 0; i < numUsu.length(); i++) 
			{
				numUs[i] = Integer.parseInt(numUsu.split("")[i]);
			}	
		} 
		catch (Exception e) 
		{
			return "Existe un error al momento de cargar el numero ingrese otro numero";
		}
		
		int picas = 0;
		int fijas = 0;

		if(numUsu.split("").length ==4)
		{
		for (int i = 0; i < numero.length && fijas < 4; i++)
		{
			for (int j = 0; j < numero.length; j++) 
			{
				if (numero[i] == numUs[j] && i != j) 
				{
					picas++;
				}	
				else if(numero[i] == numUs[i] && i == j) 
				{
					fijas++;
				}
			}
		}
		
		if(fijas == 4)
		{
			return "Has encontrado el numero, GANO";
		}else 
			return "El numero de picas es "+picas+"\n"+"El numero de fijas es "+fijas;
		}	
		return "EL numeor tiene que ser de 4 dijitos";
	}
}