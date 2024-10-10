/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sumatorioHilos;

/**
 *
 * @author FP
 */
public class numerador extends Thread {
    
     public static double sumatorio(double num) {
        double suma = 0;
        for (int i = 1; i <= num; i++) {

            suma = suma + i;
        }
        return suma;

    }

    @Override
    public void run() {
        Principal.numerador = sumatorio(5)+sumatorio(8)+sumatorio(20);
    }
     
     
}
