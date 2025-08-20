Estruturas de Dados: Array, List e Stack

1. Array (Vetor)
   Arrays são estruturas de dados fundamentais que armazenam uma coleção de elementos de tamanho fixo e do mesmo tipo de dado. Pense neles como uma sequência de caixas numeradas, onde cada caixa guarda um valor.

Características Principais:

Tamanho Estático: Uma vez que um array é criado, seu tamanho não pode ser alterado.

Tipos de Dados Homogêneos: Armazena apenas elementos do mesmo tipo (ex: int, String, double).

Acesso por Índice: Os elementos são acessados diretamente por sua posição (índice), que começa em 0. Isso torna o acesso a um elemento específico muito rápido.

Declaração e Inicialização em Java:


// Declara um array de Strings com 3 posições
String[] userArray = new String[3];
Principais Operações:

Atribuir um valor:

userArray[0] = "Danilo";
userArray[1] = "Maria";
userArray[2] = "João";

Acessar um valor:

System.out.println("O primeiro usuário é: " + userArray[0]); // Saída: Danilo
Verificar o tamanho:


System.out.println("Tamanho do array: " + userArray.length); // Saída: 3
2. List (Lista)
   Listas são interfaces que representam uma coleção ordenada de elementos. A implementação mais comum em Java é a ArrayList, que é como um "array dinâmico". Ela cresce e diminui de tamanho conforme você adiciona ou remove elementos.

Características Principais:

Tamanho Dinâmico: O tamanho da lista se ajusta automaticamente.

Permite Duplicatas: Você pode ter o mesmo elemento mais de uma vez na lista.

Mantém a Ordem de Inserção: Os elementos são armazenados e recuperados na mesma ordem em que foram adicionados.

Declaração e Inicialização em Java:


// Declara uma lista de Strings
List<String> userList = new ArrayList<>();
Principais Métodos:

Adicionar um elemento (.add()):


userList.add("Danilo Mendes");
userList.add("Ana Clara");
Remover um elemento (.remove()):

userList.remove("Ana Clara"); // Remove pelo valor
userList.remove(0);         // Remove pelo índice
Acessar um elemento (.get()):


System.out.println("Primeiro da lista: " + userList.get(0));
Verificar o tamanho (.size()):


System.out.println("Tamanho da lista: " + userList.size());
3. Stack (Pilha)
   Uma pilha é uma estrutura de dados que segue o princípio LIFO (Last-In, First-Out), ou seja, o último elemento a entrar é o primeiro a sair. É como uma pilha de pratos: você coloca um prato no topo e, quando vai pegar um, pega o que está no topo.

Características Principais:

Princípio LIFO: A principal regra que define seu funcionamento.

Acesso Restrito: Você só pode interagir com o elemento que está no topo da pilha.

Caso de Uso: Ótimo para funcionalidades como o botão "Voltar" de um navegador (você volta para a última página visitada), a função "Desfazer" (Ctrl+Z) em editores de texto, e o controle de chamadas de funções em programação.

Declaração e Inicialização em Java:

Java

    Stack<String> userStack = new Stack<>();
Principais Métodos:

Empilhar (.push()): Adiciona um elemento no topo da pilha.

userStack.push("Página 1: Home");
userStack.push("Página 2: Produtos");
userStack.push("Página 3: Carrinho");
Desempilhar (.pop()): Remove e retorna o elemento do topo da pilha.


String paginaRemovida = userStack.pop(); // Remove "Página 3: Carrinho"
System.out.println("Página removida: " + paginaRemovida);
Espiar (.peek()): Retorna o elemento do topo sem removê-lo.


String proximaPagina = userStack.peek(); // Retorna "Página 2: Produtos"
System.out.println("Próxima página no topo: " + proximaPagina);
Verificar o tamanho (.size()):

System.out.println("Quantidade de páginas na pilha: " + userStack.size());
Verificar se está vazia (.empty()):

System.out.println("A pilha está vazia? " + userStack.empty()); // Retorna fa