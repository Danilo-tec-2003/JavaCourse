Anotação Melhorada: Sobrecarga de Métodos em Java (Method Overloading)

 * O que é Sobrecarga de Métodos?

A sobrecarga de métodos (Method Overloading) é um recurso do Java que permite a existência de dois ou mais métodos com o mesmo nome dentro da mesma classe, desde que suas listas de parâmetros sejam diferentes.

A diferença na lista de parâmetros pode ser:

-Número diferente de parâmetros: um método somar(int, int) e outro somar(int, int, int).

-Tipo diferente de parâmetros: um método somar(int, int) e outro somar(double, double).

-Ordem diferente dos tipos de parâmetros: um método processar(int, String) e outro processar(String, int).

* Por que usar Sobrecarga?

O principal objetivo é melhorar a legibilidade e a manutenibilidade do código. Em vez de criar nomes de métodos ligeiramente diferentes para operações conceitualmente iguais, você usa um único nome.

Exemplo "Antes" (sem sobrecarga):

class Calculadora {
static int somarInteiros(int x, int y) {
return x + y;
}

    static double somarDecimais(double x, double y) {
        return x + y;
    }
}
Isso obriga o programador a lembrar de dois nomes diferentes (somarInteiros e somarDecimais) para a mesma operação (soma).

Exemplo "Depois" (com sobrecarga):

class Calculadora {
static int somar(int x, int y) {
return x + y;
}

    static double somar(double x, double y) {
        return x + y;
    }
}

// O compilador Java sabe qual método chamar com base nos argumentos que você passa.

public static void main(String[] args) {
int resultadoInt = Calculadora.somar(8, 5);         // Chama o método com parâmetros int
double resultadoDouble = Calculadora.somar(4.3, 6.26); // Chama o método com parâmetros double

    System.out.println("Soma de inteiros: " + resultadoInt);
    System.out.println("Soma de decimais: " + resultadoDouble);
}
O código fica mais limpo e intuitivo. Você apenas "pede para somar" e o Java descobre como fazer com base nos dados fornecidos.

. Regra Fundamental

Vários métodos podem ter o mesmo nome, desde que o compilador consiga diferenciá-los pela assinatura 
do método, que em Java consiste no nome do método e na lista de tipos de seus parâmetros. 
O tipo de retorno sozinho não é suficiente para diferenciar os métodos.

Use @Override apenas quando estiver sobrescrevendo um método herdado.

class Pai {
void falar() {
System.out.println("Pai falando...");
}
}

class Filho extends Pai {
@Override
void falar() {
System.out.println("Filho falando...");
}
}
