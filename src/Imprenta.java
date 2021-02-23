import java.util.Scanner;

public class Imprenta {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int tamaño;
        int fila;
        int columna;

        System.out.print("INTRODUZCA EL TAMAÑO DEL DIBUJO:");
        tamaño= teclado.nextInt();

        for(fila=1;fila<=tamaño;fila++){

            for (columna=1;columna<=fila;columna++){
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
