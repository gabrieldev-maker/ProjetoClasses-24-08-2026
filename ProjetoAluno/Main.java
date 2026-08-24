package ProjetoAluno;

public class Main {
    public static void main(String[] args) {
        
        //string porque vai ser texto na array
        String[] aluno = new String[3];
        //criar novo aluno e colocar os dados na array
        aluno[0] = new Aluno("Aluno 1", "12345", "Engenharia", 8.5).toString();
        aluno[1] = new Aluno("Aluno 2", "67890", "Ciência da Computação", 7.5).toString();
        aluno[2] = new Aluno("Aluno 3", "54321", "Matemática", 9.0).toString();

        //string pois é o nome a array de alunos
        for (String a : aluno) {
            System.out.println(a);
        }
    }
}
