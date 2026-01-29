package simple.list;

public class Main {
    public static void main(String[] args) {
        CustomList list=new CustomList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.toString());
        list.removeByIndex(1);
        System.out.println(list.contains(3));
        list.printList();
    }
}
