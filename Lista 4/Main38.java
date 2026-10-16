import javax.swing.*;
import java.util.Scanner;
public class Main38 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        double[] filial1 = {10, 20, 30 , 40 , 50};
        double[] filial2 = {15 , 20 , 20, 40 ,60};

        double[] resultado = new double[filial1.length + filial2.length];

        int l = 0;
        int u = 0;
        int c = 0;

        while(l < filial1.length && u< filial2.length)
        {
            if (filial1[l] < filial2[u])
            {
                resultado[c] = filial1[l];
                l++;
            }
            else {
                resultado[c] = filial2[u];
                u++;
            }
            c++;
        }
        while (u < filial2.length)
        {
            resultado[c] = filial2[u];
            u++;
            c++;
        }
        System.out.println("Vendas ordenadas:");

        for(int n = 0; n < resultado.length;n++)
        {
            System.out.println(resultado[n]+ " ");
        }
    }
}
