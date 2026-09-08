import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("me de o valor do do diametro do circulo do circulo?");
        double diametro = sc.nextInt();
        float raio = (float) (diametro/2);
        float perimetro = (float) (raio*Math.PI*2);
        System.out.println(raio);
        System.out.println(perimetro);


    }
}