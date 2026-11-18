package ExerciciosSwitch;

import java.util.Locale;
import java.util.Scanner;


public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Escolha o produto (1-Camiseta, 2-Calça, 3-Jaqueta, 4-Tênis): ");
        int tipoProduto = scanner.nextInt();

        System.out.print("Informe a quantidade: ");
        int quantidade = scanner.nextInt();

        String nomeProduto;
        double precoUnitario;

        switch (tipoProduto) {
            case 1:
                nomeProduto = "Camiseta";
                precoUnitario = 49.90;
                break;
            case 2:
                nomeProduto = "Calça";
                precoUnitario = 119.90;
                break;
            case 3:
                nomeProduto = "Jaqueta";
                precoUnitario = 199.90;
                break;
            case 4:
                nomeProduto = "Tênis";
                precoUnitario = 249.90;
                break;
            default:
                System.out.println("Produto inválido");
                scanner.close();
                return;
        }

        double valorTotal = precoUnitario * quantidade;
        int descontoPercentual = 0;

        // Se a quantidade for maior ou igual a 3, aplica desconto de 15%
        if (quantidade >= 3) {
            descontoPercentual = 15;
            valorTotal = valorTotal - (valorTotal * descontoPercentual / 100.0);
        }

        System.out.println("Produto escolhido: " + nomeProduto);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Desconto aplicado: " + descontoPercentual + "%");
        System.out.println("Valor final: R$ " + valorTotal);


        scanner.close();
    }
}
