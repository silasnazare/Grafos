package br.edu.ifma.aedii.grafos.questao01;

public class App {
    public static void main(String[] args) {
        Grafo<String> grafo = new Grafo<String>();
        grafo.adicionarVertice("A");
        grafo.adicionarVertice("B");
        grafo.adicionarVertice("C");
        grafo.adicionarVertice("D");
        grafo.adicionarVertice("E");
        grafo.adicionarVertice("F");

        grafo.adicionarAresta(60, "F", "A");
        grafo.adicionarAresta(10, "F", "D");
        grafo.adicionarAresta(70, "F", "C");
        grafo.adicionarAresta(30, "C", "E");
        grafo.adicionarAresta(20, "C", "B");
        grafo.adicionarAresta(50, "E", "F");
        grafo.adicionarAresta(10, "D", "B");
    }
}
