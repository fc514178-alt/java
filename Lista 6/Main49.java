public class Main49 {
    static void main() {
        int[][] matriz = new int[3][3];

        for (int i = 0 ; i< matriz.length;i++)
        {
            for (int j = 0; j < matriz[i].length;j++)
            {
                matriz[i][j] = Integer.parseInt(IO.readln("me de o seus numeros para as posiçoes [" + i + "][" + j +"]:"));
            }
        }

        int maior = matriz[0][0];

        for (int i = 0; i < matriz.length;i++)
        {
            for (int j =0; j < matriz[i].length;j++)
            {
                if (matriz[i][j] < maior)
                {
                    maior = matriz[i][j];
                }
            }
        }

        System.out.print("maior numero :" + maior);
    }
}
