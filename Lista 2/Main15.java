import java.util.Scanner;
public class Main15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da compra:");
        double compra = sc.nextDouble();

        double frete;

        if (compra >= 199.00) {
            frete = 0.00;
        } else {
            frete = 24.90;
        }

        double total = compra + frete;

        System.out.printf("Valor do frete: R$ %.2f%n", frete);
        System.out.printf("Total a pagar: R$ %.2f%n", total);

        sc.close();
    }
}
