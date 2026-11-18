package ExerciciosSwitch;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Escolha o tipo de ingresso (1-Inteira, 2-Meia-entrada, 3-VIP): ");
        int tipoIngresso = scanner.nextInt();

        System.out.print("Informe a quantidade: ");
        int quantidade = scanner.nextInt();

        String nomeIngresso;
        double precoUnitario;

        switch (tipoIngresso) {
            case 1:
                nomeIngresso = "Inteira";
                precoUnitario = 32.00;
                break;
            case 2:
                nomeIngresso = "Meia-entrada";
                precoUnitario = 16.00;
                break;
            case 3:
                nomeIngresso = "VIP";
                precoUnitario = 60.00;
                break;
            default:
                System.out.println("Tipo de ingresso inválido");
                scanner.close();
                return;
        }

        double valorTotal = precoUnitario * quantidade;
        int descontoPercentual = 0;

        // Se a quantidade for maior que 4, aplica desconto de 5%
        if (quantidade > 4) {
            descontoPercentual = 5;
            valorTotal = valorTotal - (valorTotal * descontoPercentual / 100.0);
        }

        System.out.println("Tipo de ingresso: " + nomeIngresso);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Desconto aplicado: " + descontoPercentual + "%");
        System.out.println("Valor final: R$ " + valorTotal);


        scanner.close();
    }

}
