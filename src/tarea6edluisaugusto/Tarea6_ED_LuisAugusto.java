/*
 * Tarea6_ED_LuisAugusto.java
 * 
 * Descripción: Este archivo calcula el precio total de un producto aplicando descuentos.
 */
package tarea6edluisaugusto;

/**
 *
 * @author user
 */

/**
 * La clase Tarea6_ED_LuisAugusto contiene métodos para aplicar descuentos a productos y calcular el precio total.
 */
public class Tarea6_ED_LuisAugusto {

    private static final int MIN_CANT_PRODUCTOS_DESCUENTO = 3;
    private static final double DESCUENTO_CANTIDAD = 5;
    private static final double DESCUENTO_GENERAL = 0.8;
    private static final double DESCUENTO_PRODUCTO_CERO = 0.95;

    /**
     * Aplica un descuento al precio de un producto según la cantidad de
     * productos comprados.
     *
     * @param precioProducto El precio del producto.
     * @param numProductos La cantidad de productos comprados.
     */
    public void aplicarDescuento(double precioProducto, int numProductos) {
        double total;
        precioProducto = apicarDescuentoProducto(precioProducto, numProductos);
        total = calcularPrecio(precioProducto, numProductos);
        mostrarPrecio(total);

    }

    /**
     * Aplica un descuento al precio del producto según la cantidad comprada.
     *
     * @param precioProducto El precio del producto.
     * @param numProductos La cantidad de productos comprados.
     * @return El precio del producto con el descuento aplicado.
     */
    private double apicarDescuentoProducto(double precioProducto, int numProductos) {
        if (numProductos > MIN_CANT_PRODUCTOS_DESCUENTO) {
            precioProducto -= DESCUENTO_CANTIDAD;
        }
        return precioProducto;
    }

    /**
     * Calcula el precio total del producto aplicando descuentos.
     *
     * @param precioProducto El precio del producto.
     * @param numProductos La cantidad de productos comprados.
     * @return El precio total del producto con descuentos aplicados.
     */
    private double calcularPrecio(double precioProducto, int numProductos) {
        double total;
        if (numProductos != 0) {
            total = precioProducto * DESCUENTO_GENERAL;
        } else {
            total = precioProducto * DESCUENTO_PRODUCTO_CERO;
        }
        return total;
    }

    /**
     * Muestra el precio total del producto.
     *
     * @param total El precio total del producto.
     */
    private void mostrarPrecio(double total) {
        System.out.println("El total a pagar es: " + total);
        System.out.println("Enviado");

    }

}
