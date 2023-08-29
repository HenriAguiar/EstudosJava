public class Main {
    public static void main(String[] args) {

        Professor professor=new Professor();
        Disciplina a=new Disciplina();
        a.setCargaHoraria(18);
        Disciplina b=new Disciplina();
        b.setCargaHoraria(20);
        Disciplina c=new Disciplina();
        c.setCargaHoraria(22);
        professor.adicionarDisciplina(a);professor.adicionarDisciplina(b);professor.adicionarDisciplina(c);
        System.out.println(professor.CalcularCargaHoraria());

    }
}