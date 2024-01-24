import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String [] option = {"Crear nueva lista de tareas","Ver listas de tareas","Ver tareas de lista","Actualizar lista de tareas","Eliminar lista de tarea"};
        System.out.println("1. Crear nueva lista de tareas");
        System.out.println("2. Ver listas de tareas");
        System.out.println("3. Ver tareas de lista");
        System.out.println("4. Actualizar lista de tareas");
        System.out.println("5. Eliminar lista de tareas");
        System.out.println("*******************************************************************************************************************************");
        Scanner sc=new Scanner(System.in);
        System.out.println("Elige una opcion:");
        int id = sc.nextInt();

        switch (id){
            case 1:
                System.out.println("La opcion seleccionada es: " + id + ". "+option[0]);
                System.out.println("En Construccion");
                break;
            case 2:
                System.out.println("La opcion seleccionada es: " + id + ". "+option[1]);
                System.out.println("En Construccion");
                break;
            case 3:
                System.out.println("La opcion seleccionada es: " + id + ". "+option[2]);
                System.out.println("En Construccion");
                break;
            case 4:
                System.out.println("La opcion seleccionada es: " + id + ". "+option[3]);
                System.out.println("En Construccion");
                break;
            case 5:
                System.out.println("La opcion seleccionada es: " + id + ". "+option[4]);
                System.out.println("En Construccion");
                break;
            default:
                System.out.println("Opcion invalida, elige de nuevo");
        }
    }
}
