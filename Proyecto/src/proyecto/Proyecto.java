/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author tamar
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Solicitar información del empleado
        String idEmpleadoStr = JOptionPane.showInputDialog("Ingrese el ID del empleado:");
        int idEmpleado = Integer.parseInt(idEmpleadoStr);
        String nombreEmpleado = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
        
        // Crear objeto Empleado con los datos ingresados
        Empleado empleado = new Empleado(idEmpleado, nombreEmpleado);
        
        PedidoBebida sistemaPedidos = new PedidoBebida();

        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Sistema de Pedidos de Bebidas\n" +
                    "1. Realizar pedido\n" +
                    "2. Salir\n" +
                    "Seleccione una opción:"));
            
            switch (opcion) {
                case 1 -> sistemaPedidos.realizarPedido(empleado);
                case 2 -> JOptionPane.showMessageDialog(null, "Saliendo del sistema.");
                default -> JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        } while (opcion != 2);
    }
}

