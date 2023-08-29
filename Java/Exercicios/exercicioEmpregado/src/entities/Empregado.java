package entities;

public class Empregado {
    public String name;
    public double salario;
    public double imposto;

    public String cpf;

    public double getSalarioLiquido(){return salario-imposto;}
    public void aumentarSalario(double perc){
        this.salario=((this.salario/100)*perc)+this.salario;
    }
    public String toString(){
        return "Nome: " + name + "; " + "Salário: " + salario + "; " + "CPF: " + cpf + "; ";
    }

}
