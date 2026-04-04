package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Parte parte1 = new Parte(1, 50, "Pedales (pedals): Elementos donde el ciclista apoya los pies para transmitir fuerza al sistema de transmisión.", false);
        Parte parte2 = new Parte(2, 50, null, true);
        Parte parte5 = new Parte(2, 50, null, true);
        Parte parte3 = new Parte(3, 50, null, false);

        Parte parte9 = new Parte(3, 50, null, false);
        Parte parte4 = new Parte(4, 50, null, false);

        List<Parte> lista1 = new ArrayList<>();
        lista1.add(parte1);
        lista1.add(parte2);

        List<Parte> lista2 = new ArrayList<>();
        lista2.add(parte3);
        lista2.add(parte4);

        Bicicleta bici1 = new Bicicleta(1, lista1);
        Bicicleta bici2 = new Bicicleta(1, lista2);
        
        System.out.println( bici1.getPrecio() );
        System.out.println( bici2.getPrecio() );
    }
}
