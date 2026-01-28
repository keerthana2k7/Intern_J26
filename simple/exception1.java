package simple;
import java.io.FileReader;
public class exception1 {
        public static void main(String[] args) {
            try {
                FileReader fr = new FileReader("text.txt");
            } catch (Exception e) {
                System.out.println("File not found");
            }
        }
}

