
package modelo;

public class Numero 
{
	private int numero[];
	private int numAd[];

	public Numero()
	{
		numero = new int [4];
		numero[0] = 3;
		numero[1] = 5;
		numero[2] = 6;
		numero[3] = 9;
		numAd = new int [4];
	}

	public void ingresarNum(int pNum, int pNum2, int pNum3, int pNum4)
	{
		numAd[0] = pNum;
		numAd[1] = pNum2;
		numAd[2] = pNum3;
		numAd[3] = pNum4;
	}

	public String CalcularPF()
	{
		int picas = 0;
		int fijas = 0;

		for (int i = 0; i < numero.length; i++)
		{
			for (int j = 0; j < numero.length; j++) 
			{
				if (numero[i] == numAd[j] && i != j) 
				{
					picas++;
				}	
				else if(numero[i] == numAd[i] && i == j) 
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