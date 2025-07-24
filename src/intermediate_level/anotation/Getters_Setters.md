Anotações de POO: Getters, Setters, Construtores e Herança
Esta anotação resume os pilares da Programação Orientada a Objetos de forma conceitual.

1. Encapsulamento: A Caixa-Forte dos Dados
   A ideia principal é proteger os dados de um objeto. Fazemos isso declarando seus atributos como private, o que os torna inacessíveis de fora da classe. Uma classe como a User funciona como um modelo ou uma "caixa-forte" para as informações de um usuário.

2. Getters e Setters: A Ponte para o Mundo Exterior
   Se os dados estão trancados, como interagimos com eles? Usamos métodos públicos que servem como uma ponte controlada.

Getters (Obter/Ler): São métodos para ler um valor protegido. Um getName() simplesmente nos devolve o nome que está guardado.

Setters (Definir/Modificar): São métodos para alterar um valor protegido. Um setName("novo nome") permite atualizar o nome, e opcionalmente, pode incluir regras de validação (ex: não aceitar um nome em branco).

3. Construtores: A "Certidão de Nascimento" do Objeto
   Um construtor é um método especial que é executado uma única vez, quando um objeto é criado com a palavra-chave new. Ele serve para inicializar o objeto, ou seja, dar a ele seus valores iniciais.

Construtor Parametrizado: Cria um objeto já "preenchido". Você passa os dados iniciais no momento da criação. new User("Danilo", 21, ...)

Construtor Padrão: Cria um objeto "em branco", que pode ser configurado depois usando os métodos setters. new User()

4. Herança: Reutilizando o Modelo
   Herança é um dos conceitos mais poderosos da POO. Ela permite que uma classe "filha" herde todos os atributos e métodos de uma classe "pai".

Palavra-chave extends: É como assinamos o "contrato de herança". A linha public class Mendes extends User significa que Mendes é uma especialização de User e automaticamente ganha tudo que User tem.

Palavra-chave super(): Dentro da classe filha, super() é usado para se comunicar com a classe pai. Frequentemente, é usado para chamar o construtor do pai, garantindo que a parte "herdada" do objeto seja inicializada corretamente.

5. Juntando Tudo na Prática
   Ao final, quando criamos um new Mendes(), estamos na verdade criando um objeto que é, ao mesmo tempo, um Mendes e um User.

Por causa da herança, podemos usar métodos como getName() e setName() diretamente em um objeto Mendes, mesmo que esses métodos tenham sido escritos apenas uma vez na classe User. A herança nos dá esse poder de reutilização, tornando o código muito mais limpo e organizado.