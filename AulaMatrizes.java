package com.mycompany.aulamatrizes;
public class AulaMatrizes {

    public static void main(String[] args) {
        
    int [][]matrizNum = {
        {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12}
    }
    ;
    System.out.printf("OS VALORES DE SUA MATRIZ\n");
    for(int i = 0;i< matrizNum.length; i++){
        for (int j = 0; j<matrizNum[i].length; j++){
             System.out.printf("| %-3d ", matrizNum[i][j]);

             
        }
    System.out.printf("\n");
    }
    }
}
