import java.util.Locale;
import java.util.Scanner;
public class Main45 {

    static String inverter(String texto)
    {
        String invertido = "";

        for (int i = texto.length() - 1; i >= 0 ; i--)
        {
            invertido += texto.charAt(i);
        }

        return invertido;
    }

    static boolean ehPalindromo(String texto)
    {
        texto =texto.replace(" "," ").toLowerCase();

        String invertido = inverter(texto);
        return texto.equals(invertido);
    }

    static void exibirResultado(String frase)
    {
        if (ehPalindromo(frase))
        {
            System.out.println(frase + " -> é palindromo");
        }
        else {
            System.out.println(frase +" -> não é palindromo");
        }
    }

    static void main() {

        Scanner scanner = new Scanner(System.in);

        String[]palindromo = new String[4];

        for (int k = 0;k< palindromo.length;k++)
        {
            System.out.println("diga sua frase");
            palindromo[k] = scanner.nextLine();
        }
        for (int j = 0 ; j < palindromo.length;j++)
        {
            exibirResultado(palindromo[j]);
        }
        scanner.close();
    }
}
