import java.util.Scanner;

//escreva inteiros em um vetor
//mostre os numeros pares
//mostre a quantidade de numeros pares
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Quantos numeros queres digitar? ");
        int quant= sc.nextInt();
        int[] lista = new int[quant];
        for (int i = 0; i < lista.length; i++) {
            System.out.println("digite um numero: ");
            lista[i]= sc.nextInt();
        }
        System.out.println(numerosPares(lista));
    }
    public static String numerosPares(int[] lista){
        String pares="";
        int contador=0;
        for (int numero:lista) {
            if ((numero%2)==0){
                pares+=numero+",";
                contador+=1;
            }
        }
        return String.format("Existem %d numeros pares na lista, estes são:%n"+pares,contador);
    }
}