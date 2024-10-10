/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sumatorioConProcesadores;

import java.util.concurrent.Callable;

/**
 *
 * @author FP
 */
class Suma implements Callable<Long> {

    private long n1;
    private long n2;

    //Constructores
    public Suma() {
        long n1 = 0;
        long n2 = 0;
    }

    public Suma(long n1, long n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    @Override
    public Long call() {
        long result = 0;
        try {
            Thread hiloActual = Thread.currentThread();
            System.out.println("Iniciando el hilo: " + hiloActual.getName() + "Suma: (" + this.n1 + " , " + this.n2 + ")");

            for (long i = this.n1; i <= this.n2; i++) {
                result = result + i;

            }

            Thread.sleep(500);
            System.out.println("Hilo finalizado " + hiloActual.getName());
            System.out.println("Resultado del hilo: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

}
