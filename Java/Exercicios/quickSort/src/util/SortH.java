package util;

public class SortH {
    public static void quicksort(int[] lista, int l, int h) {
        if (l < h) {
            int j = partition(lista, l, h);
            quicksort(lista, l, j-1);
            quicksort(lista, j + 1, h);
        }
    }
    public static void quicksort(int[] lista){
        int l=0,h= lista.length-1;
        if (l < h) {
            int j = partition(lista, l, h);
            quicksort(lista, l, j-1);
            quicksort(lista, j + 1, h);
        }
    }

    private static void swap(int [] lista, int index1, int index2) {
        int temp = lista[index1];
        lista[index1] = lista[index2];
        lista[index2] = temp;
    }

    private static int partition(int[] lista, int l, int h){
        int pivot = lista[l];
        int i = l;
        int j = h;
        while (i < j) {
            while (j > i && lista[j] >= pivot) {j--;}
            while (i < j && lista[i] <= pivot) {i++;}
            if (i!=j) {
                swap(lista, i, j);
            }
        }
        swap(lista,i,l);
        return j;

    }

}
