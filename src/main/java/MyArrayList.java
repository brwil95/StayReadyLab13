import java.util.Arrays;

public class MyArrayList <E>{

    private Object[] expansiveArray;
    private int capacity;
    private int size;


    public MyArrayList() {
        expansiveArray = new Object[0];
        capacity = 0;
        size = 0;
    }

    public MyArrayList(int size) {
        expansiveArray = new Object[size];
        capacity = 0;
        this.size = size;
    }

    public int size() {
        //Returns the number of elements in this list
        return expansiveArray.length;
    }

    public void add(E element) {
        //Appends the specified element to the end of this list
        if(capacity == size) {
            resize();
        }
        expansiveArray[capacity] = element;
        capacity++;
    }

    public void add(int index, E element) {
        //Inserts the specified element at the specified position in this list
        if(capacity == size) {
            resize();
        }
        expansiveArray[index] = element;
        capacity++;
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        //Returns the element at the specified position in this list
        return (E) expansiveArray[index];
    }

    public void set(int index, E element) {
        //Replaces the element at the specified position in this list with the specified element
        expansiveArray[index] = element;
    }

    private void resize() {
        //Creates a new copy of the old array with a new size
        size = size * 2;
        expansiveArray = Arrays.copyOf(expansiveArray, size);
    }

    public void clear(){
        //Removes all of the elements from this list
        expansiveArray = new Object[size];
    }

    public boolean isEmpty(){
        return capacity == 0;
    }

    public void remove(int index){
        //Removes the element at the specified position in this list
        

    }


}



