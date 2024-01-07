package application;

import java.util.Scanner;

import model.entities.Agenda;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String conteudo;
		char continuar;
		String tarefas;

		Agenda agenda = new Agenda();

		try {

			while (true) {

				System.out.println("1 - Adicionar tarefa na lista de tarefas.");
				System.out.println("2 - Remover tarefa da lista de tarefas.");
				System.out.println("3 - Exibir todas as tarefas da lista de tarefas.");
				System.out.println("4 - Listar tarefas concluidas.");
				System.out.println("5 - Sair do programa.");
				System.out.println();
				System.out.print("Escolha uma das opções listadas acima: ");
				int escolha = scanner.nextInt();
				System.out.println();
				switch (escolha) {

				case 1:
					while (true) {
						System.out.print("Digite o que deseja adicionar na lista de tarefas: ");
						scanner.nextLine();
						conteudo = scanner.nextLine();
						agenda.addTarefa(conteudo);
						System.out.println();
						System.out.print("Deseja adicionar outra tarefa na lista de tarefas? (S/n): ");
						continuar = scanner.next().charAt(0);
						System.out.println();

						if (continuar != 'S' && continuar != 's') {
							break;
						}
					}
					break;

				case 2:
					while (true) {
						System.out.print("Digite a tefera que deseja remover da lista de tarefas: ");
						scanner.nextLine();
						conteudo = scanner.nextLine();
						agenda.removerTarefa(conteudo);
						System.out.println();
						System.out.print("Deseja remover outra tarefa na lista de tarefas? (S/n)");
						continuar = scanner.next().charAt(0);
						System.out.println();

						if (continuar != 'S' && continuar != 's') {
							break;
						}
					}
					break;

				case 3:
					tarefas = agenda.exibirTarefas();
					if (tarefas == null || tarefas.isEmpty()) {
						System.out.println("É preciso adicionar tarefas para exibi-las");
						System.out.println();
					} else {
						System.out.println("Tarefas na lista:\n" + tarefas);
					}
					break;

				case 4:
				    tarefas = agenda.exibirTarefas();
				    if (tarefas == null || tarefas.isEmpty()) {
				        System.out.println("É preciso adicionar tarefas para exibi-las");
				        System.out.println();
				    } else {
				        System.out.println("Tarefas na lista:\n" + tarefas);
				        System.out.print("Informe a tarefa que foi concluída: ");
				        scanner.nextLine();
				        String tarefaConcluida = scanner.nextLine();

				        agenda.marcarTarefaConcluida(tarefaConcluida);
				        
				        System.out.println();

				        System.out.println("Tarefa '" + tarefaConcluida + "' marcada como concluída.");
				        System.out.println();
				    }
				    break;
					
				case 5:
                    System.out.println("Saindo do programa. Obrigado!");
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
					
				}
			}

		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}
}
