package br.edu.ifma.aedii.grafos.questao01;

import java.util.ArrayList;

public class Grafo<T> {
    private ArrayList<Vertice<T>> vertices;
    private ArrayList<Aresta<T>> arestas;

    public Grafo() {
        this.vertices = new ArrayList<Vertice<T>>();
        this.arestas = new ArrayList<Aresta<T>>();
    }

    private Vertice<T> getVertice(T dado) {
        Vertice<T> vertice = null;
        for (int i = 0; i < this.vertices.size(); i++) {
            if (this.vertices.get(i).getDado().equals(dado)) {
                vertice = this.vertices.get(i);
                break;
            }
        }
        return vertice;
    }

    public void adicionarVertice(T dado) {
        Vertice<T> novoVertice = new Vertice<T>(dado);
        this.vertices.add(novoVertice);
    }

    public void adicionarAresta(Integer peso, T dadoDoInicio, T dadoDoFim) {
        Vertice<T> inicio = this.getVertice(dadoDoInicio);
        Vertice<T> fim = this.getVertice(dadoDoFim);
        Aresta<T> aresta = new Aresta<>(peso, inicio, fim);
        inicio.adicionaArestasDeSaida(aresta);
        fim.adicionarArestasDeEntrada(aresta);
        this.arestas.add(aresta);
    }
}
