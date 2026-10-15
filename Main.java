import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
        public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                String[]diasdasemana = {"segunda","terça","quarta","quinta","sexta"};
                double total = 0;
                double[]totalfaturamento = new double[7];
                for(int i = 0; i < 7; i++)
                {
                    System.out.println("vendas do dia"+(i+1));
                    totalfaturamento[i] = scanner.nextDouble();
                    total+=totalfaturamento[i];
                }

                double maior = totalfaturamento[0];
                int Diamaior=0;

                for(int i = 0; i < 7; i++)
                {
                    if(totalfaturamento[i]>maior)
                    {
                        maior = totalfaturamento[i];
                        Diamaior = i;
                    }
                }

                double media = total / 7;

                System.out.println("total:" + total);
                System.out.println("Media:" + media);
                System.out.println("dia da semana:" + diasdasemana);
            }
        };