Encapsulamento em Programação Orientada a Objetos (POO)
O encapsulamento é um dos quatro pilares fundamentais da Programação Orientada a Objetos (POO). A ideia principal é agrupar atributos (dados) e métodos (comportamentos) que operam nesses dados dentro de uma única unidade, a classe.

Além disso, o encapsulamento promove o ocultamento de dados (data hiding), que consiste em proteger os atributos de uma classe contra o acesso e a modificação direta e indevida. O acesso ao estado interno do objeto é controlado através de métodos públicos.

Modificadores de Acesso

Para controlar a visibilidade de atributos e métodos, usamos os modificadores de acesso. Os mais comuns são:
private: O atributo ou método só pode ser acessado de dentro da própria classe. Esta é a base do encapsulamento forte.
public: O atributo ou método pode ser acessado por qualquer outra classe.
Regra geral: Por uma boa prática de programação, os atributos devem ser sempre private, e o acesso a eles deve ser mediado por métodos public.

Métodos de Acesso: Getters e Setters

Para permitir que o mundo exterior interaja com os atributos privados de uma forma controlada, usamos métodos de acesso públicos, conhecidos como Getters e Setters.
Getter (get): Um método público que resgata (obtém) o valor de um atributo privado. Ele geralmente não recebe parâmetros e retorna um valor do mesmo tipo do atributo.
Convenção de nomenclatura: get + NomeDoAtributo() (ex: getNome()).
Setter (set): Um método público que define (modifica) o valor de um atributo privado. Ele geralmente recebe um parâmetro do mesmo tipo do atributo e não retorna nada (void).
Convenção de nomenclatura: set + NomeDoAtributo() (ex: setNome(novoNome)).
A grande vantagem de usar um método set é a capacidade de adicionar lógica e validação antes de alterar o valor de um atributo. Por exemplo, podemos impedir que uma idade seja negativa ou que um nome seja nulo.

Vantagens Resumidas do Encapsulamento

Controle: A classe tem total controle sobre seus atributos e como eles são modificados.
Segurança: Protege os dados contra modificações acidentais ou maliciosas, garantindo a integridade do objeto.
Flexibilidade: A implementação interna da classe pode ser alterada (ex: mudar o tipo de um atributo) sem que isso afete as outras classes que a utilizam, desde que a assinatura dos métodos públicos seja mantida.
Reutilização: Classes bem encapsuladas são mais fáceis de reutilizar em diferentes partes de um sistema ou em outros projetos.


