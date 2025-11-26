
package com.mycompany.arraylyst;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayLyst {

    public static void main(String[] args) {
      ArrayList<String> nomes = new ArrayList<>(); 
        
       nomes.add ("Mariana");
       nomes.add ("Pereira");
       nomes.add ("Queiroz");
       
       System.out.println(nomes);
       
       // 2 Retorna um item na posiiçao indicada 
       System.out.printf("O primeiro item é %s\n", nomes.get(0));
       
       // 3 este metodo substitui o valor da variavel
       System.out.printf("Meu nome na verdade é %s %s\n", nomes.get(0), nomes.get(2)); //(Feijao com feijao preto)
       
        //4 Este metodo remove o item da lista
        nomes.remove(0);
       System.out.printf("Lista atualizada %s \n", nomes);
      
       // 5 Retorna quantos elementos tem na lista 
       System.out.printf("O tamanho da lista é %s \n", nomes.size());
       
       // 6 Este método limpa toda a lista 
       System.out.printf("Sua lista atualizada é \n %s", nomes);
       
       // 7 Este método verifica se contem o itm na lista 
       nomes.add("Pereira");
       System.out.printf("Existe na minha lista 'Mariana'? %s", nomes.contains("Pereira"));
       
       // 8 Este método verifica se a lista esta vazia ou não
       System.out.printf("A lista está vazia? %s", nomes.isEmpty());
       
       // 9 Este método organiza os elementos em ordem crescente (Importe a classe)
       //import java.utul.collections
       nomes.add("Céu");
       nomes.add("Azul");
       Collections.sort(nomes);
       System.out.printf("Lista em ordem crescente %s\n", nomes.contains("Pereira"));
       
        // 10  Esse método usa o ForEach para mostrar a lista
    nomes.forEach(nome -> System.out.printf("ola %s\n", nome));
    
    // 11 
    int contador=1;
    for(String item : nomes){
        System.out.printf("%d. %s\n", contador, item);
        contador ++;
    }
    
    }
}