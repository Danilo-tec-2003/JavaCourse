package intermediate_level.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueChallenger {
    public static void main(String[] args) {

        Queue<String> filaDeAtendimento = new LinkedList<>();

        //================================================================
        System.out.println("========================================");
        System.out.println("  SISTEMA DE GERENCIAMENTO DE FILA      ");
        System.out.println("========================================");
        System.out.println("\nInicializando o sistema e adicionando clientes iniciais...");

        filaDeAtendimento.add("Ana");
        filaDeAtendimento.add("Carlos");
        filaDeAtendimento.add("Mariana");
        filaDeAtendimento.add("Pedro");

        System.out.println("\n[STATUS] Clientes na fila: " + filaDeAtendimento);
        System.out.println("----------------------------------------");

        // ---- PRIMEIRO ATENDIMENTO ----
        System.out.println(">> Próximo cliente a ser atendido: " + filaDeAtendimento.peek());
        String clienteAtendido1 = filaDeAtendimento.poll(); // Remove o cliente e guarda o nome
        System.out.println(">> Atendendo cliente: " + clienteAtendido1 + "...");
        System.out.println(">> Atendimento de " + clienteAtendido1 + " finalizado.");

        System.out.println("\n[STATUS] Clientes na fila: " + filaDeAtendimento);
        System.out.println("----------------------------------------");


        // ---- CHEGADA DE NOVO CLIENTE ----
        System.out.println("(!) Nova cliente ('Julia') entrou na fila.");
        filaDeAtendimento.add("Julia");

        System.out.println("\n[STATUS] Clientes na fila: " + filaDeAtendimento);
        System.out.println("----------------------------------------");


        // ---- SEGUNDO ATENDIMENTO ----
        System.out.println(">> Próximo cliente a ser atendido: " + filaDeAtendimento.peek());
        String clienteAtendido2 = filaDeAtendimento.poll();
        System.out.println(">> Atendendo cliente: " + clienteAtendido2 + "...");
        System.out.println(">> Atendimento de " + clienteAtendido2 + " finalizado.");
        System.out.println("----------------------------------------");


        // ---- RELATÓRIO FINAL ----
        System.out.println("\n========================================");
        System.out.println("         RELATÓRIO FINAL DO DIA         ");
        System.out.println("========================================");
        System.out.println("Fila final: " + filaDeAtendimento);
        System.out.println("Total de clientes aguardando: " + filaDeAtendimento.size());

        // Usando um if/else ternário para uma mensagem mais amigável
        String statusFila = filaDeAtendimento.isEmpty() ? "A fila está vazia." : "Ainda há clientes na fila.";
        System.out.println("Status da Fila: " + statusFila);
        System.out.println("========================================");
    }
}