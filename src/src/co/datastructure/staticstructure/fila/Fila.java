package co.datastructure.staticstructure.fila;

import co.datastructure.staticstructure.StaticStructure;

public class Fila<T> extends StaticStructure<T> {


    public Fila() {
        super();
    }

    public Fila(int capacity) {
        super(capacity);
    }

    public void enfileira(T element){
//        this.elements[this.size++] = element;
        this.addElement(element);
    }


    //espiar()              T
    public T espiar(){

        if(super.isEmpty()){
            return null;
        }

        return super.elements[0];
    }

    //desenfileirar()       T
    public T desenfileirar(){

        final int POS = 0;

        if(super.isEmpty()){
            return null;
        }

        T elementASerRemovido = super.elements[POS];

        super.removeElement(POS);

        return elementASerRemovido;
    }


    //aumentarCapacidade()  void
    //estaVazia()           boolean
    //tamanho()             int
    //toString()            String


}
