package simple;

public class array {
    public static void main(String[] args) {
        int[] arr= new int[5];
        for (int i=0;i<5;i++)
        {
            arr[i]=i;
        }
        for (int i=0;i<5;i++)
        {
            System.out.print(arr[i]+" ");
        }
        int[] arr1=new int[50];
        for(int i=0;i<arr1.length;i++) {
            arr1[i] = arr[i];
            arr=arr1;
        }
       // arr=arr1;
        for (int i=0;i<arr1.length;i++) {
            System.out.print(arr1[i]+" ");
        }
    }
}
