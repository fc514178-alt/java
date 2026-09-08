import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("qual foi sua nota do primeiro bimestre?");
        double nota = sc.nextDouble();
        System.out.println("qual foi sua nota do segundo bimestre?");
        double nota2 = sc.nextDouble();
        System.out.println("qual foi sua nota do terceiro bimestre?");
        double nota3 = sc.nextDouble();
        System.out.println("qual foi sua nota do quarto bimestre?");
        double nota4 = sc.nextDouble();

        double media1semestre = (float) (nota + nota2/2);
        double media2semestre = (float) (nota3+nota4/2);
        double mediaanual = (float) (media1semestre + media2semestre/2);

        if (mediaanual<=7) {
            System.out.println("voce esta de recuperaçao");

        }
        else if (mediaanual==8)
        {
            System.out.println("parabens vc passou com uma nota acima da media");

        }else if (mediaanual==10)
        {
            System.out.println("voce passou na media");
        }



    }
}
