package controlador;

import modelo.FilasYPicas;
import modelo.Persistencia;
import modelo.Resultado;
import vista.Vision;

public class Principal 
{
	private static FilasYPicas modelo;
	private static Vision vista;
	private static Resultado resultado;
	
	public Principal()
	{
		modelo = new FilasYPicas();
		vista = new Vision(this, modelo);
		resultado = new Resultado();
	}
	
	public static void main(String[] args) 
	{
		Principal controlador = new Principal();
		boolean ganado = false;
		modelo.asignarNombreJugador(vista.pedirDato("Ingrese el nombre del jugador"));
		
		while(ganado == false || modelo.darNumeroIntentos() <= Persistencia.MAX_INTENTOS)
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
	
	public static void guardarResultados()
	{
		String nombreJugador = modelo.darNombreJugador();
		String numeroAdivinar = Persistencia.NUMERO_ENCONTRAR;
		int numeroIntentos = modelo.darNumeroIntentos();
		boolean estadoPartida = modelo.ganado();
		
		resultado.escribirResultados(nombreJugador, numeroAdivinar, numeroIntentos, estadoPartida);
	}
	


	
}
