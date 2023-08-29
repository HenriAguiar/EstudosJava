import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc;
        sc=new Scanner(System.in);
        System.out.println("quantos numeros inserir?");
        int n = sc.nextInt();
        double[] array=new double[n];
        System.out.println(array.length);
        System.out.println("digite os numeros:");
        for (int i = 0; i < n; i++) {
            array[i]=sc.nextDouble();
        }
        System.out.println(maiorValor(array));
        System.out.println(indiceMaiorValor(array,maiorValor(array)));
    }
    public static double maiorValor(double[] array){
        double maior=array[0];
        for (double valor: array) {
            if(valor>maior){
                maior=valor;
            }
        }
        return maior;
    }
    public static Integer indiceMaiorValor(double[] array, double valor){
        for(int i=0;i<array.length;i++){
            if(array[i]==valor){
                return i;
            }
        }
        return null;
    }
}