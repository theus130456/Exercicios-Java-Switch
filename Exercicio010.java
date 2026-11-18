package ExerciciosSwitch;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Escolha o produto (1-Açaí, 2-Sorvete, 3-Milkshake): ");
        int produto = scanner.nextInt();

        System.out.print("Informe a quantidade: ");
        int quantidade = scanner.nextInt();

        System.out.print("Tem adicional? (true/false): ");
        boolean temAdicional = scanner.nextBoolean();

        String nomeProduto;
        double precoUnitario;

        switch (produto) {
            case 1:
                nomeProduto = "Açaí";
                precoUnitario = 18.00;
                break;
            case 2:
                nomeProduto = "Sorvete";
                precoUnitario = 12.00;
                break;
            case 3:
                nomeProduto = "Milkshake";
                precoUnitario = 20.00;
                break;
            default:
                System.out.println("Produto inválido");
                scanner.close();
                return;
        }

        double valorTotal = quantidade * precoUnitario;

        if (temAdicional) {
            valorTotal = valorTotal + (quantidade * 5.00);
        }

        System.out.println("Produto escolhido: " + nomeProduto);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Adicional: " + (temAdicional ? "Sim" : "Não"));
        System.out.println("Valor total: R$ " + valorTotal);

        scanner.close();
    }
}
