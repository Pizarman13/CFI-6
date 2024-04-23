package org.example;

import org.example.GestionDatosDinamicos.*;
import org.example.IndexacionYVisualizacion.*;
import org.example.MapasYAsociaciones.*;


public class Main {
    public static void main(String[] args) {

        ListaDatos lista = new ListaDatos();

        lista.addDatoReal(3.14);
        lista.addDatoReal(2.71);

        lista.addParejaEntera(1, 2);
        lista.addParejaEntera(3, 4);

        lista.mostrarDatosReales();

        for (Pareja<Integer, Integer> pareja : lista.getDatosEnteros()) {
            System.out.println(pareja);
        }

        //Mapas
        GestionRelaciones gestion = new GestionRelaciones();

        gestion.addRelacion(1, "uno");
        gestion.addRelacion(2, "dos");
        gestion.addRelacion(3, "tres");
        gestion.addRelacion(6, "hexagono");

        System.out.println("El valor obtenido al buscar la clave 1 es: " + gestion.obtenerLetra(1));
        System.out.println("El valor obtenido al buscar la clave 'hexagono' es: " + gestion.obtenerNumero("hexagono"));

        gestion.mostrarRelacionesNumTexto();
        gestion.mostrarRelacionesTextoNum();

        //indexacion y visualizacion
        IndexacionRecursiva indexacion = new IndexacionRecursiva();
        indexacion.indexarDirectorio(new java.io.File("C:\\Users\\Usuario\\Desktop\\prueba"));
        indexacion.listaArchivosOrdenada();
    }
}