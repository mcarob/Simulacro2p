package vista;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import controlador.Controlador;

public class Ventana extends JFrame implements ActionListener
{
	public final static String AGREGAR="p1";
	public final static String FIJAS ="p2";
	public final static String PICAS= "p3";
	public final static String NOMBRE = "p4";
	public final static String TURNO = "p5";
	public final static String GANAR = "p6";
	public final static String CARGAR="p7";
	private Panel p;
	private PanelResult pr;
	private Controlador control;
	
	public Ventana(Controlador pControl)
	{
		setTitle("Picas & Fijas");
		setLayout(new GridLayout(1, 2));
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,300);
		control = pControl;
		
		p = new Panel(this);
		pr = new PanelResult(this);
		add(p);
		add(pr);
		
		
	}
	public void ganar()
	{
		if(control.ganar()==true &&control.darTurno()<10)
		{
			JOptionPane.showMessageDialog(null,"FELICIDADES GANASTE");
			control.guardar();
		}
		else if(control.darTurno()>10)
		{
			JOptionPane.showMessageDialog(null,"Perdiste");
			control.guardar();
		}
		else
		{
			int resta =10-control.darTurno();
			JOptionPane.showMessageDialog(null,"Te restan: "+resta+" para intentar ganar");
		}
		
	}
	@Override
	public void actionPerformed(ActionEvent evento) 
	{
		String comando = evento.getActionCommand();
		if(comando.equals(AGREGAR))
		{
			control.agregarNumero();
		}
		if(comando.equals(FIJAS))
		{
			int fijas = control.contarFijas();
			JOptionPane.showMessageDialog(null,"Total fijas: "+fijas);
		}
		if(comando.equals(PICAS))
		{
			int picas = control.contarPicas();
			JOptionPane.showMessageDialog(null,"Total picas: "+picas);
		}
		if(comando.equals(NOMBRE)) 
		{
			control.ingresarNombre();
		}
		if(comando.equals(TURNO))
		{
			JOptionPane.showMessageDialog(null,"Turnos utilizados: "+control.darTurno());
		}
		if(comando.equals(GANAR))
		{
			this.ganar();
		}
		if(comando.equals(CARGAR))
		{
			JOptionPane.showMessageDialog(null, control.cargar());
		}
		
	}
}
