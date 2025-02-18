package com.juancalocutor.app.jardin;

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
        String jugar = perro1.jugando(persona1);
        System.out.println("Jugando " + jugar);
        System.out.println();
        perro1.detallesPerro();
        System.out.println();

    //******************
    }
}
