import java.util.Scanner;
public class Main31 {static void main(){
    Scanner scanner = new Scanner(System.in);

    String[]diasdasemana = {"segunda","terça","quarta","quinta","sexta","sabado","domingo"};
    double total = 0;
    double[]totalfaturamento = new double [7];

    for(int i = 0; i < 7;i++)
    {
        System.out.println("total do faturamneto do dia:" +(i+1));
        totalfaturamento[i] = scanner.nextDouble();
        total+=totalfaturamento[i];
    }
    double maior = totalfaturamento[0];
    int Diamaior = 0;

    for(int i = 0; i < 7; i++)
    {
        if (totalfaturamento[i]>maior)
        {
            maior = totalfaturamento[i];
            Diamaior = i;
        }
    }

    double media = total/7;

    System.out.println("total:" + total);
    System.out.println("media:" + media);
    System.out.println("dia da semana:" + diasdasemana);
}

}
