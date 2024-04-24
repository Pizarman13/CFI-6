package org.example.AnalisisOrganizacion;

public class OrdenacionBusqueda {

    private double precio;
    private String producto;

    public OrdenacionBusqueda(double precio, String producto) {
        this.precio = precio;
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public String getProducto() {
        return producto;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

}
