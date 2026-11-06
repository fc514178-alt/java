public class Main50 {
    static void main() {
        int[][] matriz = new int[2][3];
        int quantidadepares = 0;

        for (int i = 0; i < matriz.length;i++)
        {
            for (int j = 0;j<matriz[i].length;j++)
            {
                matriz[i][j] = Integer.parseInt(IO.readln("me de o seus numeros para as posiçoes [" + i + "][" + j +"]:"));
            }
        }


        for (int i = 0;i< matriz.length;i++)
        {
            for (int j = 0; j< matriz[i].length;j++)
            {
                if (matriz[i][j] % 2 == 0.
                )
                {
                    quantidadepares++;
                }
            }
        }

        System.out.print("Quantidade de pares:" + quantidadepares);
    }
}
