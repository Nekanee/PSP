/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sumatorio;

/**
 *
 * @author FP
 */
public class Principal {

    public static double sumatorio(double num) {
        double suma = 0;
        for (int i = 1; i <= num; i++) {

            suma = suma + i;
        }
        return suma;

    }

    public static void main(String[] args) {

        double num1 = sumatorio(5);
        double num2 = sumatorio(8);
        double num3 = sumatorio(20);
        double num4 = sumatorio(5);

        double formula = (num1 + num2 + num3) / (3 * num4);

        System.out.println("Formula: " + formula);
    }

}
