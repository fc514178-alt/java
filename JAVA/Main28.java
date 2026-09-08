import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main28 {
    public static void main(String[] args) {
        // Configura o scanner para aceitar pontos em vez de vírgulas nos decimais
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        List<Double> notas = new ArrayList<>();

        System.out.print("Digite a quantidade de alunos: ");
        int totalAlunos = scanner.nextInt();

        // Validação simples para evitar divisão por zero
        if (totalAlunos <= 0) {
            System.out.println("Quantidade de alunos inválida.");
            return;
        }

        double soma = 0;

        // Leitura das notas
        for (int i = 0; i < totalAlunos; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            double nota = scanner.nextDouble();
            notas.add(nota);
            soma += nota;
        }

        // Cálculos
        double media = soma / totalAlunos;
        int acimaOuIgualSeis = 0;
        int abaixoSeis = 0;

        for (double nota : notas) {
            if (nota >= 6.0) {
                acimaOuIgualSeis++;
            } else {
                abaixoSeis++;
            }
        }

        // Impressão dos resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.printf( "Média da turma: %.2f%n", media);
        System.out.println("Alunos com nota maior ou igual a 6: " + acimaOuIgualSeis);
        System.out.println("Alunos com nota abaixo de 6: " + abaixoSeis);

        scanner.close();
    }
}
