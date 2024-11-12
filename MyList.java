class MyListStructure {
    private int[] data;
    private int size;

    public MyListStructure() {
        data = new int[100];
        size = 0;
    }

    public void add(int value) {
        if (size == data.length) {
            growArray();
        }
        data[size++] = value;
    }

    public void deleteAtIndex(int index) {
        if (index<0 || index>=size) {
            throw new IndexOutOfBoundsException("Index out of bound");
        }
        for (int i=index; i<size-1; i++) {
            data[i] = data[i+1];
        }
        size--;
        if (size< data.length/2) {
            shrinkArray();
        }
    }

    public void deleteByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (data[i] == value) {
                deleteAtIndex(i);
                return;
            }
        }
        System.out.println("Value not found in the list");
    }

    public int get(int index) {
        if (index<0 || index>=size) {
            throw new IndexOutOfBoundsException("Index out of bound");
        }
        return data[index];
    }

    private void growArray() {
        int[] newData = new int[data.length * 2];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }

    private void shrinkArray() {
        if (data.length > 100) {
            int newCapacity = Math.max(100, data.length / 2);
            int[] newData = new int[newCapacity];
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }

    public int size() {
        return size;
    }

    public void display() {
        System.out.print("MyList: ");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}

public class MyList{
    public static void main(String[] args) {
        MyListStructure myList = new MyListStructure();

        System.out.println("Adding elements from 0 to 9:");
        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }
        myList.display();

        System.out.println("\nDeleting element at index 4:");
        myList.deleteAtIndex(4);
        myList.display();

        System.out.println("\nDeleting element with value 7:");
        myList.deleteByValue(7);
        myList.display();

        System.out.println("\nTrying to delete value 15 (not in list):");
        myList.deleteByValue(15);

        System.out.println("\nRetrieving element at index 3:");
        System.out.println("Element at index 3: " + myList.get(3)); // Expected: 3

        System.out.println("\nAdding elements 10 to 20 to enable array growth:");
        for (int i = 10; i <= 20; i++) {
            myList.add(i);
        }
        myList.display();

        System.out.println("\nDeleting several elements to enable array shrinking:");
        for (int i = 0; i < 15; i++) {
            myList.deleteAtIndex(0); 
        }
        myList.display();
    }
}


