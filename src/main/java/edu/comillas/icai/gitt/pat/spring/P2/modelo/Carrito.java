package edu.comillas.icai.gitt.pat.spring.P2.modelo;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class Carrito {
    @Positive(message = "El ID de carrito debe ser mayor que 0")
    private int idCarrito;

    @Positive(message = "El ID de artículo debe ser mayor que 0")
    private int idArticulo;

    @NotBlank(message = "La descripción no puede estar vacía")
    private String descripcion;

    @Min(value = 1, message = "Debe haber al menos 1 unidad")
    private int unidades;

    @Positive(message = "El precio debe ser mayor que 0")
    private double precioFinal;

    public Carrito(int idCarrito, int idArticulo, String descripcion, int unidades, double precioFinal) {
        this.idCarrito = idCarrito;
        this.idArticulo = idArticulo;
        this.descripcion = descripcion;
        this.unidades = unidades;
        this.precioFinal = precioFinal;
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


