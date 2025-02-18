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

    public String lanzar() {
        return "Lanzando la pelota al perro";
    }

    public String lanzar1() {
        return "Jugando con la cuerda con el gato";
    }

    public static String Saludar() {
        return "Hola, que tal?";
    }

    // ***************************
}
