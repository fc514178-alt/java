import java.util.Scanner;
public class Main11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("É positivo");
        }

        if (numero % 2 == 0) {
            System.out.println("É par");
        }

        if (numero % 5 == 0) {
            System.out.println("É múltiplo de 5");
        }

        int modulo = Math.abs(numero);

        if (modulo >= 10 && modulo <= 99) {
            System.out.println("Tem dois dígitos");
        }

        sc.close();
    }
}

