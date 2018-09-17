package modelo;

import controlador.Principal;

public class FilasYPicas 
{
	
	private String[] digitosNumeroBuscado;
	private String nombreJugador;
	private int numeroUsuario;
	private int intentos;
	private boolean terminado;


	public FilasYPicas()
	{
		digitosNumeroBuscado = cargarNumeroBuscado();
		numeroUsuario = 0000;
		intentos = 0;
		terminado = false;
	}
	
	public void asignarNombreJugador(String pNombreJugador)
	{
		nombreJugador = pNombreJugador;
	}
	
	public int validarFilas()
	{
		int filas = 0;
		String sNumeroUsuario = String.valueOf(numeroUsuario);
		
		for (int i = 0; i < sNumeroUsuario.length(); i++) 
		{
			String actualCaracterUsuario = String.valueOf(sNumeroUsuario.charAt(i));
			boolean detenerse = false;
			
			for (int j = 0; j < digitosNumeroBuscado.length && detenerse == false; j++) 
			{
				if(actualCaracterUsuario.equals(digitosNumeroBuscado[j]) && i != j)
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
			
			for (int j = 0; j < digitosNumeroBuscado.length && detenerse == false; j++) 
			{
				if(actualCaracterUsuario.equals(digitosNumeroBuscado[j]) && i == j)
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
		boolean maxIntentos = false;
		
		if(intentos == Persistencia.MAX_INTENTOS)
		{
			maxIntentos = true;
		}
		
		return maxIntentos;
	}
	
	public String validarTurno()
	{
		String validado = "";

		if(validarIntentos() == false)
		{
			int picas = validarPicas();
			int filas = validarFilas();
			intentos++;
			
			validado = picas + " Picas\n" + filas + " Filas";
			
			if(picas == 4)
			{
				validado = "!GANASTE¡";
				terminado = true;
			}
		}
		else
		{
			validado = "Se ha alcanzado la cantidad maxima de intentos";
		}
		
		return validado;
	}
	
	public void cambiarNumeroUsuario(int pNumeroUsuario)
	{
		numeroUsuario = pNumeroUsuario;
	}

	private String[] cargarNumeroBuscado()
	{
		String[] digitos = new String[4];
		
		for (int i = 0; i < digitos.length; i++)
		{
			char cActual = Persistencia.NUMERO_ENCONTRAR.charAt(i);
			String actual = String.valueOf(cActual);
			digitos[i] = actual;
		}
		
		return digitos;
	}
	
	public String darNombreJugador()
	{
		return nombreJugador;
	}
	
	public boolean ganado()
	{
		return terminado;
	}
	
	public int darNumeroIntentos()
	{
		return intentos;
	}
}

