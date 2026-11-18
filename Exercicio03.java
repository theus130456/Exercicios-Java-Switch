package ExerciciosSwitch;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Escolha o plano (1-Básico, 2-Profissional, 3-Premium): ");
        int plano = scanner.nextInt();

        System.out.print("Informe a quantidade de meses: ");
        int meses = scanner.nextInt();

        String nomePlano;
        double precoMensal;

        switch (plano) {
            case 1:
                nomePlano = "Básico";
                precoMensal = 29.90;
                break;
            case 2:
                nomePlano = "Profissional";
                precoMensal = 59.90;
                break;
            case 3:
                nomePlano = "Premium";
                precoMensal = 99.90;
                break;
            default:
                System.out.println("Plano inválido");
                scanner.close();
                return;
        }

        double valorTotal = precoMensal * meses;
        int descontoPercentual = 0;

        // Se contratar por 12 meses, aplica desconto de 10%
        if (meses == 12) {
            descontoPercentual = 10;
            valorTotal = valorTotal - (valorTotal * descontoPercentual / 100.0);
        }

        System.out.println("Plano escolhido: " + nomePlano);
        System.out.println("Meses contratados: " + meses);
        System.out.println("Desconto aplicado: " + descontoPercentual + "%");
        System.out.println("Valor final: R$ " + valorTotal);

        scanner.close();
    }
}


