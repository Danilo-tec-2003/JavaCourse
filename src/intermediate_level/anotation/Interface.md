* Entendendo Interfaces em Java
A Janela
Uma INTERFACE funciona como uma janela. Através dela, podemos acessar um conjunto de funcionalidades (métodos) de um objeto, sem precisar saber como toda a
classe funciona por dentro. Você usa o que é necessário e vai embora.

Quando Usar
Usamos uma interface quando precisamos que classes de "famílias" diferentes (que não herdam da mesma superclasse) compartilhem um mesmo comportamento e possam
ser tratadas da mesma forma.

O Contrato: implements vs. extends
Assim como usamos extends para herdar código e atributos de uma classe, usamos implements para "assinar o contrato" de uma interface e garantir que nossa classe
tenha certos métodos.

As Regras do Contrato
A Interface Dita as Regras, a Classe Executa o Trabalho.
Por padrão, a interface apenas define quais métodos devem existir, mas não armazena o código de como eles funcionam. A classe que a implementa é quem tem
 a responsabilidade de escrever esse código.


A Obrigação de Implementar.
Ao usar implements, sua classe assume um compromisso: para cada método abstrato declarado na interface, sua classe é obrigada a fornecer a implementação
(o corpo do método). Não é que você "tem que chamar" o método, é que você tem que construir o método prometido.

Com certeza. Adicionar um exemplo prático com o seu próprio código é a melhor forma de solidificar o entendimento.

Vou anexar a seção de exemplo ao final do README que acabamos de ajustar.

README.md
Entendendo Interfaces em Java
A Janela
Uma INTERFACE funciona como uma janela. Através dela, podemos acessar um conjunto de funcionalidades (métodos) de um objeto, sem precisar saber como toda a classe funciona por dentro. Você usa o que é necessário e vai embora.

Quando Usar
Usamos uma interface quando precisamos que classes de "famílias" diferentes (que não herdam da mesma superclasse) compartilhem um mesmo comportamento e possam ser tratadas da mesma forma.

O Contrato: implements vs. extends
Assim como usamos extends para herdar código e atributos de uma classe, usamos implements para "assinar o contrato" de uma interface e garantir que nossa classe tenha certos métodos.

As Regras do Contrato
A Interface Dita as Regras, a Classe Executa o Trabalho.
Por padrão, a interface apenas define quais métodos devem existir, mas não armazena o código de como eles funcionam. A classe que a implementa é quem tem a responsabilidade de escrever esse código.

(Observação: A partir do Java 8, interfaces podem ter métodos default, que são uma exceção a essa regra e já vêm com uma implementação pronta que pode ser usada ou sobrescrita).

A Obrigação de Implementar.
Ao usar implements, sua classe assume um compromisso: para cada método abstrato declarado na interface, sua classe é obrigada a fornecer a implementação (o código) para ele. Não é que você "tem que chamar" o método, é que você tem que construir o método prometido.

Exemplo Prático

1. O Contrato: characteristicCouple.java
Este é o nosso "contrato". Ele exige que qualquer classe que o assine seja capaz de descrever a cor dos olhos e da pele.

Java
public interface characteristicCouple {
    void LightEyes();
    void SkinColor();
}

2. As Classes que Assinam o Contrato
Temos classes diferentes que concordaram em seguir essas regras: Developer (o pai), SocialWorker (a mãe) e DanteSon (o filho).

Java
public class Developer extends User implements characteristicCouple {

    public void LightEyes() { /* implementação */ }
    public void SkinColor() { /* implementação */ }
}

Java
public class DanteSon extends User implements characteristicCouple {

    public void LightEyes() { /* implementação */ }
    public void SkinColor() { /* implementação */ }
}

3. Usando a "Janela" para Tratar Todos da Mesma Forma
Agora vem a mágica. Como todos eles assinaram o mesmo contrato (characteristicCouple), podemos tratá-los da mesma forma através da "janela" da interface,
sem nos importarmos com o fato de um ser Developer e o outro ser DanteSon.

dessa forma conseguimos definir que Dante, filho de Danilo e Rebeca consegue herdar coisas em comuns entre eles como no exemplo de herdar os olhos claros dos pais com
o metodo LightEyes() {} e o tom de pele da mãe SkinColor()

dando um resultado final de:

"""
--- Características do Casal e Filho ---
   Danilo Mendes tem olhos claros.
   Rebeca Nascimento tem a pele negra de tom claro.

   --- Características do Filho ---
   Nome: Dante Mendes do Nascimento, Idade: 1 ano.
   Dante Mendes do Nascimento tem olhos claros.
   Dante Mendes do Nascimento tem a pele negra de tom claro.
                                                            """"""

