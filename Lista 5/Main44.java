import java.util.Locale;
import java.util.Scanner;
public class Main44 {

    static String gerarIniciais(String nomeCompleto)
    {
        nomeCompleto = nomeCompleto.toLowerCase(Locale.ROOT);

        String[] partes = nomeCompleto.split(" ");

        String iniciais = "";

        for (int i = 0; i < nomeCompleto.length();i++)
        {
            iniciais += partes[i].substring(0,1).toUpperCase() + ".";
        }
        return iniciais;
    }

    static void exibirChamada(String[] nomes)
    {
        int quantidade = gerarIniciais(nomes[j]);
        for (int j = 0 ; j< nomes.length ; j++)
        {
            System.out.println( (j+1) + " ." + nomes[j] + "(" + quantidade +")");
        }
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);

        String[]nomes = new String[4];

        for (int k = 0 ; k < nomes.length;k++)
        {
            System.out.println("me de seu nome");
            nomes[k] = scanner.nextLine();
        }

        exibirChamada(nomes);
        scanner.close();
    }

}
