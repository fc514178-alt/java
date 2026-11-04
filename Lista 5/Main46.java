import java.util.Scanner;
public class Main46 {


    static  boolean contem(int[] numeros, int valor)
    {
        for(int i = 0; i < numeros.length; i++)
        {
            if(numeros[i] == valor)
            {
                return true;
            }

        }
        return false;
    }





    static int[] sortear(int quantidade, int maximo)
    {
        int[]numeros = new int[quantidade];
        maximo = 60;

        for (int i = 0 ; i < quantidade; i++)
        {
            int numero;
            do {
                numero = (int) ((int) (Math.random() * maximo) + 1.);
            }
            while (contem(numeros,numero));
            {
                numeros[i] = numero;
            }
        }
        return numeros;
    }

    static void exibir(int[] numeros)
    {
        System.out.println("numeros sortiados :");
        for (int i = 0 ; i < numeros.length; i++);
        {
            System.out.println(numeros[i] + " ");
        }
    }

    static void main() {


        int[] resultado = sortear(6,60);

        exibir(resultado);
    }


}
