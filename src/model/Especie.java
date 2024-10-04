package model;




class Especie {
    private String nombre;
    private String tipo;  // Flora o Fauna
    private String rutaFoto;
    private int cantidadEjemplares;

    public Especie(String nombre, String tipo, String rutaFoto, int cantidadEjemplares) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.rutaFoto = rutaFoto;
        this.cantidadEjemplares = cantidadEjemplares;
    }
}