import java.util.Scanner;

public class Main18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o salário:");
        double salario = sc.nextDouble();

        System.out.println("Digite o tempo de casa em anos:");
        int anos = sc.nextInt();

        double percentual;
        double bonus;

        if (anos < 1) {
            percentual = 0;
        } else if (anos <= 3) {
            percentual = 5;
        } else if (anos <= 10) {
            percentual = 10;
        } else {
            percentual = 15;
        }

        bonus = salario * percentual / 100;

        System.out.printf("Percentual do bônus: %.0f%%%n", percentual);
        System.out.printf("Valor do bônus: R$ %.2f%n", bonus);

        sc.close();
    }
}
