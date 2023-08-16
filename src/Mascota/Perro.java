package Mascota;

public class Perro {
    private String nombre;
    private String raza;
    private int edad;
    private int tamanio;



    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, int tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", edad=" + edad +
                ", tamanio=" + tamanio +
                '}';
    }
}
