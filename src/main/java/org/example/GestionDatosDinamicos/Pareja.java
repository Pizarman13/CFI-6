package org.example.GestionDatosDinamicos;

public class Pareja<A, B> {

    private A primero;
    private B segundo;

    public Pareja(A primero, B segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    public A getPrimero() {
        return primero;
    }

    public B getSegundo() {
        return segundo;
    }

    public void setPrimero(A primero) {
        this.primero = primero;
    }

    public void setSegundo(B segundo) {
        this.segundo = segundo;
    }
}
