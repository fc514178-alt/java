import java.util.Locale;
import java.util.Scanner;
public class Main43 {

    static int contarvogais (String texto)
    {
        int contador = 0;

        texto = texto.toLowerCase(Locale.ROOT);

        for (int i = 0 ; i < texto.length();i++)
        {
            char letra = texto.charAt(i);

            if (letra == 'a' || letra == 'e' ||
                    letra == 'i' || letra == 'o' ||
                    letra == 'u') {
                contador++;
            }
        }
        return contador;

    }

    static void exibirContagem(String[] frases)
    {
        int quantidade = contarvogais(frases[i]);
        for (int i = 0; i < frases.length; i++)
        {
            System.out.println(frases[i] + "possui" + quantidade + "vogais");
        }
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);

        String[] Frases = new String[3];

        for (int i = 0; i < Frases.length;i++)
        {
            System.out.println("escreva uma frase :");
            Frases[i] = scanner.nextLine();
        }

        exibirContagem(Frases);

        scanner.close();
    }

}
