package simple;
public class exception {
        public static void main(String[] args) {
            try {
                int a = 10/0;
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero");
            }
           // System.out.println(a);
     }
}
