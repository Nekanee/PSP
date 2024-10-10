/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jardines;

/**
 *
 * @author FP
 */
public class EntradaJardin extends Thread{
    
    // usamos Thread por que vamos a usar hilos
    
    private RecursoJardin jardin; 

    public EntradaJardin(String nombre, RecursoJardin j) {
        this.setName(nombre);
        this.jardin = j;
        
    }
    @Override
    public void run(){
        jardin.incrementaCuenta();
        //invoca al metodo que suma la cuenta de accesos
    }
    
}
