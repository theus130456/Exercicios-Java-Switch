package ExerciciosSwitch;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US); // evita problemas com vírgula/ponto decimal

        System.out.print("Escolha o tipo de combustível (1-Gasolina, 2-Etanol, 3-Diesel): ");
        int tipoCombustivel = scanner.nextInt();

        System.out.print("Informe a quantidade de litros: ");
        double litros = scanner.nextDouble();

        String nomeCombustivel;
        double precoPorLitro;

        switch (tipoCombustivel) {
            case 1:
                nomeCombustivel = "Gasolina";
                precoPorLitro = 5.89;
                break;
            case 2:
                nomeCombustivel = "Etanol";
                precoPorLitro = 3.99;
                break;
            case 3:
                nomeCombustivel = "Diesel";
                precoPorLitro = 6.19;
                break;
            default:
                System.out.println("Tipo de combustível inválido");
                scanner.close();
                return; // encerra o programa aqui, pois não há combustível válido
        }

        double valorTotal = litros * precoPorLitro;

        System.out.println("Combustível escolhido: " + nomeCombustivel);
        System.out.println("Litros abastecidos: " + litros);
        System.out.println("Valor total: R$ " + valorTotal);

        scanner.close();
    }
}
