package ExerciciosSwitch;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Escolha a região (1-Sudeste, 2-Sul, 3-Nordeste, 4-Norte, 5-Centro-Oeste): ");
        int regiao = scanner.nextInt();

        System.out.print("Informe o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        String nomeRegiao;
        double valorFrete;

        switch (regiao) {
            case 1:
                nomeRegiao = "Sudeste";
                valorFrete = 20.00;
                break;
            case 2:
                nomeRegiao = "Sul";
                valorFrete = 25.00;
                break;
            case 3:
                nomeRegiao = "Nordeste";
                valorFrete = 35.00;
                break;
            case 4:
                nomeRegiao = "Norte";
                valorFrete = 45.00;
                break;
            case 5:
                nomeRegiao = "Centro-Oeste";
                valorFrete = 30.00;
                break;
            default:
                System.out.println("Região inválida");
                scanner.close();
                return;
        }

        // Se o valor do produto for maior ou igual a R$ 300,00, o frete é grátis
        if (valorProduto >= 300.00) {
            valorFrete = 0.00;
        }

        double valorFinal = valorProduto + valorFrete;

        System.out.println("Região: " + nomeRegiao);
        System.out.println("Valor do produto: R$ " + valorProduto);
        System.out.println("Frete: R$ " + valorFrete);
        System.out.println("Valor final: R$ " + valorFinal);



        scanner.close();

    }
}
