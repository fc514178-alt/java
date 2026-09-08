import java.util.Scanner;

public class Main21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo o número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Inicializando o contador da tabuada
        int contador = 0;

        // Loop while para imprimir a tabuada de 1 a 10
        while (contador <= 10) {
            int resultado = numero * contador;
            System.out.println(numero + " x " + contador + " = " + resultado);
            contador++; // Incrementa o contador para evitar loop infinito
        }

        scanner.close();
    }
}
