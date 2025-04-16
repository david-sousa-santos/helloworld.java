import java.util.Scanner;

public class CalculadoraComplexa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à Calculadora Complexa!");

        while (true) {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Sair");
            System.out.print("Digite o número da operação desejada: ");

            int escolha = scanner.nextInt();

            if (escolha == 5) {
                System.out.println("Obrigado por usar a Calculadora Complexa!");
                break;
            }

            double num1, num2;

            System.out.print("Digite o primeiro número: ");
            num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            num2 = scanner.nextDouble();

            double resultado;

            switch (escolha) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + num1 + " + " + num2 + " = " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + num1 + " - " + num2 + " = " + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + num1 + " * " + num2 + " = " + resultado);
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + num1 + " / " + num2 + " = " + resultado);
                    } else {
                        System.out.println("Erro! Divisão por zero não é permitida.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha um número entre 1 e 5.");
            }
        }

        scanner.close();
    }
}
