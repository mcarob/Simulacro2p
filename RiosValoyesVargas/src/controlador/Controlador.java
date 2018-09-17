package controlador;

import modelo.FilasYPicas;
import modelo.Persistencia;
import modelo.Resultado;
import vista.Vision;

public class Controlador 
{
	private static FilasYPicas modelo;
	private static Vision vista;
	private static Resultado resultado;
	
	public Controlador()
	{
		modelo = new FilasYPicas();
		vista = new Vision(this, modelo);
		resultado = new Resultado();
		
		boolean ganado = false;
		modelo.asignarNombreJugador(vista.pedirDato("Ingrese el nombre del jugador"));
		
		for(int i = 0; ganado == false && i < Persistencia.MAX_INTENTOS; i++)
		{	
			cambiarNumeroUsuario();
			mostrarInformacion();
			
			ganado = modelo.ganado();
		}
		
		guardarResultados();
		vista.imprimirResultados();
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
	
	public static void guardarResultados()
	{
		String nombreJugador = modelo.darNombreJugador();
		String numeroAdivinar = Persistencia.NUMERO_ENCONTRAR;
		int numeroIntentos = modelo.darNumeroIntentos();
		boolean estadoPartida = modelo.ganado();
		
		resultado.escribirResultados(nombreJugador, numeroAdivinar, numeroIntentos, estadoPartida);
	}

}
