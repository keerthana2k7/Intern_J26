package project.strategy;

import project.model.Expenses;
import project.model.Group;
import project.model.Users;

import java.util.Map;

public class ExactSplit implements SplitStrategy {

    @Override
    public void split(Expenses expense, Group group) {
        for (Map.Entry<Users, Double> entry : expense.getExpenses().entrySet()) {
            Users user = entry.getKey();
            double share = entry.getValue();
            group.getExpenses().put(user, group.getExpenses().get(user) + share);
        }
    }
}
