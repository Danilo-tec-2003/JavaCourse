O que são Classes e Métodos Abstratos?
a palavra-chave é padrão. Uma classe abstrata define um "contrato parcial": ela fornece um esqueleto (com alguns ossos já montados, que são os métodos concretos) e obriga as subclasses a fornecerem o restante da estrutura (os métodos abstratos).

Classes e métodos abstratos são ferramentas fundamentais da POO para criar hierarquias de classes coesas e padronizadas. Eles garantem que um conjunto de subclasses compartilhe uma estrutura e comportamentos comuns (uma relação "É UM" — um Cachorro É UM Animal), ao mesmo tempo que força cada uma a implementar suas próprias versões de comportamentos específicos.

Como tornar uma Classe/Método Abstrato?
Se uma classe herda de uma classe abstrata e não implementa todos os métodos abstratos herdados, essa subclasse também deve ser declarada como abstrata.

Características de uma Classe Abstrata

Uma classe abstrata pode (e frequentemente tem) construtores. Como ela não pode ser instanciada diretamente (new Animal()), seu construtor é chamado exclusivamente pela subclasse através da palavra-chave super(). Seu propósito é inicializar os atributos que são comuns a todas as subclasses, ou seja, os atributos definidos na própria classe abstrata.

Diferenças e Semelhanças: Classe Abstrata vs. Interface
A questão mais importante para um desenvolvedor é: "Quando usar uma ou outra?"

Guia Prático de Escolha:

Use uma Classe Abstrata quando:

Você quer compartilhar código (estado e comportamento) entre várias subclasses relacionadas.

As classes que herdam dela têm uma forte relação "É UM" e compartilham uma base comum (ex: Carro e Motocicleta são tipos de Veiculo).

Você precisa de atributos não-públicos, não-finais ou não-estáticos.

Use uma Interface quando:

Você quer definir um "contrato" de comportamento que pode ser implementado por classes de hierarquias completamente diferentes (ex: SmartTV e RoboAspirador podem ambos implementar a interface Conectavel).

Você quer aproveitar a herança múltipla de tipo.

Você está definindo uma capacidade ou habilidade (ex: Runnable, Comparable, Serializable).