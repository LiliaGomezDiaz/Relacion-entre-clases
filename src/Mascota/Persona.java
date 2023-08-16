package Mascota;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String apellido;
    private String documento;
    private int edad;
    private ArrayList<Perro>  mascota= new ArrayList<>();

    public Persona() {
    }

    public Persona(String nombre, String apellido, String documento, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.edad = edad;
    }


    public void agregarMascota(Perro p) {
       mascota.add(p);
    }


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", documento='" + documento + '\'' +
                ", edad=" + edad +
                ", mascota" + mascota +
                '}';
    }
}
