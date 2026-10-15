import java.util.Scanner;
public class Main2 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double[] produto = new double[10];
    int total = 0;
    String[]posiçao = {"direita","esquerda"};

    for(int i = 0; i < 10;i++)
    {
        System.out.println("Estoque do produto:" + (i + 1) + ":");
        produto[i] = scanner.nextInt();


    }
    System.out.println("produtos   ");
    for (int i = 0;i<10;i++)
    {
        if( produto[i]< 5)
        {
            total+= produto[i];
            System.out.println("produto:" + produto);
            System.out.println("posiçao:" + posiçao);
        }
    }
}}

