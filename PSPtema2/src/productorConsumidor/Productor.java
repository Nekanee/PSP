/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productorConsumidor;

/**
 *
 * @author FP
 */
public class Productor implements Runnable {

    ObjetoCompartido compartido;

    Productor(ObjetoCompartido compartido) {
        this.compartido = compartido;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("El producto produce: " + i);
            this.compartido.set(i);
            try {
                Thread.currentThread().sleep(100);

            } catch (InterruptedException e) {

            }
        }
    }

}
