package co.datastructure.staticstructure.vetor;

import co.datastructure.staticstructure.StaticStructure;

public class Vetor<T> extends StaticStructure {

    private T[] elements;
    private int size;

    public Vetor(int capacity) {
        super(capacity);
        this.size = 0;
    }




}
