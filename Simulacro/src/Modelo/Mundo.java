package Modelo;


public class Mundo {

    private int numOponente;
    private int numUsuario;
    private int picas;
    private int fijas;
    private boolean jugando;
    private int intentos;

    public Mundo() {
        this.fijas = 0;
        this.picas = 0;
        this.numUsuario = 0;
        this.numOponente = 0;
        this.jugando = false;
        this.intentos = 1;
    }

    public boolean isJugando() {
        return jugando;
    }

    public void setJugando(boolean jugando) {
        this.jugando = jugando;
    }

    public int getNumOponente() {
        return numOponente;
    }

    public void setNumOponente(int numOponente) {
        this.numOponente = numOponente;
    }

    public int getNumUsuario() {
        return numUsuario;
    }

    public void setNumUsuario(int numUsuario) {
        this.numUsuario = numUsuario;
    }

    public int getPicas() {
        return picas;
    }

    public void setPicas(int picas) {
        this.picas = picas;
    }

    public int getFijas() {
        return fijas;
    }

    public void setFijas(int fijas) {
        this.fijas = fijas;
    }

    
    public String  jugar() {
        String valor ="";
    	
    	if (numOponente == numUsuario) {
            this.jugando = false;
            valor  = ("Ganaste..!! ");
            valor += "Intentos : " + this.intentos ;
        } else {
            //calcula la cantidad de fijas
            fijas(this.numOponente, this.numUsuario);
            //calcula la cantidad de picas
            picas(this.numOponente, this.numUsuario);
            valor =("Numero: "+this.numUsuario+" fijas : " + this.fijas + "    picas: " + this.picas);
            this.intentos++;
        }
    	return valor;
    }

    /*
     calcula las fijas del juego
     */
    public void fijas(int numOponente, int numUsuario) {
        this.fijas = 0;
        int cont = 0;
        while (cont < 4) {
            if (numOponente % 10 == numUsuario % 10) {
                this.fijas++;
            }
            numOponente = numOponente - (numOponente % 10);
            numUsuario = numUsuario - (numUsuario % 10);
            numOponente = numOponente / 10;
            numUsuario = numUsuario / 10;
            cont++;
        }
    }

    
    public void picas(int numOponente, int numUsuario) {
        this.picas = 0;
        int[] vecOponente = new int[4];
        int[] vecUsuario = new int[4];
        for (int i = 0; i < 4; i++) {
            vecOponente[i] = numOponente % 10;
            vecUsuario[i] = numUsuario % 10;
            numOponente = numOponente - (numOponente % 10);
            numUsuario = numUsuario - (numUsuario % 10);
            numOponente = numOponente / 10;
            numUsuario = numUsuario / 10;
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i != j) {
                    if (vecUsuario[j] == vecOponente[i]) {
                        this.picas++;
                    }
                }
            }
        }
    }

}