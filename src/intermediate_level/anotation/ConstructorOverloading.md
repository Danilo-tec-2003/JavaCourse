Estudo Prático de Conceitos Java: Sobrecarga e Enums
Este repositório é um exercício prático focado em aprofundar o conhecimento em conceitos essenciais da Programação Orientada a Objetos (POO) em Java. O projeto parte de anotações de estudo e as transforma em código funcional, aplicando teoria na prática.

🎯 Objetivo
O objetivo principal é solidificar o entendimento sobre Sobrecarga de Construtores e Métodos, o uso de Enums para criar um código mais robusto e legível, e a utilização de boas práticas como comentários //TODO.

📚 Conceitos Abordados
1. Sobrecarga de Construtores (Constructor Overloading)
   A sobrecarga de construtores permite que uma classe tenha múltiplos construtores, cada um com uma assinatura de método diferente (ou seja, diferentes parâmetros). Isso oferece flexibilidade para criar objetos de maneiras distintas, seja com um conjunto básico de informações ou com todos os atributos detalhados. No código, a palavra-chave this() é usada para encadear construtores e evitar a repetição de código.

2. Sobrecarga de Métodos (Method Overloading)
   De forma similar aos construtores, a sobrecarga de métodos permite que existam múltiplos métodos com o mesmo nome, desde que seus parâmetros sejam diferentes. Isso é útil para executar uma ação parecida de formas variadas. Por exemplo, um método calcularPagamento() pode ter diferentes versões para calcular pagamentos com bônus, horas extras, etc.

3. Enums (Enumerações)
   Enums são um tipo especial de classe usados para representar um conjunto fixo de constantes. São a forma ideal de se trabalhar com valores que não mudam, como cargos em uma empresa, dias da semana ou status de um pedido. O uso de Enums torna o código mais seguro (evitando erros de digitação com Strings) e mais claro. Por convenção, seus valores são declarados em MAIÚSCULAS.

4. Comentários //TODO
   Um marcador padrão na indústria de software para sinalizar um ponto no código que requer trabalho futuro. Funciona como um lembrete para o desenvolvedor sobre uma funcionalidade a ser implementada, um bug a ser corrigido ou uma melhoria a ser feita.

🛠️ Estrutura do Código
O projeto está organizado com base nos desafios propostos:

Produto.java: Demonstra a sobrecarga de construtores para criar um produto com informações básicas ou completas.

StatusPedido.java: Um Enum que define os estados possíveis de um pedido (PROCESSANDO, APROVADO, etc.).

Pedido.java: Classe que integra os outros componentes, gerenciando um Produto e seu StatusPedido.

DesafiosApp.java (ou similar): A classe principal (main) utilizada para instanciar os objetos e testar as funcionalidades, resolvendo os desafios propostos.

🚀 Desafios Propostos
O código neste repositório é a solução para os seguintes desafios:

Desafio 1: Expandindo a Classe Produto

Criar a classe Produto com atributos e dois construtores sobrecarregados.

Desafio 2: Métodos de Venda e Enum StatusPedido

Criar o Enum StatusPedido.

Implementar métodos vender() sobrecarregados na classe Produto.

Desafio 3: Classe Pedido

Criar a classe Pedido que utiliza um objeto Produto e um StatusPedido.

Implementar a lógica para aprovar ou cancelar um pedido com base no estoque do produto.

💻 Como Executar
Certifique-se de ter o JDK (Java Development Kit) instalado e configurado em seu sistema.

Clone ou faça o download deste repositório.

Abra um terminal na pasta raiz do projeto.

Compile todos os arquivos .java:



javac *.java
Execute a classe principal que contém o método main:



java NomeDaSuaClassePrincipalApp