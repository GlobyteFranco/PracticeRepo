package com.example;
import java.util.List;

public class Bicicleta {
    private int numero;
    private int precio;
    private List<Parte> listaPartes;

    
    public Bicicleta(int numero, List<Parte> listaPartes) {
        this.numero = numero;
        this.listaPartes = listaPartes;
        this.precio = calcularPrecio();
    }


    private int calcularPrecio(){
        int acumulador = 0;
        for (var a : listaPartes){
            acumulador += a.getPrecioOferta();
        }
        return acumulador;
    }


    public int getPrecio() {
        return precio;
    }
}