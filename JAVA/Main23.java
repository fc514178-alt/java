import java.util.Scanner;

public class Main23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;

        // Lendo a primeira nota
        System.out.print("Digite uma nota entre 0 e 10: ");
        nota = scanner.nextDouble();

        // Enquanto a nota for menor que 0 OU maior que 10, repete a leitura
        while (nota < 0 || nota > 10) {
            System.out.println("Valor inválido!");
            System.out.print("Digite novamente a nota (deve estar entre 0 e 10): ");
            nota = scanner.nextDouble();
        }

        // Imprime a nota aceita após sair do laço
        System.out.println("Nota aceita: " + nota);

        scanner.close();
    }
}