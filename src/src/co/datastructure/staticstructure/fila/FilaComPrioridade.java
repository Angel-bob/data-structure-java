package co.datastructure.staticstructure.fila;

public class FilaComPrioridade<T> extends Fila<T>{

    @Override
    public void enfileira(T element) {

        Comparable<T> chave = (Comparable<T>) element;

        int i;
        for(i = 0; i<this.size; i++){

            if(chave.compareTo(this.elements[i]) < 0){
                break;
            }

        }
        this.addElement(i, element);
    }



}
