package project;
import project.enums.SplitType;
import project.model.Users;
import project.model.Group;
import project.strategy.EqualSplit;
import project.strategy.ExactSplit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Users user1 = new Users();
        Users user2 = new Users();
        Users user3 = new Users();

        Group group1=new Group();

        group1.getExpenses().put(user1,0.00);
        group1.getExpenses().put(user2,0.00);
        group1.getExpenses().put(user3,0.00);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter split method number:\n 1. Equal Split 2. Exact Split");
        int choice = sc.nextInt();

        /*ExactSplit exactSplit=new ExactSplit();
        EqualSplit equalSplit=new EqualSplit();*/

        while(true) {

            switch(choice) {
                case 1:
                    //equalSplit.splitExpense(SplitType.EQUAL);
                    break;
                case 2:
                    //exactSplit.splitExpense(SplitType.EXACT);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
