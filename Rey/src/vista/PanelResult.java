package vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class PanelResult extends JPanel
{
	private JButton turno;
	private JButton progreso;
	private JButton historial;
	private Ventana vista;
	
	public PanelResult(Ventana pVista)
	{
		vista = pVista;
		setLayout(new GridLayout(3, 1));
		
		turno = new JButton("Ver turnos utilizados");
		turno.addActionListener(vista);
		turno.setActionCommand(Ventana.TURNO);
		add(turno);
		
		progreso = new JButton("Progreso");
		progreso.addActionListener(vista);
		progreso.setActionCommand(Ventana.GANAR);
		add(progreso);
		
		historial = new  JButton("Historial");
		historial.addActionListener(vista);
		historial.setActionCommand(Ventana.CARGAR);
		add(historial);
	}
	
}
