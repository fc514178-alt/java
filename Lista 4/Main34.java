import java.util.Scanner;

public class Main34 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
     int[]salarioantes = new int[8];
     int[]salariodepois = new int[8];

     double salariototal = 0;

     for(int i = 0;i<salarioantes.length;i++)
     {
         System.out.println("Digite do funcionario"+ (i+1) + ": R$");
         salarioantes[i]= scanner.nextInt();

     }
     for(int i = 0;i <salarioantes.length; i++)
     {
         double reajuste = salarioantes[i] * 1.10;

         if(reajuste > 5000)
         {
            reajuste= 5000;
         }
         salariodepois[i] = (int) reajuste;

         salariototal += salariodepois[i] - salarioantes[i];
     }
        for(int i = 0; i < salarioantes.length;i++)
        {
            System.out.println("salario funcionario Antes:" + (i+1) + salarioantes[i]);
            System.out.println("salario funcionario Depois:" +(i+1)+ salariodepois[i]);
        }
    }
}
