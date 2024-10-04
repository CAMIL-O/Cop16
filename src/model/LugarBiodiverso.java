
package model; 



public class LugarBiodiverso {
    private String nombre;
    private String departamento;
    private double area;
    private String rutaFoto;
    private Date fechaInauguracion;
    private Comunidad comunidad;
    private double recursos; 
    private ArrayList<Especie> especies;

    public LugarBiodiverso(String nombre, String departamento, double area, String rutaFoto, Date fechaInauguracion, Comunidad comunidad, double recursos) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.area = area;
        this.rutaFoto = rutaFoto;
        this.fechaInauguracion = fechaInauguracion;
        this.comunidad = comunidad;
        this.recursos = recursos
        this.especies = new ArrayList<>();
    }
}