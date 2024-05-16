/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenes;

/**
 *
 * @author net1
 */
// Clase Main para probar el sistema
public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Camisa", 500);
        Producto producto2 = new Producto("Pantalon", 800);

        Ordenes orden = new Ordenes();
        orden.agregarProducto(producto1);
        orden.agregarProducto(producto2);

        orden.mostrarOrden();
    }
}