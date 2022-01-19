package br.edu.ifma.aedii.grafos.questao01;

import java.util.ArrayList;

public class Vertice<T> {
    private T dado;
    private ArrayList<Aresta<T>> arestasDeEntrada;
    private ArrayList<Aresta<T>> arestasDeSaida;

    public Vertice(T dado) {
        this.dado = dado;
        this.arestasDeEntrada = new ArrayList<Aresta<T>>();
        this.arestasDeSaida = new ArrayList<Aresta<T>>();
    }

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public void adicionarArestasDeEntrada(Aresta<T> aresta) {
        this.arestasDeEntrada.add(aresta);
    }

    public void adicionaArestasDeSaida(Aresta<T> aresta) {
        this.arestasDeSaida.add(aresta);
    }
}
