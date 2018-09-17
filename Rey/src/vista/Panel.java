package vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel extends JPanel
{
	private JButton btnNombre;
	private JButton btnAgregar;
	private JButton btnFijas;
	private JButton btnPicas;
	private Ventana vista;
	
	public Panel(Ventana pVista)
	{
		vista = pVista;
		setLayout(new GridLayout(4, 1));
		
		btnNombre= new JButton("Ingrese su nombre");
		btnNombre.addActionListener(vista);
		btnNombre.setActionCommand(Ventana.NOMBRE);
		add(btnNombre);
		
		btnAgregar = new JButton("Agregar Numero");
		btnAgregar.addActionListener(vista);
		btnAgregar.setActionCommand(Ventana.AGREGAR);
		add(btnAgregar);
		
		btnFijas = new JButton("Contar Fijas");
		btnFijas.addActionListener(vista);
		btnFijas.setActionCommand(Ventana.FIJAS);
		add(btnFijas);
		
		btnPicas = new JButton("Contar Picas");
		btnPicas.addActionListener(vista);
		btnPicas.setActionCommand(Ventana.PICAS);
		add(btnPicas);
	}
}
