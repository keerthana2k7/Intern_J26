package project.model;
public class Users {
   private int id_user;
   private String name_user;
   private double amount_spent;
   private double balance_amount;

    public Users() {
        this.id_user = 0;
        this.name_user = "";
        this.amount_spent = 0.0;
        this.balance_amount = 0.0;
    }

    public int getId_user() {
       return id_user;
   }
    public String getName_user() {
         return name_user;
    }
    public double getAmount_spent() {
         return amount_spent;
    }
    public double getBalance_amount() {
            return balance_amount;
    }
    public void setName_user(String name) { this.name_user = name; }
    public void setId_user(int id) { this.id_user = id; }

}
