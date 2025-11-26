package com.mycompany.exerciciomatrizes;
import java.util.Scanner;
public class ExercicioMatrizes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] []myMatriz = new String [3][4];
        {
        myMatriz [0][0] = "Nome";
        myMatriz [0][1] = "Nota 1: ";      
        myMatriz [0][2] = "Nota 2: ";         
        myMatriz [0][3] = "Media: ";        
        };
         for(int i = 1;i< myMatriz.length; i++){       
         System.out.printf("Aluno " + 1);        
         
         System.out.print("\nNome: " );   
         myMatriz [i][0] = sc.nextLine();
         
        System.out.print("\nNota 1: " );   
         myMatriz [i][1] = sc.nextLine();
         
        System.out.print("\nNota 2: " );   
         myMatriz [i][2] = sc.nextLine();
        
        System.out.print("Media: " );   
         myMatriz [i][3] = sc.nextLine();
         
         
        }
          System.out.print("\nResultado: \n");
          for(int i = 1;i< myMatriz.length; i++){
          for (int j = 0; j<myMatriz[i].length; j++){
          System.out.printf("| %-10s ", myMatriz[i][j]);   

}       System.out.printf("\n");
       }
    }
}