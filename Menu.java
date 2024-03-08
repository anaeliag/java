public class Menu {
    public static void main(String[] args) {
        Lector info = new Lector();

        while(true) {
            System.out.println("1. Crear nueva lista de tareas");
            System.out.println("2. Ver listas de tareas");
            System.out.println("3. Ver tareas de lista");
            System.out.println("4. Actualizar lista de tareas");
            System.out.println("5. Eliminar lista de tareas");
            System.out.println("6. Salir");

            info.muestraMensaje("Elige una opcion del menu: ");
            int opcion = info.leeEntrada();

            switch (opcion){
                case 1:
                    System.out.println("La opcion seleccionada es: " + opcion +"crearListaDeTareas");
                    ListasTareas crearLista = new ListasTareas();
                    crearLista.crearListaDeTareas();
                    break;
                case 2:
                    System.out.println("La opcion seleccionada es: " + opcion+"verListaDeTareas");
                    ListasTareas verLista = new ListasTareas();
                    verLista.verListaDeTareas();
                    break;
                case 3:
                    System.out.println("La opcion seleccionada es: " + opcion+"verTareasDeLista");
                    ListasTareas verTareas = new ListasTareas();
                    verTareas.verTareasDeLista();
                    break;
                case 4:
                    System.out.println("La opcion seleccionada es: " + opcion+"actualizarListaDeTareas");
                    ListasTareas actualizarLista = new ListasTareas();
                    actualizarLista.actualizarListaDeTareas();
                    break;
                case 5:
                    System.out.println("La opcion seleccionada es: " + opcion+"eliminarListaDeTareas");
                    ListasTareas eliminarLista = new ListasTareas();
                    eliminarLista.eliminarListaDeTareas();
                    break;
                case 6:
                    System.out.println("La opcion seleccionada es: " + opcion+" salir");
                    ListasTareas salirmethod = new ListasTareas();
                    salirmethod.salir();
                    break;
                default:
                    System.out.println("Opcion invalida, elige de nuevo");
            }
        }
    }
}
