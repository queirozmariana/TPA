
package com.mycompany.array;

public class Array {

    public static void main(String[] args) {
       String [] nomes = {"Professor", "Gilmar"};
       System.out.printf("Os dois valores sao %s, %s\n",nomes[0] ,nomes [1]);
       
       //Este metodo faz a contagem de caracteres
       System.out.printf("O nome %s tem %s letras\n" ,nomes[0] ,nomes[0].length() );
       
       //Este metodo transforma tudo em maiusculo
       System.out.printf("O nome %s em maiusculo é %s.\n" ,nomes[0] ,nomes[0].toUpperCase() );
       
       //Este metodo tranforma tudo em minisculo
       System.out.printf("O nome %s em minusculas é: %s.\n" ,nomes[0] ,nomes[0].toLowerCase() );
       
        //Este metodo traz a letra em uma posição específica
       System.out.printf("A segunda letra de %s é %s.\n" ,nomes[0] ,nomes[0].charAt(1) );
       
       //Este metodo traz uma parte da String
       System.out.printf("As 4 primeiras letras de %s é %s.\n" ,nomes[0] ,nomes[0].substring(0,4) );
       
       //Este metodo tambem traz a String a partir do indice selecionado
       System.out.printf("As 4 primeiras letras de %s é %s.\n" ,nomes[0] ,nomes[0].substring(4) );
       
       //Este metodo faz comparacoes
       System.out.printf("O nome %s é igual a 'Prof'? %s.\n" ,nomes[0] ,nomes[0].equals("Prof") );
       
       //Este metodo faz comparacao sem levar em conta Case 
       System.out.printf("O nome %s é igual a 'professor'? %s.\n",nomes[0] ,nomes[0].equalsIgnoreCase("pro") );
       
       //Este metodo verifica se contem alguma parte do texto
       System.out.printf("O nome %s contém 'pro'? %s.\n",nomes[0] ,nomes[0].contains("Pro") );
       
       //Este metodo verifica se comeca==ça com determinada silaba
       System.out.printf("O nome %s começa com 'Prof'? %s.\n",nomes[0] ,nomes[0].startsWith("Prof") );
       
       //Este metodo verifica se termina com determinada silaba
       System.out.printf("O nome %s termina com 'ssor'? %s.\n",nomes[0] ,nomes[0].endsWith("ssor") );
       
       //Este metodo verifica se termina com determinada silaba
       System.out.printf("O nome %s termina com 'ssor'? %s.\n",nomes[0] ,nomes[0].endsWith("ssor") );
       
       //Este metodo faz a substituicao e uma paerte ou toda da String
       System.out.printf("Troque %s por 'Instrutor'. Agora eu sou %s.\n",nomes[0] ,nomes[0].replace("Instrutor", "Instrutor") );
    }
}
