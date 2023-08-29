import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        int[] lista = new int[5];
        for (int i = 0; i < lista.length; i++) {
            lista[i] = sc.nextInt();
        }
        quicksort(lista, 0, lista.length - 1);
        for (int valor : lista) {
            System.out.println(valor);
        };
    }
    public static void quicksort(int[] lista, int l, int h) {
        if (l < h) {
            int j = partition(lista, l, h);
            quicksort(lista, l, j-1);
            quicksort(lista, j + 1, h);
        }
    }
    public static int partition(int[] lista, int l, int h) {
        //o objetivo da função é achar a posição correta para o pivo, além de retornar o ponto de divisão do array
        int pivot = lista[l];
        int i = l;
        int j = h;
        //se i>j significa que os ponteiros já se cruzaram, ou seja, já varremos todo o array
        while (i < j) {
            //vamos diminuir o ponteiro j e aumentar o i até que i ache um valor maior que o pivot, e j ache um valor menor
            while (j > i && lista[j] >= pivot) {
                j--;
            }
            while (i < j && lista[i] <= pivot) {
                i++;
            }
            // depois, com i na posição de um valor > pivot, e j na posição de um valor < pivot,
            // trocamos os valores correspondentes de lugar
            swap(lista, i, j);
        }
        // após varrermos todo o conjunto com os ponteiros, trocamos o pivot de lugar com o valor onde i está
        swap(lista,i,l);
        return j;
    }
    private static void swap(int [] lista, int index1, int index2){
        int temp =lista[index1];
        lista[index1]=lista[index2];
        lista[index2]=temp;
    }
}