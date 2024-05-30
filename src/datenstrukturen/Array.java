package datenstrukturen;

public class Array<E> {


    private E[] arr;
    private int size;

    public Array(E[] arr, int size) {
        this.arr = arr;
        this.size = size;
    }

    public E[] getArr() {
        return arr;
    }

    public void setArr(E[] arr) {
        this.arr = arr;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void add(E element) {
        arr[size] = element;
        size++;
    }

    public E get(int index) {
        return arr[index];
    }

    public void set(int index, E element) {
        arr[index] = element;
    }

    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    public int indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(E element) {
        for (int i = size - 1; i >= 0; i--) {
            if (arr[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }


}
