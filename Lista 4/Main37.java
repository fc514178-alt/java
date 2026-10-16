import java.util.Scanner;
public class Main37 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        String[] Nomes = new String[6];
        double[] vendas = new double[6];

        for (int i = 0; i < 6; i++) {
            System.out.println("Nome do vendendor :");
            Nomes[i] = scanner.nextLine();

            System.out.println("Quantas vendas:");
            vendas[i] = scanner.nextDouble();
            scanner.nextLine();
        }
        for (int i = 0 ; i < 5;i++)
        {
            for(int j = i+1;j < 6; i++)
            {
                if (vendas[i] < vendas[j])
                {
                    double temVendas = vendas[i];
                    vendas[i] = vendas[j];
                    vendas[j] = temVendas;
                    String temNome = Nomes[i];
                    Nomes[i] = Nomes[j];
                    Nomes[i] = temNome;
                }
            }
        }
        System.out.println("RANKING DE VENDAS XD");
        for (int i = 0; i < 6;i++)
        {
            System.out.println((i + 1) + "º lugar :"
            +Nomes[i] + " -R$" + vendas[i]);
        }
        scanner.close();
    }
}
