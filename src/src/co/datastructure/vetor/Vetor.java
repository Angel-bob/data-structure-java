package co.datastructure.vetor;

public class Vetor {

    //Attributes
    private String[] elements;
    private int size;

    //Constructor
    public Vetor(int capacity){
        elements = new String[capacity];
        size = 0;
    }

    //return size
    public int getSize() {
        return size;
    }

    //method to add element
    public boolean addElement(String element){
        if(this.size < this.elements.length){
            this.elements[size] = element;
            size++;
            return true;
        }
        return false;
    }

    //add element in any position
    public boolean addElement(int index, String element){
        if (!(index >= 0 && index < this.size)){
            throw new IllegalArgumentException("invalid position");
        }

        for (int i = this.size-1; i >= index; i--){
            this.elements[i+1] = this.elements[i];
        }
        this.elements[index] = element;
        this.size++;
        return true;
    }

    //method to get element from a position
    public String getElement(int index){
        if (!(index >= 0 && index < this.size)){
            throw new IllegalArgumentException("invalid position");
        }
        return this.elements[index];
    }

    //method to check if element exists
    public int checkElement(String element){
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
