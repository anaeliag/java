import modelo.Tarea;

import java.net.FileNameMap;
import java.time.LocalDate;
import java.util.*;

public class ListaTareas {

    public String nombre;
    private final Date fechaCreacion=null;

   // {
     //   Date fechaCreacion = Calendar.getInstance().getTime(); //ya no se necesita por locatdate
   // }

    public ListaTareas (String nombre) {
        this.setnombre(nombre); //Colocar un constructor para esta clase que reciba el nombre de la lista de tareas.
    }

    public String getnombre(){
        return nombre;
    }

    public void setnombre(String nombre){
        this.nombre = nombre;
    }

    public Date getfechaCreacion(){
        return fechaCreacion;
    }

    public void addTarea(Tarea nombre){
        List<Tarea> tareas = new ArrayList<>();
        tareas.add(nombre);
    }

    public void removeTarea(String name){
        List<Tarea> quitarTarea = new ArrayList<>();
        quitarTarea.remove(nombre);
    }

    public void imprimirTareas(List tareas) {
        System.out.println(Arrays.toString(tareas.toArray()));
        //for (String tarea : tareas) {
        //    System.out.println(tarea);
        //}
    }
}
