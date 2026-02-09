package project;

import project.enums.SplitType;
import project.model.Expenses;
import project.model.Group;
import project.model.Users;
import project.service.ExpenseServiceIm;
import project.strategy.EqualSplit;
import project.strategy.ExactSplit;
import project.strategy.SplitStrategy;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Create Users
        Users user1 = new Users();
        user1.setId_user(1);
        user1.setName_user("Alice");

        Users user2 = new Users();
        user2.setId_user(2);
        user2.setName_user("Bob");

        Users user3 = new Users();
        user3.setId_user(3);
        user3.setName_user("Charlie");

        // Create Group
        Group group1 = new Group();
        group1.getExpenses().put(user1, 0.0);
        group1.getExpenses().put(user2, 0.0);
        group1.getExpenses().put(user3, 0.0);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total expense amount:");
        double amount = sc.nextDouble();

        System.out.println("Choose split method:\n1. Equal Split\n2. Exact Split");
        int choice = sc.nextInt();

        SplitStrategy strategy = null;
        SplitType splitType = null;

        if (choice == 1) {
            strategy = new EqualSplit();
            splitType = SplitType.EQUAL;
        } else if (choice == 2) {
            strategy = new ExactSplit();
            splitType = SplitType.EXACT;
        } else {
            System.out.println("Invalid choice!");
            return;
        }

        // Create Expense
        Expenses expense = new Expenses(1, user1, 101, amount, splitType);

        // If Exact Split → Take custom shares
        if (splitType == SplitType.EXACT) {
            HashMap<Users, Double> userShares = new HashMap<>();

            System.out.println("Enter share for Alice:");
            userShares.put(user1, sc.nextDouble());

            System.out.println("Enter share for Bob:");
            userShares.put(user2, sc.nextDouble());

            System.out.println("Enter share for Charlie:");
            userShares.put(user3, sc.nextDouble());

            expense.getExpenses().putAll(userShares);
        }

        // Process Expense
        ExpenseServiceIm service = new ExpenseServiceIm();
        service.processExpense(strategy, expense, group1);

        // Show Results
        System.out.println("\nFinal Split in Group:");
        for (Map.Entry<Users, Double> entry : group1.getExpenses().entrySet()) {
            System.out.println(entry.getKey().getName_user() + " owes: " + entry.getValue());
        }

        sc.close();
    }
}
