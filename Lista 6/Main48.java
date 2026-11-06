public class Main48 {
    static void main() {
        int[][] matriz = new int[3][3];
        int soma = 0;

        for (int i = 0; i < matriz.length;i++)
        {
            for (int j = 0 ; j < matriz[i].length;j++)
            {

               matriz[i][j] = Integer.parseInt(IO.readln("me de o seus numeros para as posiçoes [" + i + "][" + j +"]:"));
                soma += matriz[i][j];
            }
        }

        System.out.print("soma:" + soma);


    }
}
