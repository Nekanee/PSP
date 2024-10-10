/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pspejercicio;

/**
 *
 * @author FP
 */
public class Sumatorio extends Thread {

    private double numero;
    private double resultado;


    public Sumatorio(double numero) {
        this.numero = numero;
    }

    public double sumaImpar() {
        if (numero % 2 == 0) {
            numero = numero - 1;
        }
        double total = 0;
        for (double i = numero; i >= 1; i = i - 2) {
            total += i;
        }
        return total;
    }

   
    public double getResultado() {
        return resultado;
    }
   

    @Override
    public void run() {
        resultado = sumaImpar();
        

    }

}
