package co.datastructure.staticstructure.pilha;

import co.datastructure.staticstructure.StaticStructure;

public class  Stack<T> extends StaticStructure<T> {

    //Constructors
    public Stack(){
        super(10);
    }

    public Stack(int capacity) {
        super(capacity);
        this.size = 0;
    }


    //Method for Stacking Element
    public void pileUp(T element){
        super.addElement(element);
    }

    //Check Top of Stack Element
    public T printElementTopStack(){
        if(this.isEmpty()){
            return null;
        }
        return this.elements[(this.size-1)];
    }

    //Method for unstacking
    public T Unstack(){
        if(this.isEmpty()){
            return null;
        }

        return this.elements[--this.size];
    }



}
