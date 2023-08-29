import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Quantos dados quer inserir? ");
        int quant=sc.nextInt();
        Double[] vetor=new Double[quant];
        for (int i=0; i<quant; i++){
            System.out.println("Digite um valor: ");
            vetor[i]=sc.nextDouble();
        }
        Double media=0.0;
        for(int i=0; i<quant;i++){
            media+=vetor[i];
        }
        media=media/quant;
        System.out.printf("A altura média das %d pessoas é: %.2fm",quant,media);
    }
}