import java.util.Scanner;

public class Imprenta5 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int tamaño;
        int fila;
        int columna;

        System.out.print("INTRODUZCA EL TAMAÑO DEL CUADRADO:");
        tamaño=teclado.nextInt();

        if (tamaño>=0&&tamaño<=50){
            for (fila=0;fila<tamaño;fila++){
                System.out.print("#");
            }
            System.out.println();
        }for (fila=0;fila<tamaño-2;fila++){
            System.out.print("#");
            for (columna=0;columna<tamaño-2;columna++){
                System.out.print(" ");
            }
            System.out.println("#");
        }
        for (fila=0;fila<tamaño;fila++){
            System.out.print("#");
        }
    }
}
