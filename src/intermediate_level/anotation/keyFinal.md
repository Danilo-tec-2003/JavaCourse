A Palavra-Chave final em Java
A palavra-chave final em Java é um modificador utilizado para restringir o comportamento de variáveis, métodos e classes. Essencialmente, ela torna o elemento imutável em seu contexto específico, garantindo que não possa ser alterado, sobrescrito ou herdado.

1. Variáveis Finais
   Quando final é aplicada a uma variável, seu valor só pode ser atribuído uma única vez. Após a inicialização, ela funciona como uma constante. Qualquer tentativa de reatribuir um valor a uma variável final resultará em um erro de compilação.

Observação Importante: Se a variável final for uma referência a um objeto, a referência é que se torna constante (não pode apontar para outro objeto). No entanto, o estado interno do objeto (seus atributos) ainda pode ser modificado.

2. Métodos Finais
   Um método declarado como final não pode ser sobrescrito (overridden) por uma subclasse. Isso é útil para garantir que o comportamento de um método crítico permaneça inalterado em toda a hierarquia de herança, evitando que classes filhas modifiquem sua implementação original.

3. Classes Finais
   Uma classe declarada como final não pode ser estendida (extended) ou herdada. Isso impede que qualquer outra classe se torne sua subclasse. É uma forma de "selar" a classe, garantindo que sua implementação não será modificada ou especializada. Um exemplo clássico é a classe String do Java, que é final.

Bônus: Parâmetros Finais
A palavra-chave final também pode ser usada nos parâmetros de um método. Isso significa que, dentro do escopo daquele método, o valor do parâmetro não pode ser reatribuído. Embora o método possa ler e usar o valor do parâmetro, ele não pode alterá-lo diretamente, o que pode ajudar a evitar erros e tornar o código mais claro.