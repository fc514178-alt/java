

import java.util.Scanner;


public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("informa teu nome ai");
        String nome = sc.nextLine();
        System.out.println("fala sua idade");
        int idade = sc.nextInt();
        System.out.println("fala sua altura");
        double altura = sc.nextDouble();
        System.out.println("vc é "+ nome +" "+ "sua altura " + altura + "sua idade "+ idade);
    }
}
