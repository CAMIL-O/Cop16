package model; 


public class Ruta {
    private String nombre;
    private String puntoEncuentro;
    private String horaInicio;
    private String horaFin;
    private String cantParticipantes;
    private String cantGuides; 
    private double temperatura;
    private double humedad;

    public Ruta(String nombre, String puntoEncuentro, String horaInicio, String horaFin,  String cantParticipantes, String cantGuides, double temperatura, double humedad) {
        this.nombre = nombre;
        this.puntoEncuentro = puntoEncuentro;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.cantParticipantes = cantParticipantes
        this.cantGuides = cantGuides
        this.temperatura = temperatura
        this.humedad = humedad
    }
}