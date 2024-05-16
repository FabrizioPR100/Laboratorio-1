/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenes;

/**
 *
 * @author net1
 */
// Clase Ordenes
public class Ordenes {
    private static int contadorID = 0;
    private int idOrden;
    private Producto[] productos;
    private int cuentaProducto;

    public Ordenes() {
        this.idOrden = ++contadorID;
        this.productos = new Producto[10];
        this.cuentaProducto = 0;
    }

    public void agregarProducto(Producto producto) {
        if (cuentaProducto < 10) {
            productos[cuentaProducto++] = producto;
        } else {
            System.out.println("La orden está llena, no se pueden agregar más productos.");
        }
    }

    public double calcularTotalOrden() {
        double total = 0;
        for (int i = 0; i < cuentaProducto; i++) {
            total += productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden() {
        System.out.println("Orden #" + idOrden);
        for (int i = 0; i < cuentaProducto; i++) {
            System.out.println(productos[i]);
        }
        System.out.println("Total: $" + calcularTotalOrden());
    }
}
