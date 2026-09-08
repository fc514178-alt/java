import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a velocidade máxima da via:");
        double limite = sc.nextDouble();

        System.out.println("Digite a velocidade do veículo:");
        double velocidade = sc.nextDouble();

        double percentual = ((velocidade - limite) / limite) * 100;

        if (velocidade <= limite) {
            System.out.println("Dentro do limite. Não há multa.");
        } else if (percentual <= 20) {
            System.out.println("Infração média.");
        } else if (percentual <= 50) {
            System.out.println("Infração grave.");
        } else {
            System.out.println("Infração gravíssima.");
        }

        sc.close();
    }
}
