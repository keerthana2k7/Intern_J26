package project.strategy;

import project.model.Expenses;
import project.model.Group;
import project.model.Users;

public class EqualSplit implements SplitStrategy {

    @Override
    public void split(Expenses expense, Group group) {
        int totalUsers = group.getExpenses().size();
        double share = expense.getAmount() / totalUsers;

        for (Users user : group.getExpenses().keySet()) {
            group.getExpenses().put(user, group.getExpenses().get(user) + share);
        }
    }
}
