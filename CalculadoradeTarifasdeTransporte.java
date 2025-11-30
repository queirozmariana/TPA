package com.mycompany.calculadoradetarifasdetransporte;
import java.util.Scanner;

public class CalculadoradeTarifasdeTransporte {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Calculadora de Tarifas de Transporte ===");
        System.out.println("1 - Ônibus urbano");
        System.out.println("2 - Metrô");
        System.out.println("3 - Trem intermunicipal");
        System.out.println("4 - Ônibus rodoviário");
        System.out.print("Escolha o tipo de transporte: ");
        int opcao = sc.nextInt();

        System.out.print("Digite a quantidade de bilhetes: ");
        int qtd = sc.nextInt();

        double valor = 0;

        switch (opcao) {
            case 1:
                valor = qtd * 4.40;
                break;
            case 2:
                valor = qtd * 5.00;
                break;
            case 3:
                valor = qtd * 6.50;
                break;
            case 4:
                valor = qtd * 12.00;
                break;
            default:
                System.out.println("Erro: opção inválida!");
                return;
        }

        System.out.println("Valor total: R$ " + valor);
    }
}
