import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("quantos elementos os arrays vão ter?");
        int n = sc.nextInt();
        double[] A = new double[n];
        double[] B = new double[n];
        double[] C = new double[n];
        System.out.println("digite os valores de A");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextDouble();
        }
        System.out.println("digite os valores de B");
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            C[i]=A[i]+B[i];
        }
        for (double valor:C) {
            System.out.println(valor);
        }
    }
}