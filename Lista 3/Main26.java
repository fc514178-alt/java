import java.util.Scanner;
public class Main26 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero:");
        int A = scanner.nextInt();
        System.out.println("me de outro numero");
        int B = scanner.nextInt();
        int inicio =Math.min(A, B);
        int fim = Math.max(A,B);

        int soma = 0;
        for (int i = inicio; i <= fim; i++){
            if (i%2==0);
            soma+=i;
            if(A>B){
                System.out.println("intervalo é inválido.");
            }
        }
        System.out.println("A soma dos números pares no intervalo é:"+ soma);

        scanner.close();
    }
}
