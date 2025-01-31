import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        System.out.print("Digite o calculo que você deseja:" +
                " \n 1 - Soma \n 2 - Subtração \n 3 - Multiplicacão \n 4 - Divisão \n");

        Scanner scanner = new Scanner(System.in);

        int opcao = scanner.nextInt();

        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        switch (opcao) {
            case 1:
                double soma = valor1 + valor2;
                System.out.println("Soma: " + soma);
                break;
            case 2:
                double subtracao = valor1 - valor2;
                System.out.println("Subtracao: " + subtracao);
                break;
            case 3:
                double multiplicacao = valor1 * valor2;
                System.out.println("Multiplicacão: " + multiplicacao);
                break;
            case 4:
                double divisao = valor1 / valor2;
                System.out.println("Divisão: " + divisao);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        scanner.close();
    }
}
