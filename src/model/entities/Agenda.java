package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<String> ListaTarefas = new ArrayList<>();
    private List<Boolean> tarefasConcluidas = new ArrayList<>();

    public void addTarefa(String tarefa) {
        ListaTarefas.add(tarefa);
        tarefasConcluidas.add(false); 
    }

    public void removerTarefa(String tarefa) {
        int index = ListaTarefas.indexOf(tarefa);
        if (index != -1) {
            ListaTarefas.remove(index);
            tarefasConcluidas.remove(index);
        }
    }

    public String exibirTarefas() {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < ListaTarefas.size(); i++) {
            resultado.append(ListaTarefas.get(i)).append(" - Concluída: ").append(isTarefaConcluida(ListaTarefas.get(i))).append("\n");
        }
        return resultado.toString();
    }

    public void marcarTarefaConcluida(String tarefa) {
        int index = ListaTarefas.indexOf(tarefa);
        if (index != -1) {
            tarefasConcluidas.set(index, true);
        }
    }

    public boolean isTarefaConcluida(String tarefa) {
        int index = ListaTarefas.indexOf(tarefa);
        return index != -1 && tarefasConcluidas.get(index);
    }
}
