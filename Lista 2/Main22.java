import java.util.Scanner;
public class Main22 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("qual seu nome");
        String aluno = sc.nextLine();

        System.out.println("qual foi sua frequencia (%):");
        double frequencia = sc.nextInt();
        if (frequencia<=75) {
            System.out.println("o aluno está reprovado por falta e a média não deve ser avaliada");
        }  else {
            System.out.println("qual foi sua media Final");
            float mediafinal = sc.nextFloat();

            if (mediafinal >= 7)
            {
                System.out.println("aprovado");
            } else if (mediafinal>=5 && mediafinal<7) {
                System.out.println("recuperaçao");


                }
                else {
                    System.out.println("reprovado");
            }
        }





    }
}
