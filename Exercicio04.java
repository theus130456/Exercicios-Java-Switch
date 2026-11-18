package ExerciciosSwitch;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Escolha o tipo de veículo (1-Moto, 2-Carro, 3-Caminhonete): ");
        int tipoVeiculo = scanner.nextInt();

        System.out.print("Informe a quantidade de horas: ");
        int horas = scanner.nextInt();

        String nomeVeiculo;
        double precoPorHora;

        switch (tipoVeiculo) {
            case 1:
                nomeVeiculo = "Moto";
                precoPorHora = 5.00;
                break;
            case 2:
                nomeVeiculo = "Carro";
                precoPorHora = 10.00;
                break;
            case 3:
                nomeVeiculo = "Caminhonete";
                precoPorHora = 15.00;
                break;
            default:
                System.out.println("Tipo de veículo inválido");
                scanner.close();
                return;
        }

        double taxaAdicional = 0.0;

        // Se ficar mais de 5 horas, aplica taxa adicional fixa
        if (horas > 5) {
            taxaAdicional = 10.00;
        }

        double valorTotal = (horas * precoPorHora) + taxaAdicional;

        System.out.println("Veículo: " + nomeVeiculo);
        System.out.println("Horas estacionado: " + horas);
        System.out.println("Taxa adicional: R$ " + taxaAdicional);
        System.out.println("Valor total: R$ " + valorTotal);

        scanner.close();
}
}
