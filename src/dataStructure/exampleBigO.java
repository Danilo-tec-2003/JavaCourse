package dataStructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Exemplo Prático de Código em Java
//Para a sua anotação de "crie um for para imprimir de 1 a 100", veja um exemplo que você pode usar para comparar o tempo de execução. O tempo de nano segundos não vai mostrar uma grande diferença para 100 elementos, mas ilustra a técnica para listas muito grandes.

public class exampleBigO {
    public static void main(String[] args) {


                // Criando uma lista grande para o teste
                int tamanho = 100000;

                // --- ArrayList ---
                List<Integer> arrayList = new ArrayList<>();
                long inicioArrayList = System.nanoTime();
                for (int i = 0; i < tamanho; i++) {
                    arrayList.add(i);
                }
                long fimArrayList = System.nanoTime();
                long tempoArrayList = fimArrayList - inicioArrayList;
                System.out.println("ArrayList - Tempo para adicionar " + tamanho + " elementos: " + tempoArrayList + " nanos");


                // --- LinkedList ---
                List<Integer> linkedList = new LinkedList<>();
                long inicioLinkedList = System.nanoTime();
                for (int i = 0; i < tamanho; i++) {
                    linkedList.add(i);
                }
                long fimLinkedList = System.nanoTime();
                long tempoLinkedList = fimLinkedList - inicioLinkedList;
                System.out.println("LinkedList - Tempo para adicionar " + tamanho + " elementos: " + tempoLinkedList + " nanos");
            }

        };
