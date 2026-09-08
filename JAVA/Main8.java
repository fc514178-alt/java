import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("quantos graus esta hj");

        double celsious = sc.nextDouble();

        float  Fahrenheit = (float) (celsious-32*5/9);


        float kelvin = (float) (celsious+273);

        System.out.println("VALOR EM Fahrenheit " + Fahrenheit );
        System.out.println("VALOR EM kelvin " + kelvin );

    }
}
