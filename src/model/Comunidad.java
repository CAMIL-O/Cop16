package model;


public class Comunidad {
    private String nombre;
    private String tipo;  // Afrocolombiana, Indígena, Raizal, etc.
    private String representante;
    private String celularRepresentante;
    private int habitantes;
    private String problemas;  // Falta de hospital, escuela, agua potable, etc.

    public Comunidad(String nombre, String tipo, String representante, String celularRepresentante, int habitantes, String problemas) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.representante = representante;
        this.celularRepresentante = celularRepresentante;
        this.habitantes = habitantes;
        this.problemas = problemas;
    }
}

