package co.datastructure.vetor;

public class VetorObjects {

    //Attributes
    private Object[] elements;
    private int size;

    //Constructor
    public VetorObjects(int capacity){
        elements = new Object[capacity];
        size = 0;
    }

    //return size
    public int getSize() {
        return this.size;
    }

    //method to add element
    public boolean addElement(Object element){
        this.increaseCapacity();

        if(this.size < this.elements.length){
            this.elements[this.size] = element;
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

    //add element in any position
    public boolean addElement(int index, Object element){
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

    public void removeElement(Object element){
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
            Object[] newElements = new Object[this.elements.length * 2];
            for(int i = 0; i < this.size; i++){
                newElements[i] = this.elements[i];
            }
            this.elements = newElements;
        }
    }


    //method to get element from a position
    public Object getElement(int index){
        this.verifyIndex(index);
        return this.elements[index];
    }

    //method to check if element exists
    public int checkElement(Object element){
        for(int i = 0; i < this.size; i++){
            if(this.elements[i].equals(element)){
                return 1;
            }
        }
        return -1;
    }



    //Print elements
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[ ");

        for(int i = 0; i < this.size-1; i++){
            s.append(this.elements[i]);
            s.append(", ");
        }

        if(size > 0){
            s.append(this.elements[this.size-1]);
        }

        s.append(" ]");

        return s.toString();
    }
}
