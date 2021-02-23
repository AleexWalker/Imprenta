import java.util.Scanner;

public class imprenta3 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int tamaño;
        int fila;
        int columna;
        int contador;

        System.out.print("INTRODUZCA EL TAMAÑO DEL DIBUJO:");
        tamaño= teclado.nextInt();

        for(fila=1;fila<=tamaño;fila++){
            for (columna=tamaño;columna>=fila;columna--){
                System.out.print("#");
            }
            System.out.println("");
            for (contador=1;contador<=fila;contador++)
                System.out.print(" ");
        }
    }
}
