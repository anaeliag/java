package modelo;

import modelo.Tarea;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListasTareas extends modelo.ListaTareas{

    public ListasTareas(String name, Date fechaCreacion, Date fechaExpiracion, Date Realizada, Date fechaRealizacion) {
        super(name, fechaCreacion, fechaExpiracion, Realizada, fechaRealizacion);
    }


    public void crearListaDeTareas(){
            System.out.println("En Construccion");
        //ListaTareas crearlista = new ListaTareas();
        //crearlista.addTarea();
        //List<ListaTareas> listtarea=new ArrayList<ListaTareas>();
        //System.out.println(listtarea);
    }

    public void verListaDeTareas(){
        System.out.println("En Construccion");
    }

    public void verTareasDeLista(){
        //System.out.println("En Construccion");
    }

    public void actualizarListaDeTareas(){
        System.out.println("En Construccion");
    }

    public void eliminarListaDeTareas(){
        System.out.println("En Construccion");
    }

    public void salir(){
        System.out.println("Adios");
        System.exit(0);
    }

}
