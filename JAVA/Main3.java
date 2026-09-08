import java.util.Scanner;


public class Main3 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("quantos reais se tem");
        double quantidadereal = sc.nextDouble();
        System.out.println("qual é cotaçao do dolar");
        double dolar = 5.18;
        System.out.printf("seu valor do %s ",quantidadereal/dolar );



    }
}
