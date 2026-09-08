import java.util.Scanner;
public class Main27 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("me de um numero inteiro nao negativo:");
        int numero= scanner.nextInt();

        if (numero < 0) {
            System.out.println("Entrada inválida.");
        } else {
            // Acumulador iniciado em 1
            long acumulador = 1;

            // Se o número for 0, o loop não roda e o acumulador mantém o valor 1
            for (int i = 1; i <= numero; i++) {
                acumulador *= i;
            }

            System.out.println("O fatorial de " + numero + " é " + acumulador);
        }

        scanner.close();
        }
    }

