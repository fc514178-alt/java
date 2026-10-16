public class Main36 {
    public static void main(String[] args) {

        int[] senhas = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110};

        boolean[] idoso = {
                false, false, true, false, true,
                false, false, true, false, false
        };

        for (int atendimento = 1; atendimento <= 3; atendimento++) {

            int posicao = -1;


            for (int i = 0; i < 10; i++) {
                if (senhas[i] != 0 && idoso[i]) {
                    posicao = i;
                    break;
                }
            }


            if (posicao == -1) {
                for (int i = 0; i < 10; i++) {
                    if (senhas[i] != 0) {
                        posicao = i;
                        break;
                    }
                }
            }


            System.out.println("\nAtendimento " + atendimento);
            System.out.println("Senha chamada: " + senhas[posicao]);


            for (int i = posicao; i < 9; i++) {
                senhas[i] = senhas[i + 1];
                idoso[i] = idoso[i + 1];
            }

            senhas[9] = 0;
            idoso[9] = false;


            System.out.print("Fila: ");
            for (int i = 0; i < 10; i++) {
                System.out.print(senhas[i] + " ");
            }
            System.out.println();
        }
    }
}