import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius:");
        double temperatura = sc.nextDouble();

        System.out.println("Digite a umidade relativa do ar (%):");
        double umidade = sc.nextDouble();

        if (temperatura >= 38) {
            System.out.println("Alerta de calor extremo");
        }

        if (umidade < 30) {
            System.out.println("Alerta de umidade baixa");
        }

        if (temperatura >= 35 && umidade < 20) {
            System.out.println("Alerta de risco de queimada");
        }

        sc.close();
    }
}