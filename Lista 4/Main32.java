import java.util.Scanner;
import java.lang.String;
public class Main32 {
    static void main() {
 Scanner  scanner = new Scanner(System.in);

 double[] estoque = new double[10];
 int totaldeestoque = 0;

 for(int i = 0;i < estoque.length;i++)
 {
     System.out.println("Digite a quantidade" + (i+1) + ":");
     estoque[i] = scanner.nextInt();
     for(int i1 = 0;i < estoque.length;i++)
     {
         if(estoque[i]<5)
         {
            System.out.println("Posiçao" + i +" -Quantidade" + estoque[i]);
            i++;
         }
     }
     System.out.println("Total de produtos com menos de 5 unidades:" + i);

 }


    }
}
