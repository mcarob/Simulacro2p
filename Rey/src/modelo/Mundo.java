package modelo;

import javax.swing.JOptionPane;

public class Mundo
{
	private Persistencia p;
	private int[] numero;
	private String nombre;
	public final static int CAPACIDAD = 4; 
	private int turnos;
	
	
	public Mundo()
	{
		p = new Persistencia();
		numero = new int[CAPACIDAD];
		
		turnos=0;
	}
	public void ingresarNombre()
	{
		nombre = JOptionPane.showInputDialog("Ingrese su nombre");
	}
	public void ingresarNumero()
	{
		for (int i = 0; i < numero.length; i++) 
		{
			String numero = JOptionPane.showInputDialog("Ingrese el digito");
			int num = Integer.parseInt(numero);
			this.numero[i]=num;
		}
		turnos++;
	}
	public int contarPicas()
	{
		int resultado=0;
		
			if(numero[0]==p.getA()||numero[0]==p.getB()||numero[0]==p.getC()||numero[0]==p.getD())
			{
				resultado++;
			}
			if(numero[1]==p.getA()||numero[1]==p.getB()||numero[1]==p.getC()||numero[1]==p.getD())
			{
				resultado++;
			}
			if(numero[2]==p.getA()||numero[2]==p.getB()||numero[2]==p.getC()||numero[2]==p.getD())
			{
				resultado++;
			}
			if(numero[3]==p.getA()||numero[3]==p.getB()||numero[3]==p.getC()||numero[3]==p.getD())
			{
				resultado++;
			}
		
		
		return resultado;
	}
	public int contarFijas()
	{
		int resultado=0;
		
		if(numero[0]==p.getA())
		{
			resultado++;
		}
		if(numero[1]==p.getB())
		{
			resultado++;
		}
		if(numero[2]==p.getC())
		{
			resultado++;
		}
		if(numero[3]==p.getD())
		{
			resultado++;
		}
		
		return resultado;
	}
	
	public boolean terminarJuego()
	{
		boolean gano=false;
		if(this.contarFijas()==4 &&turnos<10)
		{
			gano=true;
		}
		
		return gano;
	}
	public int darTurnos()
	{
		return turnos;
	}
	public Persistencia getP() {
		return p;
	}
	public void setP(Persistencia p) {
		this.p = p;
	}
	public int[] getNumero() {
		return numero;
	}
	public void setNumero(int[] numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTurnos() {
		return turnos;
	}
	public void setTurnos(int turnos) {
		this.turnos = turnos;
	}

}
