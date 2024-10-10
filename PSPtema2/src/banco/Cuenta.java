/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author FP
 */
public class Cuenta {

    private int saldo;

    Cuenta(int s) {
        saldo = s;
    }

    public int getSaldo() {
        return saldo;
    }

    private void restar(int cantidad) {
        saldo = saldo - cantidad;
    }

    public synchronized void RetirarDinero(int cant, String nom) {
        if (getSaldo() >= cant) {
            System.out.println(nom + " : retirar saldo (Actual de: " + getSaldo() + " )");

            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
            }
            restar(cant);

            System.out.println("\t" + nom + " retira =>" + cant + " actual (" + getSaldo() + " .");
        } else {
            System.out.println(nom+" No hay saldo "+getSaldo());
        }
        
        if (getSaldo()<0){
            System.out.println("Saldo negativo, no se puede sacar dinero "+ getSaldo());
        }
    }
}
