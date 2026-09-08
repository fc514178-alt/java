import java.util.Scanner;
public class Main25 {
     static void main() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            // Exibe o menu de opções
            System.out.println("\n--- MENU DE OPÇÕES ---");
            System.out.println("1 - Dobro");
            System.out.println("2 - Metade");
            System.out.println("3 - Quadrado");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();


        switch (opcao) {
         case 1:
                System.out.println("digite um numero");
                double num1 =scanner.nextDouble();
              System.out.println("O dobro de " + num1 + " é: " + (num1 * 2));
                break;
            case 2:
                System.out.println("digite um numero");
                double num2 = scanner.nextDouble();
                System.out.println("A metade do"+num2+"é"+(num2/2));
                break;
            case 3:
                System.out.println("digite um numero");
                double num3 = scanner.nextDouble();
                System.out.println("O quadrado do"+ num3+"é"+Math.pow(num3, 2));
                break;

            case 0:
                System.out.println("Programa encerrado. Até mais!");
                break;

            default:
                System.out.println("inválidas");

        }
    }while (opcao!=0);

            scanner.close();

    }


}
