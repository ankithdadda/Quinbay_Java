package Employee_class;

import java.util.Arrays;
import java.text.ParseException;
import java.text.SimpleDateFormat;

class GenericMyList<T> {
    private T[] data;
    private int size;

    public GenericMyList() {
        data = (T[]) new Object[100];
        size = 0;
    }

    public void add(T value) {
        if (size == data.length) {
            growArray();
        }
        data[size++] = value;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[--size] = null;
        if (size < data.length / 2) {
            shrinkArray();
        }
    }

    public void deleteByValue(T value) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(value)) {
                deleteAtIndex(i);
                return;
            }
        }
        System.out.println("Value not found in the list");
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return data[index];
    }

    private void growArray() {
        data = Arrays.copyOf(data, data.length * 2);
    }

    private void shrinkArray() {
        if (data.length > 100) {
            data = Arrays.copyOf(data, Math.max(100, data.length / 2));
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

public class MyListTest {
    public static void main(String[] args) throws ParseException {
        GenericMyList<Employee> employeeList = new GenericMyList<>();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        employeeList.add(new Employee("E01", "Ankith", 21, sdf.parse("2022-01-15")));
        employeeList.add(new Employee("E02", "Hitesh", 22, sdf.parse("2023-01-15")));
        employeeList.add(new Employee("E03", "PC", 23, sdf.parse("2024-01-15")));

        System.out.println("Employee list:");
        employeeList.display();

        System.out.println("\nDeleting employee at index 1:");
        employeeList.deleteAtIndex(1);
        employeeList.display(); 

        System.out.println("\nDeleting employee by value (Charlie):");
        Employee charlie = new Employee("E03", "Charlie", 35, sdf.parse("2018-03-12"));
        employeeList.deleteByValue(charlie);
        employeeList.display();

        System.out.println("\nRetrieving employee at index 0:");
        Employee employee = employeeList.get(0);
        System.out.println("Retrieved employee: " + employee);
    }
}
