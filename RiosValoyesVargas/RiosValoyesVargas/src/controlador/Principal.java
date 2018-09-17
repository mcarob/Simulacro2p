package controlador;

import modelo.FilasYPicas;
import modelo.Persistencia;
import vista.Vision;

public class Principal 
{
	private static FilasYPicas modelo;
	private static Vision vista;
	
	public Principal()
	{
		modelo = new FilasYPicas();
		vista = new Vision(this, modelo);
	}
	
	public static void main(String[] args) 
	{
		Principal controlador = new Principal();
		boolean ganado = false;
		modelo.asignarNombreJugador(vista.pedirDato("Ingrese el nombre del jugador"));
		
		while(ganado == false)
		{					
			cambiarNumeroUsuario();
			mostrarInformacion();
			
			ganado = modelo.ganado();
		}
		
	}
	
	public static void cambiarNumeroUsuario()
	{
		vista.pedirNumero();
	}
	
	public static void mostrarInformacion()
	{
		String datos = modelo.validarTurno();
		vista.mostrarDatos(datos);
	}
	


	
}
