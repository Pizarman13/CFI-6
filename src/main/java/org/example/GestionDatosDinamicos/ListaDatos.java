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

    public void addDatoEntero(int dato1, int dato2) {
        datosEnteros.add(new Pareja<>(dato1, dato2));
    }

    public void eliminarDatoReal(Double dato) {
        datosReales.remove(dato);
    }

    public void eliminarDatoEntero(Pareja<Integer, Integer> dato) {
        datosEnteros.remove(dato);
    }
    

}
