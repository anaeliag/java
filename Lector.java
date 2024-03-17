package modelo;
import java.util.Scanner;

public class Lector {

    private Scanner scanner = new Scanner(System.in);

    public void muestraMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public int leeEntrada(){
        return scanner.nextInt();
    }

    public Lector(String nombre){
        //super(nombre);
    }

    public Lector(){
        //super();
    }
}
