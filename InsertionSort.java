/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

/**
 *
 * @author Kaio
 */
public class InsertionSort {
    public static void main(String[] args) {
        int [] vetor = {5,4,3,2,1,3,3};
        insertionSort(vetor);
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]+" ");
        }
    }
    
    public static void insertionSort(int[] vetor){
        for (int i = 0; i < vetor.length; i++){
            int a = vetor[i];
            for (int j = i - 1; j >= 0 && vetor[j] > a; j--){
                vetor[j + 1] = vetor[j];
                vetor[j] = a;
            }
        }
    }
}
