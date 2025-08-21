🏆 Desafio: Gerenciador de Atendimento
O Problema:

Você está criando um sistema simples para gerenciar uma fila de atendimento ao cliente em uma loja. Os clientes chegam e entram na fila. Quando um atendente fica livre, ele chama o próximo cliente da fila.

Sua Missão:

Escreva um programa em Java que simule o fluxo de atendimento. Seu programa deve:

Criar a Fila: Inicialize uma Queue de String para representar a fila de clientes.

Adicionar Clientes: Adicione os seguintes clientes à fila, exatamente nesta ordem:

"Ana"

"Carlos"

"Mariana"

"Pedro"

Mostrar a Fila: Imprima no console a fila completa de clientes que estão aguardando.

Atender o Próximo:

Mostre quem é o próximo cliente a ser atendido (sem removê-lo da fila ainda).

Depois, atenda (remova) o cliente da fila.

Imprima no console a fila atualizada após o atendimento.

Adicionar um Novo Cliente: Um novo cliente, "Julia", chegou. Adicione-a ao final da fila.

Atender Mais um: Atenda o próximo cliente da fila (remova-o).

Verificar o Estado Final: Imprima no console:

A fila final de clientes.

Uma mensagem dizendo se a fila está vazia ou não.

Como Começar:

Você pode usar o código das nossas anotações como base. Crie uma classe DesafioFila com um método main e siga os passos acima.

Exemplo da Saída Esperada no Console:

Fila de espera inicial: [Ana, Carlos, Mariana, Pedro]
O próximo cliente a ser atendido é: Ana
Fila após atender Ana: [Carlos, Mariana, Pedro]
Fila final: [Mariana, Pedro, Julia]
A fila está vazia? false
Dicas:

Passo 1: Queue<String> filaAtendimento = new LinkedList<>();

Passo 2: Use o método add() quatro vezes.

Passo 4: Use peek() para ver e poll() para remover.

Passo 7: Use isEmpty() para a verificação final.

Este desafio vai te forçar a usar todos os métodos principais (add, poll, peek, isEmpty) em um contexto prático. Boa sorte!