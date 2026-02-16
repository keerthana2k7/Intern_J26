package project.strategy;

import project.model.Expenses;
import project.model.Group;
import project.model.Users;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;


public class EqualSplit implements SplitStrategy {

    @Override
    public void split(Expenses expense, Group group) {
        int totalUsers = group.getExpenses().size();
        double share = expense.getAmount() / totalUsers;

        for (Users user : group.getExpenses().keySet()) {
            group.getExpenses().put(user, group.getExpenses().get(user) + share);
        }
        /*ExactSplit e = new ExactSplit();
        e.hashCode();*/
    }
}
