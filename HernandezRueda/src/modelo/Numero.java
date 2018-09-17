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

	public void cargarNum (int pNum, int pNum2, int pNum3, int pNum4)
	{
		numUs[0] = pNum;
		numUs[1] = pNum2;
		numUs[2] = pNum3;
		numUs[3] = pNum4;
	}

	public String CalcularP()
	{
		int picas = 0;
		int fijas = 0;

		for (int i = 0; i < numero.length; i++)
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

		String r1 = "tiene "+ picas + " picas";
		String r2 = " y "+ fijas + " fijas";
		if(fijas == 4)
		{
			return "Encontro el numero";
		}
		return r1 + r2;
	}
}