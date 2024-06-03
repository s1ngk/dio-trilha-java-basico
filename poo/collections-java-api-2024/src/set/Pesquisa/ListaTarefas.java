package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> listaTarefas;

    public ListaTarefas(){
        this.listaTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaPraRemover = null;
        if(!listaTarefas.isEmpty()){
            for ( Tarefa t : listaTarefas) {
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaPraRemover = t;
                    break;
                }
            }
            listaTarefas.remove(tarefaPraRemover);
        } else {
            System.out.println("Lista de tarefas vazia.");
        }
    }

    public void exibirTarefas(){
        System.out.println(listaTarefas);
    }

    public void contarTarefas(){
        System.out.println(listaTarefas.size() + " tarefas.");;
    }

    public void obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
            for (Tarefa t : listaTarefas){
                if(t.isConcluido()){
                    tarefasConcluidas.add(t);
                }
            }
        System.out.println(tarefasConcluidas);
    }

    public void obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
            for (Tarefa t : listaTarefas){
                if(!t.isConcluido()){
                    tarefasPendentes.add(t);
                }
            }
            System.out.println(tarefasPendentes);
    }

    public void marcarTarefaConcluida(String descricao){
        if(!listaTarefas.isEmpty()){
            for (Tarefa t : listaTarefas){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setConcluido(true);
                }
            }
        } else {
            System.out.println("Lista de tarefas vazia.");
        }
    }

    public void marcarTarefaPendente(String descricao){
        if(!listaTarefas.isEmpty()){
            for (Tarefa t : listaTarefas){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setConcluido(false);
                }
            }
        } else {
            System.out.println("Lista de tarefas vazia.");
        }
    }

    public void limparListaTarefas(){
        listaTarefas.removeAll(listaTarefas);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa("Limpar o quarto");
        listaTarefas.adicionarTarefa("Limpar a sala");
        listaTarefas.adicionarTarefa("Limpar o banheiro");
        listaTarefas.adicionarTarefa("Limpar a cozinha");
        listaTarefas.adicionarTarefa("Limpar o corredor");

        listaTarefas.exibirTarefas();
        
        listaTarefas.contarTarefas();

        listaTarefas.obterTarefasConcluidas();
        listaTarefas.obterTarefasPendentes();

        listaTarefas.marcarTarefaConcluida("Limpar o quarto");
        listaTarefas.marcarTarefaPendente("Limpar a sala");

        listaTarefas.obterTarefasConcluidas();
        listaTarefas.obterTarefasPendentes();

        listaTarefas.removerTarefa("Limpar a cozinha");
        listaTarefas.exibirTarefas();
    }
}
