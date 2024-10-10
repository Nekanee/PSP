/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package psptema2;

/**
 *
 * @author FP
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tarea tarea = new Tarea();
        Tarea2 tarea2 = new Tarea2();

        try {
            tarea.start();
            tarea.join();

        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        try {
            tarea2.start();
            tarea2.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("soy el hilo principal");
        System.out.println("Fin del hilo");
    }

}
