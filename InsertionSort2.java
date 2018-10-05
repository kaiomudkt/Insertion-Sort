package testes;

public class InsertionSort2 {
    public static void main(String[] args) {
        int [] vetor = {5,4,3,2,1,3,3};
        insertionSort(vetor);
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]+" ");
        }
    }
    
    public static void insertionSort(int[] vetor){
        for (int i = 1; i < vetor.length; i++){
            int j = i;
            while(j>0 && vetor[j-1] > vetor[j]){
                int aux = vetor[j-1];
                vetor[j-1] = vetor[j];
                vetor[j] = aux;
                j--;
            }
        }
    }
}
/*
insertion_sort(a[])
    for i = 1 to N
        j = i
        while j > 0 and a[j-1] > a[j]
            swap (a[j], a[j-1])
            j = j - 1
end
*/