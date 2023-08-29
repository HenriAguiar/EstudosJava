import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o numero de linhas e colunas:");
        int[][] matriz = new int[sc.nextInt()][sc.nextInt()];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("procurar vizinhos de que numero?");
        int n = sc.nextInt();
        int c = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j]);
                if (matriz[i][j] == n) {
                    c++;
                    System.out.printf("#%d instancia do numero %d\n", c, n);
                    System.out.printf("posição: [%d][%d]\n", i, j);
                    if (j != 0) {
                        System.out.printf("numero à esquerda: %d\n", matriz[i][j - 1]);
                    } else {
                        System.out.println("não tem numero à esquerda\n");
                    }
                    if (j != matriz[i].length - 1) {
                        System.out.printf("numero à direita: %d\n", matriz[i][j + 1]);
                    }
                    else{
                        System.out.println("não tem numero à direita");
                    }
                    if(i!=0){
                        System.out.printf("numero acima: %d\n",matriz[i-1][j]);
                    }
                    else{
                        System.out.println("não tem numero acima\n");
                    }
                    if (i!=matriz.length-1){
                        System.out.printf("numero abaixo: %d\n",matriz[i+1][j]);
                    }
                    else {
                        System.out.println("não tem numero abaixo\n");
                    }
                    System.out.println("--------------------------");
                }
            }
        }
    }
}