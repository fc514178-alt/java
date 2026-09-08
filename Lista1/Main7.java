import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("me de o valor da altura/comprimento: ");

        double base = sc.nextDouble();

        System.out.println("me de o valor da largura/base: ");

        double altura = sc.nextDouble();

        float area = (float) (altura*base);

        float perimetro = (float) (altura*base)*2;

        float diagonal = (float) Math.sqrt(Math.pow(altura,2)+Math.pow(base,2));

        System.out.println("o valor do seu perimetro sera:"+ perimetro);
        System.out.println("o valor do seu area sera:"+ area);
        System.out.println("o valor do seu diagonal sera:"+ diagonal);


    }
}
