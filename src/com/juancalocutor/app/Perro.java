package com.juancalocutor.app;

public class Perro {

    private String nombrePerro, razaPerro, edadPerro;

    public Perro(String nombrePerro, String razaPerro, String edadPerro) {
        this.nombrePerro = nombrePerro;
        this.razaPerro = razaPerro;
        this.edadPerro = edadPerro;
    }

    public void detallesPerro() {
        System.out.println("Nombre del perro: " + nombrePerro +
                "\nRaza del perro: " + razaPerro +
                "\nEdad del perro: " + edadPerro);
    }
// **********************
}
