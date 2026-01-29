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
    public Expenses(int id_expense, Users paid_user, int group_id, double amount, SplitType splitType) {
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
    public SplitType getSplitType() {
        return splitType;
    }
    public HashMap<Users, Double> getExpenses() {
        return expenses;
    }

}
