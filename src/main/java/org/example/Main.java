package org.example;

import org.example.AnalisisOrganizacion.OrdenacionBusqueda;
import org.example.GestionDatosDinamicos.*;
import org.example.IndexacionYVisualizacion.*;
import org.example.MapasYAsociaciones.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n1. Lista de reales y pares enteros");
            System.out.println("2. Ordenacion y busqueda de ventas");
            System.out.println("3. Mapas y Asociaciones de datos");
            System.out.println("4. Indexacion y visualizacion de archivos");
            System.out.println("5. Salir");

            String opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    ListaDatos lista = new ListaDatos();

                    lista.addDatoReal(3.14);
                    lista.addDatoReal(2.71);
                    lista.addDatoReal(1.61);

                    lista.mostrarDatosReales();

                    lista.addParejaEntera(1, 2);
                    lista.addParejaEntera(3, 4);
                    lista.addParejaEntera(5, 6);

                    for (Pareja<Integer, Integer> pareja : lista.getDatosEnteros()) {
                        System.out.println(pareja);
                    }
                    break;
                case "2":
                    List<OrdenacionBusqueda> ventas = new ArrayList<>();
                    ventas.add(new OrdenacionBusqueda(100, "Producto 1"));
                    ventas.add(new OrdenacionBusqueda(200, "Producto 2"));
                    ventas.add(new OrdenacionBusqueda(50, "Producto 3"));
                    ventas.add(new OrdenacionBusqueda(150, "Producto 4"));

                    System.out.println("Lista de ventas sin ordenar:");
                    for (OrdenacionBusqueda venta : ventas) {
                        System.out.println(venta.getProducto() + ": " + venta.getPrecio());
                    }

                    ventas.sort((venta1, venta2) -> Double.compare(venta1.getPrecio(), venta2.getPrecio()));

                    System.out.println("Lista de ventas ordenada por precio:");
                    for (OrdenacionBusqueda venta : ventas) {
                        System.out.println(venta.getProducto() + ": " + venta.getPrecio());
                    }
                    break;
                case "3":
                    GestionRelaciones gestion = new GestionRelaciones();

                    gestion.addRelacion(1, "uno");
                    gestion.addRelacion(2, "dos");
                    gestion.addRelacion(3, "tres");
                    gestion.addRelacion(6, "hexagono");

                    System.out.println("El valor obtenido al buscar la clave 1 es: " + gestion.obtenerLetra(1));
                    System.out.println("El valor obtenido al buscar la clave 'hexagono' es: " + gestion.obtenerNumero("hexagono"));

                    gestion.mostrarRelacionesNumTexto();
                    gestion.mostrarRelacionesTextoNum();
                    break;
                case "4":
                    IndexacionRecursiva indexacion = new IndexacionRecursiva();
                    indexacion.indexarDirectorio(new java.io.File("C:\\Users\\Usuario\\Desktop\\Prueba"));
                    indexacion.listaArchivosOrdenada();
                    break;
                case "5":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        }
    }
}