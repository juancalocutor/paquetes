package com.juancalocutor.app;

import com.juancalocutor.app.hogar.*;

public class EjemploPaquetes {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Juan Carlos", "Gutierrez", "49 años");
        Gato Gato1 = new Gato("Aegon", "Gris tigre", "7 años");
        Perro perro1 = new Perro("Gaia", "Labrador", "7 años");

        System.out.println();

        Gato1.detallesGato();
        System.out.println();
        persona1.detallesPersona();
        System.out.println();
        perro1.detallesPerro();
        System.out.println();

    //******************
    }
}
