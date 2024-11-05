/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author tamar
 */
public class PedidoBebida {
    public void realizarPedido(Empleado empleado) {
        if (empleado.isPedidoRealizado()) {
            JOptionPane.showMessageDialog(null, "Ya has realizado un pedido hoy.");
            return;
        }

        String[] opciones = new String[MenuBebidas.values().length];
        for (int i = 0; i < MenuBebidas.values().length; i++) {
            opciones[i] = MenuBebidas.values()[i].getNombre();
        }

        String bebidaSeleccionada = (String) JOptionPane.showInputDialog(null,
                "Seleccione una bebida:",
                "Menú de Bebidas",
                JOptionPane.PLAIN_MESSAGE,
                null,
                opciones,
                opciones[0]);

        String horaEntregaStr = JOptionPane.showInputDialog("Ingrese la hora de entrega (formato 24 horas, ej. 14 para 2 PM):");
        int horaEntrega = Integer.parseInt(horaEntregaStr);

        Bebida bebida = new Bebida(bebidaSeleccionada, horaEntrega);
        empleado.setPedidoRealizado(true);

        JOptionPane.showMessageDialog(null,
                "Pedido realizado con éxito.\n" +
                        "Empleado: " + empleado.getNombre() + "\n" +
                        "Bebida: " + bebida.getNombre() + "\n" +
                        "Hora de entrega: " + bebida.getHoraEntrega() + ":00 horas");

    }
}