package Session2.list;

public class Main {
    public static void main(String[] args) {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);

//        node1.setNext(node2);
//        node2.setNext(node3);
//        node1.setNext(node2);
//        node2.setNext(node3);
//        node2.setPrev(node1);
//        node3.setPrev(node2);

        node1.setNext(node2);
        node2.setPrev(node1);

        node2.setNext(node3);
        node3.setPrev(node2);

        System.out.println("Before insertion..");
        print(node1);



        Node node4 = new Node(15);

        node4.setNext(node2);
        node4.setPrev(node1);

        node1.setNext(node4);
        node2.setPrev(node4);

        System.out.println("After insertion..");
        print(node1);
    }
    public static void print(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}

