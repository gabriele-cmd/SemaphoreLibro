/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
public class ConsumaDato extends Thread{
    Semaforo pieno;
    Semaforo vuoto;
    int dato;

    public ConsumaDato(Semaforo s1, Semaforo s2) {
        this.pieno = s1;
        this.vuoto = s2;
    }
    
    public void run(){
        while(true){
            pieno.P();
            
            dato = ProdConsSem.buffer; //consuma un numero
            System.out.println("Scrittore: dato letto " + dato);
            vuoto.V();
        }
        
        
        
    }
    
}
