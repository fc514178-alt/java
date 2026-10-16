import java.util.Scanner;
public class Main35 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int[]votos = new int[11];

        int notas;

        int notamaisvotada = 0;

        for (int i = 0;i< votos.length;i++)
        {
            System.out.println("Digiter sua nota de (0 a 10):");
            notas = scanner.nextInt();

            if (notas>=0&&notas<=10)
            {
                votos[notas]++;
            }
            else
            {
                System.out.println("voto invalido tente novamente");

                i--;
            }

            for (int i1 = 0; i1 <= votos.length; i1++)
            {
                System.out.println("votos" + i +votos[i] + "votos(0 a 10)");

                if (votos[i] > votos[notamaisvotada])
                {
                    notamaisvotada=i;
                }
            }

            System.out.println("Nota mais votada:" + notamaisvotada);
            System.out.println("Quantidade de votos:" + votos[notamaisvotada]);
        }


    }
}
