package project.model;
import project.enums.SplitType;

import java.util.HashMap;
public class Expenses {
    private int id_expense;
    private Users paid_user;
    private int group_id;
    private double amount;
    private SplitType splitType;
    private HashMap<Users, Double> expenses;
    private double numberOfUsers;

    public Expenses(/*,SplitType splitType*/) {
        this.id_expense = id_expense;
        this.paid_user = paid_user;
        this.group_id = group_id;
        this.amount = amount;
        this.splitType = splitType;
        this.expenses = new HashMap<>();
    }
    public int getId_expense() {
        return id_expense;
    }
    public Users getPaid_user() {
        return paid_user;
    }
    public int getGroup_id() {
        return group_id;
    }
    public double getAmount() {
        return amount;
    }
    /*public SplitType getSplitType() {
        return splitType;
    }*/
    public HashMap<Users, Double> getExpenses() {
        return expenses;
    }

    /*
    public void exactSplit(HashMap<Users, Double> userExpenses) {
        this.expenses = userExpenses;
    }

    public void addExpense(Users user, double expense) {
        this.expenses.put(user, expense);
    }
    public double getUserExpense(Users user) {
        return this.expenses.getOrDefault(user, 0.0);
    }
    public void removeExpense(Users user) {
        this.expenses.remove(user);
    }
    public void clearExpenses() {
        this.expenses.clear();
    }
    public int getNumberOfUsers() {
        return this.expenses.size();
    }
    public double getTotalExpenses() {
        double total = 0.0;
        for (double expense : this.expenses.values()) {
            total += expense;
        }
        return total;
    }
    public HashMap<Users, Double> getAllExpenses() {
        return this.expenses;
    }
    public void setSplitType(SplitType splitType) {
        this.splitType = splitType;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void setPaid_user(Users paid_user) {
        this.paid_user = paid_user;
    }
    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }
    public void setId_expense(int id_expense) {
        this.id_expense = id_expense;
    }
    public void printExpenses() {
        for (Users user : this.expenses.keySet()) {
            System.out.println("User: " + user.getName_user() + ", Expense: " + this.expenses.get(user));
        }
    }

     */

}
