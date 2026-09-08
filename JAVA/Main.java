import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("me de um numero");
        int numero1 = sc.nextInt();
        if(numero1%2==0){
            System.out.println("esse numero é par");
        }
        else {
            System.out.println("esse numero é impar");
        }
    }
}
