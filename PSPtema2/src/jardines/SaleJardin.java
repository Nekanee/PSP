/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jardines;

/**
 *
 * @author FP
 */
public class SaleJardin extends Thread{
    
    private RecursoJardin jardin;
    
    public SaleJardin(String nombre,RecursoJardin j){
        this.setName(nombre);
        this.jardin=j;
    }
    
    @Override
    public void run (){
        jardin.decrementaCuenta();
        //invoca al metodo que decrementa la cuenta de accesos
    }
    
}
