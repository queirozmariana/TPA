package com.mycompany.listadecompras;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeCompras {
    public static void main(String[] args) {
        
        Scanner escaneador = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        boolean continuar = true;

        do {
            System.out.println("\n Lista de Compras:");
            System.out.println("1 - Adicionar item");
            System.out.println("2 - Remover item");
            System.out.println("3 - Alterar item");
            System.out.println("4 - Limpar lista");
            System.out.println("5 - Visualizar lista");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = escaneador.nextInt();
            escaneador.nextLine(); // limpar Enter

            switch(opcao) {

                case 1:
                    // ADICIONAR
                    System.out.print("Digite o item a ser adicionado: ");
                    String item = escaneador.nextLine();
                    lista.add(item);
                    System.out.println("Item adicionado com sucesso!");
                    break;

                case 2:
                    // REMOVER
                    System.out.print("Digite o item a ser removido: ");
                    String remover = escaneador.nextLine();

                    if (lista.remove(remover)) {
                        System.out.println("Item removido com sucesso!");
                    } else {
                        System.out.println("Item não encontrado na lista.");
                    }
                    break;

                case 3:
                    // ALTERAR
                    System.out.print("Digite o item que deseja alterar: ");
                    String velho = escaneador.nextLine();

                    if (lista.contains(velho)) {
                        int pos = lista.indexOf(velho);
                        System.out.print("Digite o novo item: ");
                        String novo = escaneador.nextLine();
                        lista.set(pos, novo);
                        System.out.println("Item alterado com sucesso!");
                    } else {
                        System.out.println("Item não encontrado.");
                    }
                    break;

                case 4:
                    // LIMPAR LISTA
                    lista.clear();
                    System.out.println("Lista limpa!");
                    break;

                case 5:
                    // MOSTRAR LISTA
                    System.out.println("\nItens da lista:");
                    if (lista.isEmpty()) {
                        System.out.println("(A lista está vazia)");
                    } else {
                        lista.forEach(i -> System.out.println("- " + i));
                    }
                    break;

                case 6:
                    // SAIR
                    continuar = false;
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (continuar);

        escaneador.close();
    }
}
