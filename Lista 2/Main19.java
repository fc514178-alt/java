import java.util.Scanner;

public class Main19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome de usuário:");
        String usuario = sc.nextLine();
        String admin = "Lucas";

        if (!usuario.equals(admin)) {
            System.out.println("Usuário não foi encontrado.");
        } else {
            System.out.println("Digite a senha:");
            String senha = sc.nextLine();

            if (senha.equals("java123")) {
                System.out.println("Acesso liberado.");
            } else {
                System.out.println("Senha incorreta.");
            }
        }

        sc.close();
    }
}
