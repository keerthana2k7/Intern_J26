package Session2.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileProblem {
    public static void main(String[] args) throws IOException {
        String filePath = "D:\\INTERN-J-26\\data.txt";
        try {
            FileReader fileReader = new FileReader(filePath);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(filePath);
            Scanner scanner = new Scanner(System.in);

            fileWriter.write("hi!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        fileWriter.close();
    }
}
