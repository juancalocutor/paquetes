package com.juancalocutor.app.hogar;

public class Persona {

    private String nombrePersona, apellidoPersona, edadPersona;

    public Persona(String nombrePersona, String apellidoPersona, String edadPersona) {
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
        this.edadPersona = edadPersona;
    }

    public void detallesPersona() {
        System.out.println("Nombre de la persona: " + nombrePersona +
                "\napellido: " + apellidoPersona +
                "\nEdad: " + edadPersona);
    }

// ***************************
}
