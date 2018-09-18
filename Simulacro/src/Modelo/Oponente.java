

package Modelo;
import java.util.Random;


public class Oponente {
    private int ramdom;
    
    public Oponente(){
       
        Random rnd = new Random();
        ramdom = (int) (rnd.nextDouble() * 1000 + 1000);
        System.out.print(ramdom);
    }

    public int getRamdom() {
        return ramdom;
    }

    public void setRamdom(int ramdom) {
        this.ramdom = ramdom;
    }
}