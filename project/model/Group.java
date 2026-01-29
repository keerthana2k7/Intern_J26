package project.model;
import java.util.HashMap;
public class Group {
   private String id_group;
   private String name_group;
   private  HashMap<Users, Double> expenses;
    public Group(String id_group, String name_group) {
        this.id_group = id_group;
        this.name_group = name_group;
        this.expenses = new HashMap<>();
    }
    public String getId_group() {
        return id_group;
    }
    public String getName_group() {
        return name_group;
    }
    public HashMap<Users, Double> getExpenses() {
        return expenses;
    }
}
