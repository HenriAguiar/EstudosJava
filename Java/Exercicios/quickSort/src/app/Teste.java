package app;
import util.SortH;
import util.Fatorial;
import java.util.Arrays;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args){
        int[] A= new int[1];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < A.length; i++) {
            A[i]=sc.nextInt();
        }
        SortH.quicksort(A);
        System.out.println(Arrays.toString(A));
        System.out.println(Fatorial.fatorial(500));
    }
}

