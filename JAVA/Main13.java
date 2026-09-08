import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int numero1 = sc.nextInt();

        System.out.println("Digite o segundo número:");
        int numero2 = sc.nextInt();

        if (numero2 == 0) {
            System.out.println("A verificação não pode ser feita.");
        } else if (numero1 % numero2 == 0) {
            System.out.println("O primeiro número é múltiplo do segundo.");
        } else {
            System.out.println("O primeiro número não é múltiplo do segundo.");
        }

        sc.close();
    }
}
