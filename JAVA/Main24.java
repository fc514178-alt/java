import java.util.Scanner;

public class Main24 {
    static void main() {
            Scanner scanner = new Scanner(System.in);
            String senha;


            // Lendo a primeira nota
            System.out.print("Digite sua senha: ");
            senha = scanner.nextLine();
            String senhaverdadeira="Lupe2809";
            int maxtentativas = 3;
            int tentativas = 0;


                while (!senha.equals(senhaverdadeira)&&tentativas<3) {
                    System.out.println("SENHA INCORRETA!");
                    System.out.print("senha incorreta (Digite novamente a sua senha):  ");
                    senha= scanner.nextLine();
                    tentativas++;
                }

                // Imprime a nota aceita após sair do laço
                System.out.println("Senha correta:"+senha);

                scanner.close();



    }
}
