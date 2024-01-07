package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<String> ListaTarefas = new ArrayList<>();

    public void addTarefa(String tarefa) {
        ListaTarefas.add(tarefa);
    }

    public void removerTarefa(String tarefa) {
        ListaTarefas.remove(tarefa);
    }

    public String exibirTarefas() {
        StringBuilder resultado = new StringBuilder();
        
        for (String string : ListaTarefas) {
            resultado.append(string).append("\n");
        }
        return resultado.toString();
    }
}
