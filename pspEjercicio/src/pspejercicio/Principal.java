/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pspejercicio;

/**
 *
 * @author FP
 */
public class Principal {

    
    public static void main(String[] args) throws InterruptedException {
        Sumatorio s1 = new Sumatorio(23);
        Sumatorio s2 = new Sumatorio(13);
        Sumatorio s3 = new Sumatorio(15); 
        
        s1.start();
        s2.start();
        s3.start(); 
        
        s1.join();
        s2.join();
        s3.join();
        
        double fin = (s1.getResultado()+s2.getResultado()+s3.getResultado())/8;
        
        System.out.println("Resultado: "+fin);
    }
    
}
