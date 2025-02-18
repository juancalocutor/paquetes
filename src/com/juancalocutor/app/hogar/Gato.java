package com.juancalocutor.app.hogar;

public class Gato {

    private String nombreGato, razaGato, edadGato;

    public Gato(String nombreGato, String razaGato, String edadGato) {
        this.nombreGato = nombreGato;
        this.razaGato = razaGato;
        this.edadGato = edadGato;
    }

    public void detallesGato() {
        System.out.println("Nombre del gato: " + nombreGato +
                "\nRaza del gato: " + razaGato +
                "\nEdad del gato: " + edadGato);
    }

    public String jugar1(Persona persona) {
        return persona.lanzar1();
    }

    // **********************************
}
