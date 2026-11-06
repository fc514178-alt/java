public class Main51 {
    static void main() {
        int[][] matriz = new int[3][3];

        for (int i = 0; i< matriz.length;i++)
        {
            for (int j = 0; j< matriz[i].length;j++)
            {
                matriz[i][j] = Integer.parseInt(IO.readln("me de o seus numeros para as posiçoes [" + i + "][" + j +"]:"));
            }
        }

        System.out.println("\naqui esta sua matriz :");

        for (int i = 0; i< matriz.length;i++)
        {
            System.out.println(matriz[i][i] + " ");
        }

    }
}
