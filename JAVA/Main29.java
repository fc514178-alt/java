import java.util.Scanner;
public class Main29 {
    static void main() {


        int acumuladordevaloreslidos = 0;
        int soma = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        Scanner scanner = new Scanner(System.in);
        System.out.println("me de um numero");
        int numero = scanner.nextInt();



        if(numero==0){
            System.out.println("encerrar leitura");
        }
        else {
                while (numero!=0){
                    acumuladordevaloreslidos++;
                    soma+=numero;
                    if (numero>maior){
                        maior=numero;
                    }
                    if (numero<menor){
                        menor=numero;
                    }
                    System.out.print("Digite o próximo valor inteiro (0 para sair): ");
                    numero = scanner.nextInt();
            }


            }
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Quantidade de valores lidos: " + acumuladordevaloreslidos);
        System.out.println("Soma dos valores: " + soma);
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
     }

    }

