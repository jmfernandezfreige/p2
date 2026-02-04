package edu.comillas.icai.gitt.pat.spring.P2.modelo;

public class Carrito {
    private int idCarrito;
    private int idArticulo;
    private String descripcion;
    private int unidades;
    private double precioFinal;

    public Carrito(double precioFinal, int unidades, String descripcion, int idCarrito, int idArticulo) {
        this.precioFinal = precioFinal;
        this.unidades = unidades;
        this.descripcion = descripcion;
        this.idCarrito = idCarrito;
        this.idArticulo = idArticulo;
    }

    public int getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(int idCarrito) {
        this.idCarrito = idCarrito;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }
}


