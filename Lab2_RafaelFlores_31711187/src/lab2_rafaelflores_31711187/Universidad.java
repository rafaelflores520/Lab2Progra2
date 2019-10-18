/*
    Clase Universidad
 */
package lab2_rafaelflores_31711187;

public class Universidad {
    private String nombre, nombreRector, sucursal, nivel;
    private int añoCreacion, numMaestro, numEstudiante; 
    private float costo;

    public Universidad(String nombre, String nombreRector, String sucursal, String nivel, int añoCreacion, int numMaestro, int numEstudiante, float costo) {
        this.nombre = nombre;
        this.nombreRector = nombreRector;
        this.sucursal = sucursal;
        this.nivel = nivel;
        this.añoCreacion = añoCreacion;
        this.numMaestro = numMaestro;
        this.numEstudiante = numEstudiante;
        this.costo = costo;
    }
    
    public Universidad(){}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNombreRector(String nombreRector) {
        this.nombreRector = nombreRector;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public void setAñoCreacion(int añoCreacion) {
        this.añoCreacion = añoCreacion;
    }

    public void setNumMaestro(int numMaestro) {
        this.numMaestro = numMaestro;
    }

    public void setNumEstudiante(int numEstudiante) {
        this.numEstudiante = numEstudiante;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreRector() {
        return nombreRector;
    }

    public String getSucursal() {
        return sucursal;
    }

    public String getNivel() {
        return nivel;
    }

    public int getAñoCreacion() {
        return añoCreacion;
    }

    public int getNumMaestro() {
        return numMaestro;
    }

    public int getNumEstudiante() {
        return numEstudiante;
    }

    public float getCosto() {
        return costo;
    }
    
    @Override
    public String toString(){
        return "| "+this.getNombre()+" | "+this.getNombreRector()+" | "+this.getSucursal()+" | "+this.getAñoCreacion()+" | "+this.getNumMaestro()+" | "+this.getNumEstudiante()+" | "+this.getCosto()+" | "+this.getNivel()+" |";
    }
}
    