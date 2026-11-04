import java.util.Scanner;
public class Main42 {
    public class Main{
        static double calcularImc(double peso, double altura)
        {
            return peso  / (altura * altura);

        }

        static String classificarImc(double imc)
        {
            if(imc < 18.5)
            {
                return "abaixo do peso";
            }
            if (imc < 25){
                return "peso normal";

            }
            if (imc < 30) {
                return "sobre peso";
            }
            else {
                return "obesidade";
            }

        }

        static void exibirRelatorio(double[] pesos, double[] alturas)
        { for (int i = 0 ; i < pesos.length; i++){
            double imc = calcularImc(pesos[i],alturas[i]);

            String classificaçao = classificarImc(imc);
            System.out.println("seu peso é" + pesos[i] + " sua altura é" + alturas[i] + " e seu IMC ficou" + classificarImc(imc) + " logo vc é" + classificaçao);

        }

        }
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);

        double[]pesos = new double[4];
        double[]altura = new double[4];

        for (int k = 1; k < pesos.length;k++)
        {
            System.out.println("qual seu peso");
            pesos[k] = scanner.nextDouble();

            System.out.println("qual sua altura");
            altura[k] = scanner.nextDouble();
        }
        Main.exibirRelatorio(pesos,altura);

        scanner.close();
    }
}
