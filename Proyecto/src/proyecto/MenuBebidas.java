/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package proyecto;

/**
 *
 * @author tamar
 */
public enum MenuBebidas {
    CAFE_NORMAL("Café Normal"),
    CAPUCHINO("Capuchino"),
    CAPUCHINO_VAINILLA("Capuchino con Vainilla"),
    CHOCOLATE("Chocolate"),
    MOKA("Moka"),
    TE_CHAI("Té Chai"),
    CAFE_FRIO("Café Frío");

    private String nombre;

    MenuBebidas(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

