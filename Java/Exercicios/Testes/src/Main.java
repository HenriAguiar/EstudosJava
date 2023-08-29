public class Main {
    public static void main(String[] args) {
        int i=0,j=5;
        int[] A=new int[6];
        A[0]=7;
        A[1]=9;
        A[2]=2;
        A[3]=1;
        A[4]=5;
        A[5]=8;
        }


    private static void swap(int [] lista, int index1, int index2){
        int temp =lista[index1];
        lista[index1]=lista[index2];
        lista[index2]=temp;
    }
    public static int partition(int[] lista, int l, int h) {
        int pivot = lista[l];
        int i = l;
        int j = h;
        while (i < j) {
            System.out.printf("entrou, i=%d e j=%d. ",i,j);
            while (j > i && lista[j] >= pivot) {j--;}
            while (i < j && lista[i] <= pivot) {i++;}
            if (i!=j) {
                System.out.printf("i=%d, j=%d swap. ",i,j);
                swap(lista, i, j);
            }
        }
        System.out.printf("fim, i=%d e j=%d. ", i,j);
        swap(lista,i,l);
        return j;
    }
}