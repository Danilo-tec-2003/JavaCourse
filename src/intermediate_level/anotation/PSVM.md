#  Anotação de Estudos: O que significa PSVM em Java?

## 🔹 O que é PSVM?
O termo **PSVM** é uma abreviação usada na comunidade Java para se referir ao método:

```java
public static void main(String[] args)
Esse é o ponto de entrada de um programa Java.
Sempre que você executa uma aplicação, a JVM (Java Virtual Machine) procura esse método para iniciar a execução do código.

🔹 Quebrando a declaração
1. public
É um modificador de acesso.

Significa que o método pode ser acessado de qualquer lugar.

Necessário porque a JVM precisa conseguir chamar esse método de fora da classe.

2. static
Indica que o método pertence à classe e não a uma instância (objeto).

Isso é importante porque a JVM chama o método sem precisar criar um objeto da classe principal.

3. void
É o tipo de retorno do método.

void significa que o método não retorna nada.

O main só executa instruções e não devolve valores.

4. main
É o nome padrão que a JVM procura como ponto de entrada.

Se você mudar esse nome, o programa não será iniciado automaticamente.

5. String[] args
É o parâmetro do método, um array de Strings.

Ele permite receber argumentos externos ao rodar o programa via linha de comando.

Exemplo:

java MinhaClasse argumento1 argumento2
No código, args[0] = "argumento1" e args[1] = "argumento2".

🔹 Exemplo completo
java
public class Exemplo {
    public static void main(String[] args) {
        System.out.println("Olá, mundo!");
        if (args.length > 0) {
            System.out.println("Primeiro argumento: " + args[0]);
        }
    }
}
Execução:
java Exemplo Teste

Saída:
Olá, mundo!
Primeiro argumento: Teste

✅ Resumo
P → public → acessível pela JVM.

S → static → não precisa de objeto para ser chamado.

V → void → não retorna valor.

M → main → ponto de entrada do programa.

➡️ PSVM é o coração de qualquer programa Java independente.


