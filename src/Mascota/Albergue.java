package Mascota;

import java.util.ArrayList;
import java.util.Scanner;

public class Albergue {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Persona> clientes = new ArrayList<>();
    private ArrayList<Perro>  perritos = new ArrayList<>();

    public Albergue() {
        Persona p1 = new Persona("Jorge", "Peroza", "123", 36);
        Persona p2 = new Persona("Juan", "Sierra", "456", 25);
        Persona p3 = new Persona("Lilia", "Gómez", "999", 28);

        Perro perrito1 = new Perro("Loki", "Huski", 6, 40);
        Perro perrito2 = new Perro("Poppi", "Pastor belga", 3, 60);
        Perro perrito3 = new Perro("Holly", "pitbull", 1, 80);

        crearPersona(p1);
        crearPersona(p2);
        crearPersona(p3);

        crearPerrito(perrito1);
        crearPerrito(perrito2);
        crearPerrito(perrito3);
        System.out.println(this);
        adoptar(p2);
        System.out.println(this);

    }

    public void crearPersona(Persona p){
        clientes.add(p);
    }
    private  void  crearPerrito(Perro perrito){
        perritos.add(perrito);

    }


    public void adoptar(Persona p){
        System.out.print("Ingrese el nombre del perrito: ");
        String name = leer.nextLine();
        boolean bandera = true;
        for (int i = 0; i < perritos.size() ; i++) {
            if(perritos.get(i).getNombre().equalsIgnoreCase(name))
            {
                p.agregarMascota(perritos.get(i));
                perritos.remove(i);
                bandera= false;

            }

        }
        if(bandera)
            System.out.println("No hay un perrito con ese nombre");


    }


    @Override
    public String toString() {
        String x = "";

        for (Persona p: clientes) {
            x  = x + p + "\n" ;

        }

        for (Perro perrito: perritos) {
            x  = x + perrito + "\n" ;

        }

        return x;
    }


}
