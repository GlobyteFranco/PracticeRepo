package com.example;

public class Parte {
    private int numero;
    private double precio;
    private String descripcion;
    private boolean oferta;
    final private double descuento = 0.8; //20% descuento

    public Parte(int numero, double precio, String descripcion, boolean oferta) {
        this.numero = numero;
        this.precio = precio;
        this.descripcion = descripcion;
        this.oferta = oferta;
    }

    public int getNumero() {
        return numero;
    }

    public double getPrecio() {
        return precio;
    }

    public double getPrecioOferta() {
        return oferta ? precio*descuento : precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isOferta() {
        return oferta;
    }
    
}
