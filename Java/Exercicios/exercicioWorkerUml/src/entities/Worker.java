package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    public String name;
    public WorkerLevel level;
    public Double baseSalary;
    public Integer id;

    public Department department;
    public List<HourCont> contracts= new ArrayList<HourCont>();

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department, Integer id) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }


    public List<HourCont> getContracts() {
        return contracts;
    }

    public void addContracts(HourCont contract){
        contracts.add(contract);
    }
    public void removeContracts(Integer contractNumber){
        for (int i = 0; i <contracts.size() ; i++) {
            if(contracts.get(i).getContractNumber()==contractNumber){
                contracts.remove(i);
                break;
            }
        }
    }

    public double income(int year,int month){
        Calendar cal=Calendar.getInstance();
        double soma = baseSalary;
        for (HourCont c: contracts) {
            cal.setTime(c.getDate());
            int c_year=cal.get(Calendar.YEAR);
            int c_month=cal.get(Calendar.MONTH)+1;
            if(c_year==year && c_month==month){
                soma+=c.totalValue();
            }
        }
        return soma;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", baseSalary=" + baseSalary +
                ", id=" + id +
                ", department=" + department.toString() +
                '}';
    }
}
