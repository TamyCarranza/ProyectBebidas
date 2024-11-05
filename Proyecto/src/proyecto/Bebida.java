/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author tamar
 */
public class Bebida {
    private String nombre;
    private int horaEntrega;

    public Bebida(String nombre, int horaEntrega) {
        this.nombre = nombre;
        this.horaEntrega = horaEntrega;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHoraEntrega() {
        return horaEntrega;
    }

    public void setHoraEntrega(int horaEntrega) {
        this.horaEntrega = horaEntrega;
    }
}

