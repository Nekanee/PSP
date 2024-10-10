/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psptema2;

import java.text.Normalizer;

/**
 *
 * @author FP
 */
public class Tarea extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(" un hilo y esto es lo que hago " + i + " Soy el hilo ");
        }

    }
}
