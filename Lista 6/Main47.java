public class Main47 {
    static void main() {
        int[][] matriz = new int[3][3];

        for (int i = 0; i< matriz.length;i++)
        {
            for (int j = 0; j < matriz[i].length;j++)
            {
                matriz[i][j] = Integer.parseInt(IO.readln("me de o seus numeros para as posiçoes [" + i + "][" + j +"]:"));
            }
        }

        System.out.println("\nmatriz :");

        for (int i = 0;i< matriz.length;i++)
        {
            for (int j = 0; j < matriz[i].length;j++)
            {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }


    }

}
