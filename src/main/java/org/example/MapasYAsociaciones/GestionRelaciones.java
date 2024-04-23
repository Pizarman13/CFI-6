package org.example.MapasYAsociaciones;

import java.util.HashMap;
import java.util.Map;

public class GestionRelaciones {

    private Map<Integer, String> relacionNumTexto;
    private Map<String, Integer> relacionTextoNum;

    public GestionRelaciones() {
        relacionNumTexto = new HashMap<>();
        relacionTextoNum = new HashMap<>();
    }

    public void addRelacion(int num, String texto) {
        relacionNumTexto.put(num, texto);
        relacionTextoNum.put(texto, num);
    }

    public void mostrarRelacionesNumTexto() {
        System.out.println("Relaciones num -> texto");
        for (Map.Entry<Integer, String> relacion : relacionNumTexto.entrySet()) {
            System.out.println(relacion.getKey() + " -> " + relacion.getValue());
        }
    }

    public void mostrarRelacionesTextoNum() {
        System.out.println("Relaciones texto -> num");
        for (Map.Entry<String, Integer> relacion : relacionTextoNum.entrySet()) {
            System.out.println(relacion.getKey() + " -> " + relacion.getValue());
        }
    }
}
