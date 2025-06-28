import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Informe a altura (m): ");
        double altura = scanner.nextDouble();

        CalculadoraIMC.calcular(peso, altura);
    }
}
