package simple.list;

public class CustomList {
    Object[] arr=new Object[10];
    int size =0;
    int element;
    public void add(int element) {
        if (size < arr.length) {
            arr[size] = element;
            size++;
        }
    }
    public void removeByIndex(int elemnet) {
        if (element >= 0 && element < size) {
            for (int i = element; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            size--;
        }
    }

    public boolean contains(int element) {
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public void printList() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
