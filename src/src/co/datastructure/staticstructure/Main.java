package co.datastructure.staticstructure;

import co.datastructure.staticstructure.fila.Fila;
import co.datastructure.staticstructure.fila.FilaComPrioridade;
import co.datastructure.staticstructure.pilha.Stack;

import java.nio.channels.FileLockInterruptionException;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        FilaComPrioridade<Integer> filaComPrioridade = new FilaComPrioridade();
        Fila<Integer> fila = new Fila<>();
        Stack<Integer> pilha = new Stack<>();

        pilha.pileUp(1);
        pilha.pileUp(3);
        pilha.pileUp(2);


        fila.enfileira(1);
        fila.enfileira(3);
        fila.enfileira(2);

        filaComPrioridade.enfileira(1);
        filaComPrioridade.enfileira(3);
        filaComPrioridade.enfileira(2);


        //ordenar

        System.out.println(filaComPrioridade);
        System.out.println(fila);
        System.out.println(pilha);













    }







}
