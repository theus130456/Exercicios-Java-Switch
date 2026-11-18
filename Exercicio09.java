package ExerciciosSwitch;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Escolha o serviço (1-Banho, 2-Tosa, 3-Banho e tosa): ");
        int tipoServico = scanner.nextInt();

        System.out.print("Escolha o porte do animal (1-Pequeno, 2-Médio, 3-Grande): ");
        int porteAnimal = scanner.nextInt();

        String nomeServico;
        String nomePorte;
        double valorTotal;

        switch (tipoServico) {
            case 1:
                nomeServico = "Banho";

                switch (porteAnimal) {
                    case 1:
                        nomePorte = "Pequeno";
                        valorTotal = 40.00;
                        break;
                    case 2:
                        nomePorte = "Médio";
                        valorTotal = 55.00;
                        break;
                    case 3:
                        nomePorte = "Grande";
                        valorTotal = 70.00;
                        break;
                    default:
                        System.out.println("Porte de animal inválido");
                        scanner.close();
                        return;
                }
                break;

            case 2:
                nomeServico = "Tosa";

                switch (porteAnimal) {
                    case 1:
                        nomePorte = "Pequeno";
                        valorTotal = 50.00;
                        break;
                    case 2:
                        nomePorte = "Médio";
                        valorTotal = 65.00;
                        break;
                    case 3:
                        nomePorte = "Grande";
                        valorTotal = 80.00;
                        break;
                    default:
                        System.out.println("Porte de animal inválido");
                        scanner.close();
                        return;
                }
                break;

            case 3:
                nomeServico = "Banho e tosa";

                switch (porteAnimal) {
                    case 1:
                        nomePorte = "Pequeno";
                        valorTotal = 85.00;
                        break;
                    case 2:
                        nomePorte = "Médio";
                        valorTotal = 110.00;
                        break;
                    case 3:
                        nomePorte = "Grande";
                        valorTotal = 140.00;
                        break;
                    default:
                        System.out.println("Porte de animal inválido");
                        scanner.close();
                        return;
                }
                break;

            default:
                System.out.println("Serviço inválido");
                scanner.close();
                return;
        }

        System.out.println("Serviço escolhido: " + nomeServico);
        System.out.println("Porte do animal: " + nomePorte);
        System.out.println("Valor total: R$ " + valorTotal);

        scanner.close();
    }
}
