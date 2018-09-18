package Vista;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Usuario {

    public Usuario() {
    }

    public int pedirNumero() {
    	int v = 0;
    	
    	String sc = JOptionPane.showInputDialog(null, "Ingrese un  numero de cuatro digitos");
        
        v = Integer.parseInt(sc);
        
        
        
        return v;
    }
    
    public void Mostrar(String v) {
    	JOptionPane.showMessageDialog(null, v);
    }

}
