package co.datastructure.staticstructure;

import java.lang.reflect.Array;

public abstract class StaticStructure<T> {

    //Attributes
    protected T[] elements;
    protected int size;

    //Constructor
    @SuppressWarnings("Unchecked")
    public StaticStructure(int capacity){
        this.elements = (T[]) new Object[capacity];
        this.size = 0;
    }

    public StaticStructure(int capacity, Class<T> classType){
        this.elements = (T[]) Array.newInstance(classType, capacity);
        this.size = 0;
    }

    public StaticStructure() {
        super();
        this.elements = (T[]) new Object[10];
    }


    //return size
    public int getSize() {
        return this.size;
    }


    //method to add element
    protected boolean addElement(T element){
        this.increaseCapacity();

        if(this.size < this.elements.length){
            this.elements[this.size] = (T) element;
            size++;
            return true;
        }
        return false;
    }

    //verify index
    private boolean verifyIndex(int index){
        if (!(index >= 0 && index < this.size)){
            throw new IllegalArgumentException("invalid position");
        }
        return true;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    //add element in any position
    protected boolean addElement(int index, T element){
        this.verifyIndex(index);
        this.increaseCapacity();

        for (int i = this.size-1; i >= index; i--){
            this.elements[i+1] = this.elements[i];
        }
        this.elements[index] = element;
        this.size++;
        return true;
    }

    //remove element
    public boolean removeElement(int index){
        this.verifyIndex(index);

        for (int i = index; i <= size-1; i++){
            this.elements[i] = this.elements[i+1];
        }
        size--;
        return true;
    }

    public void removeElement(T element){
        int indexEl = 0;

        for(int i = 0; i < this.size; i++){
            if(this.elements[i].equals(element)){
                indexEl = i;
            }
        }

        for (int i = indexEl; i <= size-1; i++){
            this.elements[i] = this.elements[i+1];
        }
        size--;


    }

    //Increasing Vector Capacity
    private void increaseCapacity(){
        if(this.size == this.elements.length){
            T[] newElements = (T[]) new Object[this.elements.length * 2];
            for(int i = 0; i < this.size; i++){
                newElements[i] = this.elements[i];
            }
            this.elements = newElements;
        }
    }


    //method to get element from a position
    public T getElement(int index){
        this.verifyIndex(index);
        return this.elements[index];
    }

    //method to check if element exists
    public int checkElement(T element){
        for(int i = 0; i < this.size; i++){
            if(this.elements[i].equals(element)){
                return 1;
            }
        }
        return -1;
    }

    //remove elements
    public void clear(){
        //this.elements = new String[this.elements.length];

        for(int i = 0; i < this.elements.length; i++){
            this.elements[i] = null;
        }
        this.size = 0;
    }



    //Print elements
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");

        for(int i = 0; i < this.size-1; i++){
            s.append(this.elements[i]);
            s.append(", ");
        }

        if(size > 0){
            s.append(this.elements[this.size-1]);
        }

        s.append("]");

        return s.toString();
    }
}
