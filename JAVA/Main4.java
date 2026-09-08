

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Double nota1 = 9.12;
        Double nota2 = 8.15;
        Double nota3 = 7.5;
        Double nota4 = 9.0;
        double media1 = nota1 + nota2;
        double media2 = nota3 + nota4;
        double mediatotal = (media2 + media1) / 4;
        System.out.println(mediatotal);

    }
}