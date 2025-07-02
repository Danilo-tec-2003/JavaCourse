****   herança:

usar características de uma classe mãe em outras classes filhas para reduzir trabalho

Foi criada dentro do package intermediate_level as respectivas profissões em forma de classes:

Desenvolvedor de software
UX Designer
Cineasta
Assistente Social

Onde na classe User tem todos os atributos básicos que qualquer ser humano tem:

nome
cidade
idade

E na classe principal, chamada de main, conseguimos definir os papéis de cada pessoa. Além de características em comum, seu diferencial é a profissão de cada um, instanciando e criando um novo objeto a partir da herança, evitando reescrever tudo novamente.

Exemplo:

Developer Danilo = new Developer(); // inicializando o objeto e declarando valores
Danilo.name = "Danilo Mendes";
Danilo.city = "Recife";
Danilo.age = 21;
Danilo.iamDeveloper();

// Criando usuário 2
SocialWorker Rebeca = new SocialWorker();
Rebeca.name = "Rebeca Nascimento";
Rebeca.city = "Recife";
Rebeca.age = 24;
Rebeca.iamSocialWorker();
Conseguimos ter acesso a esses atributos mesmo em classes distintas, pois, para utilizar da herança, ao criar os métodos podemos usar o extends, definindo qual classe vamos herdar e utilizar.

Ex:

public class Developer extends User {
    public void iamDeveloper() {
        System.out.println("Meu nome é " + name + ", atuo profissionalmente como Desenvolvedor de software!");
    }
}