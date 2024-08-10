package ads.poo;

import java.util.ArrayList;

public class Pilha<E> {
//    generica -> Caixa
//    Capacidade definida na criacao
//    methods
//            empilhar
//          desempilhar
//    obter o elemento da pilha
//            consultarvazia
//    consultar cheia
//    nele vai utilizar exceptions

    private int tamanho;
    private E[] vetor;
    private int topo = -1;

    public Pilha(int tamanho) {
        this.tamanho = tamanho;
        vetor = (E[]) new Object[tamanho];
    }

    public boolean empilhar(E elemento) {
        if (topo < tamanho-1) {
            vetor[++topo] = elemento;
            return true;
        }

        return false;
    }

    public E desempilhar() {
        if (topo >= 0) {
            return vetor[topo--];
        }
        // Excessoes
    }

    public E obterElemento() {
        return vetor[topo];
    }

    public boolean consultarVazia() {
        if (topo == -1) {
            return true;
        }

        return false;
    }

    public boolean consultarCheia() {
        if (topo == tamanho) {
            return true;
        }

        return false;
    }
}
