package com.mycompany.aulamatrizes;
import java.util.Scanner;
public class AulaMatrizes {

    public static void main(String[] args) {
        Scanner escaneador = new Scanner(System.in);
    String [][]myMatriz = {
        {"Nome","Nota1","Nota2","Média"},
        {"Julia","6.0","10.0","8.0"},
        {"Claudia","7.0","8.0","7.5"}
    }
    ;
    System.out.printf("OS VALORES DE SUA MATRIZ\n");
    for(int i = 0;i< myMatriz.length; i++){
        for (int j = 0; j<myMatriz[i].length; j++){
             System.out.printf("| %-7s ", myMatriz[i][j]);
        }
    System.out.printf("\n");
    }
    }
}
