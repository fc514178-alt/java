import java.util.Scanner;


public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("me de um numero");
        int primeirovalor = sc.nextInt();
        System.out.println("me de outro numero");
        int segundovalor = sc.nextInt();
        System.out.println(primeirovalor+segundovalor);
        System.out.println(primeirovalor*segundovalor);
        System.out.println(primeirovalor/segundovalor);
        System.out.println(primeirovalor%segundovalor);
    }
}
