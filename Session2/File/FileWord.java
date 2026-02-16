package Session2.File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class FileWord {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        while(true) {
            options();
            System.out.println("Enter younr choice:");
            int choice = sc.nextInt();
            if(choice==1) {
                sc.nextLine();
                String sentence = sc.nextLine();
                for (char ch : sentence.toCharArray()) {
                    stack.push(ch);
                }
                saveFile(sentence);
            }
                else if(choice==2) {
                    String sentence="";
                    stack.pop();
                    for (char ch : stack) {
                        sentence+=ch;
                    }
                saveFile(sentence);
            }
                else {
                System.out.println("Exiting...");
                return;
            }

        }
    }

    private static void saveFile(String sentence) throws IOException {
        File file = new File("D:\\INTERN-J-26\\data.txt");
        FileWriter fw= new FileWriter(file);
        try {
            fw.write(sentence);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        fw.close();
    }

    private static void options() {
        System.out.println("Options:");
        System.out.println("1.Write");
        System.out.println("2.Undo");
        System.out.println("3.Exit");
    }
}
