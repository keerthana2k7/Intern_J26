package project.model;
import project.enums.SplitType;
import java.util.HashMap;
public class Expenses {
    private int id_expense;
    private Users paid_user;
    private int group_id;
    private double amount;
    private SplitType SplitType;
    private HashMap<Users, Double> expenses;
}
