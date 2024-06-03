package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> listaAlunos;

    public GerenciadorAlunos() {
        this.listaAlunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media){
        listaAlunos.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        if (!listaAlunos.isEmpty()){
            for (Aluno a : listaAlunos){
                if (a.getMatricula().equals(matricula)){
                    listaAlunos.remove(a);
                }
            }
        } else {
            System.out.println("Lista de alunos vazia.");
        }
    }

    public void exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(listaAlunos);
        if (!listaAlunos.isEmpty()){
            System.out.println(alunosPorNome);
        } else {
            System.out.println("Lista de alunos vazia.");
        }
    }

    public void exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorNota());
        if (!listaAlunos.isEmpty()){
            alunosPorNota.addAll(listaAlunos);
            System.out.println(alunosPorNota);
        } else {
            System.out.println("Lista de alunos vazia.");
        }
    }
    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Joao", 0001, 5);
        gerenciadorAlunos.adicionarAluno("Maria", 0002, 7);
        gerenciadorAlunos.adicionarAluno("José", 0003, 8);
        gerenciadorAlunos.adicionarAluno("Carla", 0004, 6);
        gerenciadorAlunos.adicionarAluno("Vitor", 0005, 4.5);
        gerenciadorAlunos.adicionarAluno("Bruna", 0005, 5);

        gerenciadorAlunos.exibirAlunosPorNome();
        gerenciadorAlunos.exibirAlunosPorNota();

        gerenciadorAlunos.removerAluno(0005);

        gerenciadorAlunos.exibirAlunosPorNome();
    }
}
