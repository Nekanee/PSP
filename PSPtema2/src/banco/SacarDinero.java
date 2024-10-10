/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author FP
 */
public class SacarDinero extends Thread {

    private Cuenta c;

    public SacarDinero(String n, Cuenta c) {
        super(n);
        this.c = c;
    }

    @Override
    public void run() {

        for (int x = 1; x <= 4; x++) {
            c.RetirarDinero(10, getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
    }

}
