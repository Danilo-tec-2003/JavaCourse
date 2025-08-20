package intermediate_level.Stack;

import java.util.Stack;

public class Browser {

    // Histórico de páginas já visitadas
    Stack<String> back = new Stack<>();
    // Histórico de páginas que podem ser acessadas ao avançar
    Stack<String> next = new Stack<>();

    /**
     * Visita uma nova página:
     * - Adiciona a URL no histórico de "back"
     * - Limpa o histórico de "next", porque ao visitar uma nova página
     *   não faz mais sentido avançar para páginas antigas.
     */
    public void visit (String url) {
        back.push(url);  // adiciona nova página como atual
        next.clear(); // Limpa o histórico de "avançar"
        System.out.println("Visitando: " + url);
    }

    /**
     * Mostra a página atual (topo da pilha "back").
     */
    public void currentPage() {
        if (back.empty()) {
            System.out.println("Não há histórico de navegação.");
        } else {
            System.out.println("Página atual: " + back.peek());
        }
    }

    /**
     * Avança para a próxima página (se existir).
     * - Remove do topo de "next" e joga para "back".
     * - Assim, ela se torna a nova página atual.
     */
    public void advance() {
        if(!next.empty()) {
            String proximaPagina = next.pop(); // pega a próxima página
            back.push(proximaPagina); // adiciona ao histórico de "back"
            System.out.println("Avançando para: " + proximaPagina);
        }else {
            System.out.println("Não há histórico para avançar.");
        }
    }

    /**
     * Volta para a página anterior (se existir).
     * - Remove a página atual de "back" e joga para "next".
     * - A nova página atual será o topo de "back".
     */
    public void again() {
        if (back.size() <= 1) {
            // só tem a página atual ou nenhuma
            System.out.println("Não há histórico para voltar.");
        } else {
            String paginaAtual = back.pop();   // tira a atual
            next.push(paginaAtual);            // joga no histórico de avançar
            System.out.println("Voltando para: " + back.peek()); // mostra a nova atual
        }
    }

    public static void main(String[] args) {
        Browser navegador = new Browser();

        navegador.visit("google.com");
        navegador.currentPage();

        navegador.visit("youtube.com");
        navegador.currentPage();

        navegador.visit("github.com");
        navegador.currentPage();

        navegador.again();
        navegador.currentPage();

        navegador.again();
        navegador.currentPage();

        navegador.advance();
        navegador.currentPage();

        navegador.visit("stackoverflow.com");
        navegador.currentPage();

        navegador.advance();
    }
}

