package Session2.list;

public class ArrayProblem {
    public static void main(String[] args) {
        int [] arr = new int [5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        printArray(arr);
    }
    private static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}
