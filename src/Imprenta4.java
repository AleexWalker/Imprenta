import java.util.Scanner;

public class Imprenta4 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int tamaño;
        int fila;
        int columna;
        int contador;

        System.out.print("INTRODUZCA EL TAMAÑO DEL DIBUJO:");
        tamaño= teclado.nextInt();

        for(fila=1;fila<=tamaño;fila++){
            for (contador=tamaño;contador>=fila;contador--)
                System.out.print(" ");
            for (columna=1;columna<=fila;columna++){
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
