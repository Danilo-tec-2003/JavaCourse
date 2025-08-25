package intermediate_level.intermediate_level_Challenger6;

import java.util.LinkedList;

public class MainUser {
    public static void main(String[] args) {
        LinkedList<UserData> users = new LinkedList<>();
        users.add(new UserData("Danilo", 21, "Recife"));
        users.add(new UserData("Rebeca", 23, "Recife"));
        users.add(new UserData("Denilson", 53, "Recife"));
        users.add(new UserData("Yane", 33, "Recife"));
        users.add(new UserData("Ivanice", 50, "Recife"));
        users.add(new UserData("Kayky", 21, "Recife"));
        users.add(new UserData("Richard", 18, "Recife"));

        System.out.println("=== Lista de Usuários Inicial ===");
        // Usando o método toString() da classe UserData,
        // o `for-each` exibe os objetos de forma legível.
        for (UserData user : users) {
            System.out.println(user);
        }
        System.out.println("Tamanho da lista: " + users.size());

        // Removendo o primeiro usuário
        System.out.println("\nRemovendo o primeiro usuário...");
        UserData userRemovido = users.removeFirst();
        System.out.println("Usuário removido: " + userRemovido.getNome());

        System.out.println("\n=== Lista após a remoção ===");
        for (UserData user : users) {
            System.out.println(user);
        }
        System.out.println("Tamanho da lista: " + users.size());

        // Adicionando um novo usuário no início da lista
        System.out.println("\nAdicionando o usuário 'Ana' no início...");
        users.addFirst(new UserData("Ana", 25, "Recife"));

        System.out.println("\n=== Lista após a adição de 'Ana' ===");
        for (UserData user : users) {
            System.out.println(user);
        }
        System.out.println("Tamanho da lista: " + users.size());

        // Acessando um usuário em uma posição específica
        int posicao = 4; // Posição 4 (índice 3)
        if (posicao - 1 >= 0 && posicao - 1 < users.size()) {
            UserData usuarioNaPosicao = users.get(posicao - 1);
            System.out.println("\nUsuário na posição " + posicao + ": " + usuarioNaPosicao);
        } else {
            System.out.println("\nPosição " + posicao + " não é válida na lista.");
        }
    }
}