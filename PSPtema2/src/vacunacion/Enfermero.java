/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vacunacion;

import vacunacion.ListaPaciente;

/**
 *
 * @author FP
 */
public class Enfermero extends Thread {

    private String nombre;
    private ListaPaciente lista;
    private long inicio;

    public long getInicio() {
        return inicio;
    }

    public void setInicio(long inicio) {
        this.inicio = inicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ListaPaciente getLista() {
        return lista;
    }

    public void setLista(ListaPaciente lista) {
        this.lista = lista;
    }

    public Enfermero(String nombre, ListaPaciente lista, long inicio) {
        this.nombre = nombre;
        this.lista = lista;
        this.inicio = inicio;
    }

    private void TiempoVacunacion(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public void run() {

        System.out.println("El enfermero " + this.nombre + " Comienza avacunar la compra del cliente " + lista.getNombre() + " en el tiempo " + (System.currentTimeMillis() - inicio) / 1000 + " seg");

        for (int i = 0; i < lista.getTiempoPacientes().length; i++) {
            this.TiempoVacunacion(lista.getTiempoPacientes()[i]);
            System.out.println("Vacunando al paciente " + (i + 1) + " -> tiempo: " + (System.currentTimeMillis() - inicio) / 1000 + " seg");
        }

        System.out.println("El enfermero " + this.nombre + " ha termnado de vacunar " + lista.getNombre() + " en el tiempo: " + (System.currentTimeMillis() - inicio) / 1000 + " seg");
    }
}
