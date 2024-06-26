package org.example.GestionDatosDinamicos;

import java.util.ArrayList;
import java.util.List;
public class ListaDatos {

    private List<Double> datosReales;
    private List<Pareja<Integer, Integer>> datosEnteros;

    public ListaDatos() {
        datosReales = new ArrayList<>();
        datosEnteros = new ArrayList<>();
    }

    public void addDatoReal(double dato) {
        datosReales.add(dato);
    }

    public void addParejaEntera(int primero, int segundo) {
        Pareja<Integer, Integer> pareja = new Pareja<>(primero, segundo);
        datosEnteros.add(pareja);
    }


    public void eliminarDatoReal(Double dato) {
        datosReales.remove(dato);
    }

    public void eliminarDatoEntero(Pareja<Integer, Integer> dato) {
        datosEnteros.remove(dato);
    }

    public void modidicarDatoReal(int posicion, double dato) {
        datosReales.set(posicion, dato);
    }

    public void modificarDatoEntero(int posicion, Pareja<Integer, Integer> dato) {
        datosEnteros.set(posicion, dato);
    }

    public List<Double> getDatosReales() {
        return datosReales;
    }

    public List<Pareja<Integer, Integer>> getDatosEnteros() {
        return datosEnteros;
    }

    public void setDatosReales(List<Double> datosReales) {
        this.datosReales = datosReales;
    }

    public void setDatosEnteros(List<Pareja<Integer, Integer>> datosEnteros) {
        this.datosEnteros = datosEnteros;
    }

    public void mostrarDatosReales() {
        for (Double dato : datosReales) {
            System.out.println(dato);
        }
    }

    public void mostrarDatosEnteros() {
        for (Pareja<Integer, Integer> dato : datosEnteros) {
            System.out.println(dato);
        }
    }

    public void mostrarDatos() {
        mostrarDatosReales();
        mostrarDatosEnteros();
    }

}
