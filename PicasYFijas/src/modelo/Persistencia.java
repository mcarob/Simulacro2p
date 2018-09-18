package modelo;

public class Persistencia
{
	private int numero[]={7,3,1,9};
	private int numIngresado[];

	public Persistencia()
	{
		numIngresado = new int [4];
	}

	public void ingresarNum (int n1, int n2, int n3, int n4)
	{
		numIngresado[0] = n1;
		numIngresado[1] = n2;
		numIngresado[2] = n3;
		numIngresado[3] = n4;
	}

	public String CalcularPicasyFijas()
	{
		int picas = 0;
		int fijas = 0;

		for (int i = 0; i < numero.length; i++)
		{
			for (int j = 0; j < numero.length; j++) 
			{
				if (numero[i] == numIngresado[j] && i != j) 
				{
					picas++;
				}	
				else if(numero[i] == numIngresado[i] && i == j) 
				{
					fijas++;
				}
			}
		}

		String respuesta = "Tiene "+ picas + " picas y "+ fijas + " fijas";
		if(fijas == 4)
		{
			return "Número encontrado";
		}
		return respuesta;
	}
}