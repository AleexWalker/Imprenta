import java.util.Scanner;

public class Imprenta55 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int tamaño;

        System.out.print("INTRODUZCA EL TAMAÑO DEL CUADRADO:");
        tamaño=teclado.nextInt();

        if (tamaño>=0&&tamaño<=50){
            for (int i=0;i<tamaño;i++){
                System.out.print("#");
            }
            System.out.println();
        }for (int i=0;i<tamaño-2;i++){
            System.out.print("#");
            for (int j=0;j<tamaño-2;j++){
                System.out.print(" ");
            }
            System.out.println("#");
        }
        for (int i=0;i<tamaño;i++){
            System.out.print("#");
        }
    }
}
