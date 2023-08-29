import entities.Empregado;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int resposta;
        double perc, salario, imposto;
        String nome, cpf;
        resposta=0;
        HashMap<String, Empregado> empregadosMap = new HashMap<String, Empregado>();
        Scanner sc=new Scanner(System.in);

        while (resposta != 6){
            System.out.println("O que você quer fazer?");
            System.out.printf("1- registrar empregado%n2- procurar empregado%n3- mostrar empregados%n4- Aumentar salário%n5- Ver salário líquido%n6- Sair%n");
            resposta=sc.nextInt();

            if (resposta==1){
                cpf="";
                System.out.println("qual o nome do empregado?");
                nome=sc.next();
                System.out.println("qual o salário do empregado?");
                salario=sc.nextDouble();
                System.out.println("qual o imposto sobre o salário do empregado?");
                imposto=sc.nextDouble();
                System.out.println("qual o CPF do empregado?");
                cpf= sc.next();

                Empregado employe= new Empregado();
                employe.name=nome;
                employe.salario=salario;
                employe.imposto=imposto;
                employe.cpf=cpf;
                empregadosMap.put(cpf,employe);
            }
            else if (resposta==2) {
                System.out.println("Digite o Cpf do empregado: ");
                cpf=sc.next();
                System.out.println(empregadosMap.get(cpf).toString());
            }
            else if (resposta==3) {
                for (String key: empregadosMap.keySet()){
                    System.out.println(empregadosMap.get(key).toString());
                }
            }
            else if (resposta==4){
                System.out.println("CPF do empregado que receberá o aumento: ");
                cpf= sc.next();
                System.out.println(empregadosMap.get(cpf).toString());
                System.out.println("Aumento do salário em porcentagem: ");
                perc= sc.nextDouble();
                empregadosMap.get(cpf).aumentarSalario(perc);
                System.out.println(empregadosMap.get(cpf).toString());
            }
            else if (resposta==5) {
                System.out.println("CPF do empregado: ");
                cpf= sc.next();
                System.out.println(empregadosMap.get(cpf).getSalarioLiquido());
            }
        }
    }
}