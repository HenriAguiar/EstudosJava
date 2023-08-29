package aplication;

import entities.Department;
import entities.HourCont;
import entities.Worker;
import entities.WorkerLevel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int option = -1;
        HashMap<Integer,Worker> funcionarios=new HashMap<>();
        SimpleDateFormat stf= new SimpleDateFormat("dd/MM/yyyy");

        do {
            System.out.println("What do you wanna do?");
            System.out.printf("0-Exit\n1-Add Worker\n2-See worker info\n3-Add contract to a worker\n4-Remove a worker's contract\n5-See worker income" +
                    "\n6-Remove worker\n7-See workers list");
            option=sc.nextInt();
            Integer id=0;
            int contractNumber=0;
            switch (option){
                case 1:
                    System.out.println("Digite as informações do funcionario:");
                    System.out.println("Nome: ");
                    String workername=sc.next();
                    System.out.println("Salario base: ");
                    Double workerIncome= sc.nextDouble();
                    System.out.println("Departamento: ");
                    String workerDepartment= sc.next();
                    System.out.println("Level: ");
                    String workerLevel= sc.next();
                    System.out.println("Id: ");
                    id= sc.nextInt();
                    Worker worker=new Worker(workername, WorkerLevel.valueOf(workerLevel), workerIncome, new Department(workerDepartment), id);
                    funcionarios.put(id,worker);
                    break;
                case 2:
                    System.out.println("Qual o id do funcionário?");
                    id= sc.nextInt();
                    System.out.println(funcionarios.get(id).toString());
                    break;
                case 3:
                    System.out.println("Qual o id do funcionario?");
                    id= sc.nextInt();
                    System.out.println("Qual a data do contrato?");
                    Date data=stf.parse(sc.next());
                    System.out.println("Quanto vale a hora do contrato?");
                    Double valor= sc.nextDouble();
                    System.out.println("O contrato é de quantas horas?");
                    Integer horas= sc.nextInt();
                    System.out.println("Qual o número do contrato?");
                    contractNumber= sc.nextInt();
                    funcionarios.get(id).addContracts(new HourCont(data,valor,horas,contractNumber));
                    break;
                case 4:
                    System.out.println("Id do trabalhador encarregado do contrato: ");
                    id = sc.nextInt();
                    System.out.println("Número do contrato a ser retirado: ");
                    contractNumber= sc.nextInt();
                    Worker funcionario=funcionarios.get(id);
                    funcionario.removeContracts(contractNumber);
                    break;
                case 5:
                    System.out.println("Id do trabalhador cujo faturamento sera exibido: ");
                    id= sc.nextInt();
                    System.out.println("Digite o ano: ");
                    int ano= sc.nextInt();
                    System.out.println("Digite o mês: ");
                    int month=sc.nextInt();
                    System.out.println(funcionarios.get(id).income(ano,month));
                    break;
                case 6:
                    System.out.println("Id do trabalhador que será removido: ");
                    id= sc.nextInt();
                    funcionarios.remove(id);
                    break;
                case 7:
                    for (int i: funcionarios.keySet()) {
                        System.out.println(funcionarios.get(i).toString());
                    }
                    break;
            }
        } while (option!=0);

    }
}
