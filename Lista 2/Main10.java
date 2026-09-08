import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("qual sua idade?");
        int idade = sc.nextInt();

        if (idade>=65) {
            System.out.println("o senhor deve receber tres mensagens");
        }
        else if (idade>=60) {
            System.out.println("o senhor esta idoso");
        }
        else if (idade>=18) {
            System.out.println("pode dirigir");
        }

        else if (idade>=16) {
            System.out.println("pode votar");
        }
    }
}
