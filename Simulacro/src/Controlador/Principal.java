package Controlador;

import Modelo.Oponente;
import Vista.Usuario;
import Modelo.Mundo;
import Modelo.Resultado;

public class Principal {

    
    public void iniciar() {
        
        Oponente objOponente = new Oponente();
        Usuario objUsuario = new Usuario();
        Resultado objResultado = new Resultado();
        
        Mundo objJuego = new Mundo();
        objJuego.setNumOponente(objOponente.getRamdom());
      
        objJuego.setJugando(true);

        while (objJuego.isJugando()) {
            objJuego.setNumUsuario(objUsuario.pedirNumero());
            String val = objJuego.jugar();
            
            objUsuario.Mostrar(val);
            objResultado.escribirArchivo(val);
        }
    }

}