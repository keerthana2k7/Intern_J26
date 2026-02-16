package Session2.stack;

public class Stack {
        private int[] arr;
        private int top;
        private int capacity;

        public Stack(int size) {
            capacity = size;
            arr = new int[capacity];
            top = -1;
        }
        public void push(int value) {
            if (top == capacity - 1) {
                System.out.println("Stack Overflow");
                return;
            }
            arr[++top] = value;
        }
        public int pop() {
            if (top == -1) {
                System.out.println("Stack Underflow");
                return -1;
            }
            return arr[top--];
        }

        public int peek() {
            if (top == -1) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[top];
        }

        public static void main(String[] args) {

            Stack stack = new Stack(5);

            stack.push(1);
            stack.push(2);
            stack.push(3);

            stack.pop();

            System.out.println(stack.peek());
        }
    }




