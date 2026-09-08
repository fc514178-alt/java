import java.util.Scanner;
public class Main30 {
    static void main() {


        Scanner scanner = new Scanner(System.in);
        System.out.println("me de um numero de 1 a 9 :");
       int numero = scanner.nextInt();

       if (numero<=0||numero>9){
           System.out.println("valor invalido");
           return;
       }
       else {
           for (int i = 1; i <= numero; i++) {
               System.out.println("a tabuada de  " + i + ":");
               for (int j = 1; j <= 10; j++) {
                   System.out.println(i + " x " + j + " = " + (i * j));
               }
               if (i<numero){
                   System.out.println();
               }
           }

       }
        scanner.close();

    }
}
