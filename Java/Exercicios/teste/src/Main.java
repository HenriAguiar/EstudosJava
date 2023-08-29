import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String palavra= sc.next();
        double gCounter = 0.0,cCounter=0.0;
        palavra=palavra.toUpperCase();
        for (int i = 0; i < palavra.length(); i++) {
            char letra=palavra.charAt(i);
            if (letra=='G'){
                gCounter++;
            }
            else if (letra=='C'){
                cCounter++;
            }
        }
        double perc=((cCounter+gCounter)/(palavra.length()))*100;
        System.out.println(perc);
    }
}