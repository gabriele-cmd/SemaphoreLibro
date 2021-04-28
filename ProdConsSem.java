/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
public class ProdConsSem {

    /**
     * @param args the command line arguments
     */
    protected static int buffer;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Semaforo pieno = new Semaforo(0);
        Semaforo vuoto = new Semaforo(1);
        ProduciDato prod = new ProduciDato(pieno, vuoto);
        ConsumaDato cons = new ConsumaDato(pieno, vuoto);
        
        prod.start();
        cons.start();
        
        System.out.println("Main: termine avvio thread.");
    }
    
}
