import java.util.Arrays;
import java.util.Scanner;
public class Main40 {
    public class Main{

       static int inverterNumero(int numero)
        {
            int invertedor = 0;

            while (numero != 0) {
                int digito = numero % 10;
                invertedor = invertedor * 10 + digito;
                numero = numero / 10;
            }

            return invertedor;
        }

       static void exibirInvertidos(int[] numeros)
       {
           System.out.println("esse é" + Arrays.toString(numeros) + "seu numero, e essa é" +  inverterNumero(numeros[i]) + "ele invertido");
       }

    }

    static void main() {
        Scanner scanner = new Scanner(System.in);

        int[] numero = new int[5];

        for (int i = 0 ; i < numero.length ; i++)
        {
            System.out.println("digite o numero que vc quer inverter");
            numero[i] = scanner.nextInt();
        }

        Main.exibirInvertidos(numero);

        scanner.close();

    }
}
