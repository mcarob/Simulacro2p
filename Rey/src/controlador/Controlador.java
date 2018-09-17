package controlador;

import modelo.Mundo;
import modelo.Resultado;
import vista.Ventana;

public class Controlador
{
	private Mundo m;
	private Ventana vista;
	private Resultado r;
	
	
	public Controlador()
	{
		r = new Resultado();
		m = new Mundo();
		vista = new Ventana(this);
	}
	public void agregarNumero()
	{
		m.ingresarNumero();
	}
	public void ingresarNombre()
	{
		m.ingresarNombre();
	}
	public int contarPicas()
	{
		return m.contarPicas();
	}
	public int contarFijas()
	{
		return m.contarFijas();
	}
	public boolean ganar()
	{
		return m.terminarJuego();
	}
	public int darTurno()
	{
		return m.darTurnos();
	}
	public void guardar()
	{
		r.guardar();
	}
	public String cargar()
	{
		return r.cargar();
	}
}
