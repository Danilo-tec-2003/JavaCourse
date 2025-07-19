## 🧪 O que é um Método?

Um **método** em Java é uma função que representa uma ação ou comportamento de um objeto. Ele pode ser usado para **executar tarefas**, **manipular valores** ou **retornar informações**.


### 📌 Exemplo prático:

```java
Danilo.name.toLowerCase();
Nesse exemplo, toLowerCase() é um método da classe String que transforma o valor da variável name em letras minúsculas.

✅ Tipos de Métodos
1. void – Método sem retorno
Um método void executa uma ação, mas não retorna nenhum valor. É útil para tarefas como exibir mensagens no console.

public void greet() {
    System.out.println("Olá, tudo bem?");
}
Uso:
Danilo.greet();
2. Método com return – Método com retorno
Um método com return retorna um valor que pode ser armazenado em uma variável e usado posteriormente. O tipo do retorno pode ser String, int, boolean, etc.


public String iamDeveloper() {
    return "Eu sou um Desenvolvedor!";
}

String callingMethod = Danilo.iamDeveloper();
System.out.println(callingMethod);

🔓 O que significa public?
A palavra-chave public indica que o método pode ser acessado de qualquer parte do projeto.
É o modificador de acesso mais comum em métodos que precisam ser utilizados por outras classes.

🧠 Resumo
Método = ação ou comportamento do objeto.

void: não retorna valor, apenas executa.

return: retorna um valor, que pode ser usado.

public: permite que o método seja acessado em qualquer parte do código.