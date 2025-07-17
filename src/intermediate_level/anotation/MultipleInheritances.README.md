1. Herança Múltipla de Estado (Proibida em Java)
 A "herança múltipla de estado" refere-se a herdar os atributos (campos) de mais de uma superclasse. Java proíbe isso para evitar um problema clássico e complexo.

O Problema do Diamante (The Diamond Problem):
É o principal motivo para essa proibição. Imagine que as classes Scanner e Impressora herdam da classe DispositivoUSB. Ambas poderiam ter, por exemplo, um atributo versaoUSB. Agora, se você pudesse criar uma classe Multifuncional que herda de Scanner e Impressora (class Multifuncional extends Scanner, Impressora), qual versaoUSB ela deveria herdar? A do Scanner ou a da Impressora? Essa ambiguidade cria um estado inconsistente e imprevisível.

Herança Múltipla de Estado (via extends): Em Java, uma classe não pode herdar (extends) de mais de uma outra classe. Esta restrição existe para prevenir a Herança Múltipla de Estado, que seria herdar atributos (campos) de múltiplas fontes. A proibição evita problemas de ambiguidade, como o "Problema do Diamante", onde o compilador não saberia qual atributo ou método da superclasse escolher caso haja conflitos de nome, levando a um estado do objeto inconsistente.

2. Herança Múltipla de Implementação (Limitada em Java)
Aqui, sua anotação toca em um ponto crucial que mudou um pouco com o tempo em Java. Originalmente, interfaces não continham implementação (lógica de método). Desde o Java 8, elas podem ter default methods.

Antes do Java 8: Interfaces só definiam "o quê" fazer (assinaturas de métodos), não "como" fazer. A implementação era 100% responsabilidade da classe.

A partir do Java 8: Com os default methods, uma interface pode fornecer uma implementação padrão. Isso permite uma forma limitada e controlada de herança de implementação. No entanto, Java tem regras estritas para resolver conflitos caso uma classe implemente duas interfaces com um default method de mesma assinatura. A classe é obrigada a sobrescrever o método, resolvendo a ambiguidade de qual implementação usar.

Herança Múltipla de Implementação (via default methods em interfaces): Refere-se à capacidade de herdar o comportamento (código/lógica de métodos) de múltiplas fontes.

Com classes (extends): É proibida, pelos mesmos motivos da herança de estado.

Com interfaces (implements): É permitida de forma limitada desde o Java 8 através dos default methods. Uma interface pode fornecer uma implementação padrão para um método. Se uma classe implementa duas interfaces que têm um default method com a mesma assinatura, o Java força o desenvolvedor a sobrescrever (reimplementar) o método na classe, eliminando a ambiguidade.

3. Herança Múltipla de Tipo (Permitida e Incentivada em Java)
Sua definição está perfeita! Este é o pilar do polimorfismo em Java e um dos conceitos mais poderosos da linguagem. É o "jeito Java" de se obter os benefícios da herança múltipla sem as suas complexidades.

Herança Múltipla de Tipo (via implements): Este é o modelo suportado e amplamente utilizado em Java. Uma classe pode implementar (implements) múltiplas interfaces. Ao fazer isso, a classe "assina um contrato", prometendo fornecer a implementação para os métodos abstratos de todas as interfaces que implementa. Isso significa que um objeto dessa classe possui múltiplos tipos: o tipo da sua própria classe e os tipos de cada interface que ela implementa. Essa capacidade é fundamental para o polimorfismo, permitindo que o mesmo objeto seja tratado de diferentes maneiras, dependendo do contexto (da interface) pela qual está sendo referenciado.