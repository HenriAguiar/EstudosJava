import java.util.ArrayList;

public class Professor extends Funcionario{
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public Professor(String nome, String cpf, String dataDeContratacao, String endereco, Double salario) {
        super(nome, cpf, dataDeContratacao, endereco, salario);
    }

    public Professor() {
    }
    public void adicionarDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }
    public int CalcularCargaHoraria(){
        int i=0;
        for (Disciplina disciplina: disciplinas) {
            i+=disciplina.getCargaHoraria();
        }
        return i;
    }


}
