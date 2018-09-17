package modelo;

import javax.xml.validation.ValidatorHandler;

public class Juego 
{
	private String [] digitos;
	private int numeroUsuario;
	private int intentos;
	private boolean terminado;

	public Juego()
	{
		numeroUsuario = 0000;
		intentos = 0;
		terminado = false;
	}

	public int validarFilas()
	{
		int filas = 0;
		String sNumeroUsuario = String.valueOf(numeroUsuario);

		for (int i = 0; i < sNumeroUsuario.length(); i++) 
		{
			String actualCaracterUsuario = String.valueOf(sNumeroUsuario.charAt(i));
			boolean detenerse = false;

			for (int j = 0; j < digitos.length && detenerse == false; j++) 
			{
				if(actualCaracterUsuario.equals(digitos[j]) && i != j)
				{
					filas++;
					detenerse = false;
				}
			}
			detenerse = true;
		}

		return filas;
	}

	public int validarPicas()
	{
		int picas = 0;
		String sNumeroUsuario = String.valueOf(numeroUsuario);

		for (int i = 0; i < sNumeroUsuario.length(); i++) 
		{
			String actualCaracterUsuario = String.valueOf(sNumeroUsuario.charAt(i));
			boolean detenerse = false;

			for (int j = 0; j < digitos.length && detenerse == false; j++) 
			{
				if(actualCaracterUsuario.equals(digitos[j]) && i == j)
				{
					picas++;
					detenerse = false;
				}
			}
			detenerse = true;
		}
		return picas;
	}

	public boolean validarIntentos()
	{
		boolean maximo= false;

		if(intentos == Persistencia.MAXIMO_INTENTOS)
		{
			maximo = true;
		}

		return maximo;
	}

	public String validarTurno()
	{
		String validar = "";

		if(validarIntentos() == false)
		{
			int picas = validarPicas();
			int filas = validarFilas();
			intentos++;

			validar = picas + " picas\n " + filas + "filas";

			if(picas == 4)
			{
				validar = "GANÓ PEQUEÑA CRIATURA";
				terminado = true;
			}
		}
		else 
		{
			validar = "maxima cantidad de intentos";
		}
		return validar;				
	}

	public void cambiarNumeroUsuario(int pNumeroUsario)
	{
		numeroUsuario = pNumeroUsario;
	}

	public String[] numeroBuscado()
	{
		String[] digitos = new String[4];

		for (int i = 0; i < digitos.length; i++) 

		{
			char Aactual = Persistencia.NUMERO_ENCONTRAR.charAt(i);
			String actual = String .valueOf(Aactual);
			digitos[i] = actual;
		}

		return digitos;
	}
	
	public boolean ganado()
	{
		return terminado;
	}
}
