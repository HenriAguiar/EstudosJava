import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] vetor=new int[n];
        for(int i=0;i<vetor.length;i++){
            vetor[i]= input.nextInt();
        }
        System.out.println("Numeros negativos: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i]<0){
                System.out.println(vetor[i]);
            }
        }
    }
}