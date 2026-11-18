package ExerciciosSwitch;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Locale.setDefault(Locale.US);

            System.out.print("Escolha o item (1-Hambúrguer, 2-Pizza, 3-Batata frita, 4-Refrigerante, 5-Suco): ");
            int opcaoLanche = scanner.nextInt();

            System.out.print("Informe a quantidade: ");
            int quantidade = scanner.nextInt();

            String nomeItem;
            double precoUnitario;

            switch (opcaoLanche) {
                case 1:
                    nomeItem = "Hambúrguer";
                    precoUnitario = 25.00;
                    break;
                case 2:
                    nomeItem = "Pizza";
                    precoUnitario = 40.00;
                    break;
                case 3:
                    nomeItem = "Batata frita";
                    precoUnitario = 18.00;
                    break;
                case 4:
                    nomeItem = "Refrigerante";
                    precoUnitario = 8.00;
                    break;
                case 5:
                    nomeItem = "Suco";
                    precoUnitario = 10.00;
                    break;
                default:
                    System.out.println("Opção inválida");
                    scanner.close();
                    return;
            }

            double totalPedido = quantidade * precoUnitario;

            System.out.println("Item escolhido: " + nomeItem);
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Total do pedido: R$ " + totalPedido);

            scanner.close();
        }
    }

